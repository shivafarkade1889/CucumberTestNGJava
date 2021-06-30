package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class MyStepDefinations {
	
	public WebDriver driver;
	
	@Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		driver = Base.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^User searched for \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	Thread.sleep(3000);
    }


	@Then("^\"([^\"]*)\" results are Displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	String productName= driver.findElement(By.xpath("//h4[@class='product-name']")).getText();
    	if(productName.contains(strArg1)) {
    		System.out.println("Product matched : ");
    	}
    	else {
    		System.out.println("Product not matched : ");
    	}
    }
	
	
	@Then("^Verify that selected \"([^\"]*)\" items are displayed in checkout page$")
    public void verify_that_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
       String productName = driver.findElement(By.xpath("//table/tbody/tr/td[2]/p")).getText();
       if(productName.contains(strArg1)) {
    	   System.out.println("Product matched : ");
   	}
   	else {
   		System.out.println("Product not matched : ");
   	
       }
    }

    @And("^Add itmes to the Cart$")
    public void add_itmes_to_the_cart() throws Throwable {
      driver.findElement(By.xpath("//a[@class='increment']")).click();
      driver.findElement(By.xpath("//div[@class='product-action']//button[@type='button']")).click();
      Thread.sleep(3000);
    }

    @And("^User processed to the checkout page$")
    public void user_processed_to_the_checkout_page() throws Throwable {
    	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
    	driver.findElement(By.xpath("//div[@class='cart-preview active']//button[@type='button']")).click();
    	Thread.sleep(3000);
    }

}

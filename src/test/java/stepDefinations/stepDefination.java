package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^Browser is getting statred$")
    public void browser_is_getting_statred() throws Throwable {
        System.out.println("browser_is_getting_statred");
    }

    @When("^Browser is launched$")
    public void browser_is_launched() throws Throwable {
        System.out.println("browser_is_launched");
    }

    @Then("^Validate Browser is up and running$")
    public void validate_browser_is_up_and_running() throws Throwable {
       System.out.println("validate_browser_is_up_and_running");
    }

	
	@Given("^User is on NetBanking landing page$")
	public void User_is_on_NetBanking_landing_page() {
		System.out.println("Given");
	}
	/*
	@When("^User login into application with username and password$")
	public void User_login_into_application_with_username_and_password() {
		System.out.println("When");
	}*/
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
    }
	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("Then");
	}
	@And("^Cards are displayed$")
	public void Cards_are_displayed() {
		System.out.println("And");
	}
	@And("^Cards are not displayed$")
    public void cards_are_not_displayed() throws Throwable {
		System.out.println("cards_are_not_displayed");
    }

	@When("^User sign up with required details$")
    public void user_sign_up_with_required_details(DataTable data) throws Throwable {
        List<String> obj =data.asList();
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
	
	
	@When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

}

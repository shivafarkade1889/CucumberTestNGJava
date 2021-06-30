package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;

public class Hooks extends Base{

	@After("@SeleniumTest")
	public void tearDown() {
		driver.quit();
	}
	
	@After("@SeleniumTest1")
	public void tearDown1() {
		driver.quit();
	}
	
}

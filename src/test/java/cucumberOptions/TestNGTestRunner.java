package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src/test/java/features",
		glue="stepDefinations",tags="@SeleniumTest",
				plugin= {"pretty","html:target/Cucumber.html","json:target/Cucumber.json",
		"junit:target/Cucumber.xml"}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}

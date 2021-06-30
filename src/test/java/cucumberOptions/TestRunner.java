package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features",dryRun=true,
		glue="stepDefinations", stepNotifications=true,monochrome=true,
		tags="@RegressionTest and @SmokeTest",
		plugin= {"pretty","html:target/Cucumber.html","json:target/Cucumber.json",
				"junit:target/Cucumber.xml"}
		)
public class TestRunner {

}

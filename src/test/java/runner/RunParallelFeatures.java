package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {
				"json:target/cucumber-reports/cucumber.json",
				"pretty",
				"html:target/cucumber-reports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		features = {"src/test/resources/features/"},
		glue = "steps",
		monochrome = true
		)
public class RunParallelFeatures extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
          return super.scenarios();
    }
	
}

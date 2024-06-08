package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/featurefiles",
		glue={"stepdefinitions"},
		plugin= {"pretty","html:target/report.html","json:target/report.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	

}

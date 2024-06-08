package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdef_demo {
	
	@Given("start the script")
	public void start_the_script() {
		System.out.println("Script execution started");
	}

	@And("script execution is in progress")
	public void script_execution_is_in_progress() {
		System.out.println("Script execution in progress");
	}

	@Then("execution completed")
	public void execution_completed() {
		System.out.println("Script execution completed");
	}

}

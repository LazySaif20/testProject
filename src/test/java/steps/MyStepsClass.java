package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsClass {
	
	@Given("we have the url")
	public void we_have_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("We have the url");
	}

	@When("we do GET")
	public void we_do_get() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("we do GET");
	}

	@Then("vaidate the response code is {int}")
	public void vaidate_the_response_code_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validating Response");
	}

}

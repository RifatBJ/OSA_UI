package com.osa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	   System.out.println("Given"); 
	}

	@And("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		 System.out.println("And 1"); 
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		 System.out.println("When 1"); 
	}

	@And("^some other action$")
	public void some_other_action() throws Throwable {
		 System.out.println("And 2"); 
	}

	@And("^yet another action$")
	public void yet_another_action() throws Throwable {
		 System.out.println("And 3"); 
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		 System.out.println("Then 1");
	}

	@And("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		 System.out.println("And 4"); 
	}
}

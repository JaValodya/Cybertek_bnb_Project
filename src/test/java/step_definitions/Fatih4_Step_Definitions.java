package step_definitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fatih4_Step_Definitions {
	
	@Given("As a qa_user I logged into cybertekbnb database")
	public void as_a_qa_user_I_logged_into_cybertekbnb_database() {
		
	    throw new PendingException();
	}

	@When("I sent {string} query")
	public void i_sent_query(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("Number of rooms would be {int}")
	public void number_of_rooms_would_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
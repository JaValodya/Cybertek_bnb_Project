package step_definitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fatih4_Step_Definitions {
	
	@Given("As a qa_user I logged into cybertekbnb database")
	public void as_a_qa_user_I_logged_into_cybertekbnb_database() {
		Connection connection = DriverManager.getConnection(oracleDbUrl, oracleDbUsername, oracleDbPassword);
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet = statement.executeQuery("select * from jobs");
		
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

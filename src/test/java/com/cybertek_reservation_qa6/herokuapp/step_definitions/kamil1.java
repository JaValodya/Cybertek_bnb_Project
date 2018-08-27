package com.cybertek_reservation_qa6.herokuapp.step_definitions;

import org.openqa.selenium.interactions.Actions;

import com.cybertek_reservation_qa6.herokuapp.pages.HomePage;
import utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class kamil1 {
	
	HomePage hp = new HomePage();
	
	@When("the user hover over to my page")
	 public void the_user_hover_over_to_my_page() throws InterruptedException {
		 	// Actions action = new Actions(Driver.getDriver());
			// action.moveToElement(hp.myLink).build().perform();
			 //hp.myLink.click();
		
			Thread.sleep(2000);
			 Actions action = new Actions(Driver.getDriver());
			 action.moveToElement(hp.myLink).build().perform();
			// action.moveByOffset(1, 1).build().perform();
		 
	 }

	 @When("the user clicks the team")
	 public void the_user_clicks_the_team() {
	 
		 hp.teamItem.click();
	 }
	//
	 @Then("team informations should be visible")
	 public void team_informations_should_be_visible() {
	 
		 
		 
		 
	 }
	//
	// @When("the user clicks the self")
	// public void the_user_clicks_the_self() {
	// // Write code here that turns the phrase above into concrete actions
	// throw new PendingException();
	// }
	//
	// @Then("personal informations should be visible")
	// public void personal_informations_should_be_visible() {
	// // Write code here that turns the phrase above into concrete actions
	// throw new PendingException();
	// }
}

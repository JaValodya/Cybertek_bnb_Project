package com.cybertek_reservation_qa6.herokuapp.step_definitions;

import org.openqa.selenium.interactions.Actions;

import com.cybertek_reservation_qa6.herokuapp.pages.HomePage;
import com.cybertek_reservation_qa6.herokuapp.pages.HuntPage;
import com.cybertek_reservation_qa6.herokuapp.pages.SignInPage;
import com.cybertek_reservation_qa6.herokuapp.utilities.ConfigurationReader;
import com.cybertek_reservation_qa6.herokuapp.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class kamil_StepDefs {

	HomePage hp = new HomePage();
	HuntPage huntpg = new HuntPage();
	
	
	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		SignInPage signin = new SignInPage();
		signin.username.sendKeys(ConfigurationReader.getProperty("student_user_name"));
		signin.password.sendKeys(ConfigurationReader.getProperty("student_password"));
		signin.signInButton.click();
	}

	@When("the user goes to hunt page")
	public void the_user_goes_to_hunt_page() throws InterruptedException {

		
		Thread.sleep(2000);

		hp.huntLink.click();

	}

	@Then("the till {int}\\/{int} is visible")
	public void the_till_is_visible(Integer int1, Integer int2) {
	
		
	System.out.println(huntpg.tillDate.toString());
	
		 
	 }
	
	 

}

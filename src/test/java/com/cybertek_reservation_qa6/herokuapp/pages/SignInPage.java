package com.cybertek_reservation_qa6.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek_reservation_qa6.herokuapp.utilities.Driver;

public class SignInPage {

		public SignInPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
	
		@FindBy (xpath = "//input[@name='email']")
		public WebElement username;
		
		@FindBy(xpath = "//input[@name='password']")
		public WebElement password;
		
		@FindBy (xpath = "//button[@class='button is-dark']")
		public WebElement signInButton;
		
		
}

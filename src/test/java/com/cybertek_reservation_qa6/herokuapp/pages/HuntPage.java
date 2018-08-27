package com.cybertek_reservation_qa6.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HuntPage {
	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//input[@class='input ng-dirty ng-valid ng-touched']")
	public WebElement calender;
	
	@FindBy(xpath = "//h2[.='till 9/1']")
	public WebElement tillDate;
	
	
	

}

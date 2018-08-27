package com.cybertek_reservation_qa6.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {
	
	public HomePage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath ="//div[@class='navbar-end']//div[@class='navbar-item has-dropdown is-hoverable']")
	public WebElement myLink;
	
	@FindBy (xpath = "//a[@href='/me']")
	public WebElement meItem;
	
	@FindBy (xpath = "//a[@href='/team']")
	public WebElement teamItem;
	
	@FindBy (xpath = "//a[.='hunt']")
	public WebElement huntLink;
	
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Meru_Page {
	public Meru_Page() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy(xpath="/html/body/app-root/div/app-room-schedule-page/div/div/div/div[1]/div/div/div[1]/div[1]/figure/img")
	public WebElement roomCapacity_Meru;
	

}

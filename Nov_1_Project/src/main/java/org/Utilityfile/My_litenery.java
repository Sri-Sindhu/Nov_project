package org.Utilityfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_litenery {
	
	public WebDriver driver;

	@FindBy(xpath="//a[.='Booked Itinerary']")
	//@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement my_litenery;
	
	public My_litenery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public WebDriver getDriver() {
		return driver;
	}*/

	public WebElement getMy_litenery() {
		return my_litenery;
	}



}

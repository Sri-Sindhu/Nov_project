package org.Utilityfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Contiune3 {

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement select_Click;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement select_Continue;

	public Click_Contiune3(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect_Click() {
		return select_Click;
	}

	public WebElement getSelect_Continue() {
		return select_Continue;
	}
	
	

}

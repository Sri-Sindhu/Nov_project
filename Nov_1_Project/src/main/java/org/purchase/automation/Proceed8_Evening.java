package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed8_Evening {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Previous']//following::button[@name='processAddress']")
	private WebElement proceed;

	public Proceed8_Evening(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}


}

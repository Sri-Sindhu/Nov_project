package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed9_Evening {
	
	public WebDriver driver;

	@FindBy(xpath = "//p[@class='checkbox']//following::input[@id='cgv']")
	private WebElement agree;

	@FindBy(xpath = "//a[@title='Previous']//following::button[@type='submit']")
	private WebElement proceed;

	public  Proceed9_Evening(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getProceed() {
		return proceed;
	}


}

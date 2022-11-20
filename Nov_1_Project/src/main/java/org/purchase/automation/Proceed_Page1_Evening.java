package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Page1_Evening {
	
	public WebDriver driver;

	@FindBy(xpath = "//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Proceed_Page1_Evening(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}


}

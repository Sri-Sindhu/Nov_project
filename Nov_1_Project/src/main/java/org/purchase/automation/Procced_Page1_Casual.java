package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Procced_Page1_Casual {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Procced_Page1_Casual(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}

}

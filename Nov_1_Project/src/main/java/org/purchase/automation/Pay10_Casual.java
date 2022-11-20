package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay10_Casual {
	
	public WebDriver driver;

	@FindBy(xpath = "//p[@class='payment_module']//child::a")
	private WebElement pay;

	public Pay10_Casual(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getPay() {
		return pay;
	}

}

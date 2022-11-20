package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_To_Order_Casual {

	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back_to_order;

	public Back_To_Order_Casual(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getBack_to_order() {
		return back_to_order;
	}

}

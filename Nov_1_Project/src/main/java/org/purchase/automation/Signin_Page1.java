package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page1 {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='header_user_info']//child::a")
	private WebElement signin;

	public Signin_Page1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getSignin() {
		return signin;
	}

}

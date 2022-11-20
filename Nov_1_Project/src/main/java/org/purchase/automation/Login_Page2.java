package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page2 {

	public WebDriver driver;

	@FindBy(xpath = "//label[text()='Email address']//following-sibling::input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//p[@class='lost_password form-group']//preceding::input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='back']//following-sibling::button[@id='SubmitLogin']")
	private WebElement signin_click;

	public Login_Page2(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_click() {
		return signin_click;
	}

}

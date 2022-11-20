package org.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Email {

	public WebDriver driver;

	@FindBy(xpath = "//label[text()='Email address']//following-sibling::input[@id='email_create']")
	private WebElement email;

	@FindBy(xpath = "//div[@class='submit']//ancestor::button")
	private WebElement create_acc;

	public Login_Email(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreate_acc() {
		return create_acc;
	}
}
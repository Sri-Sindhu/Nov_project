package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Causual_Dress {

	public WebDriver driver;

	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='Dresses']")
	private WebElement dress;

	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='Casual Dresses']")
	private WebElement causual;

	public Causual_Dress(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getCausual() {
		return causual;
	}

}

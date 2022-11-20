package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Outfit {
	
	public WebDriver driver;

	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='Dresses']")
	private WebElement dress;

	@FindBy(xpath = "//li[@id='category-thumbnail']//following::a[@title='Summer Dresses']")
	private WebElement summer;

	public Summer_Outfit(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getSummer() {
		return summer;
	}


}

package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Image_Evening {
	
	public WebDriver driver;

	@FindBy(xpath = "//div[@class='product-image-container']//descendant::img")
	private WebElement image;

	public Image_Evening(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getImage() {
		return image;
	}


}

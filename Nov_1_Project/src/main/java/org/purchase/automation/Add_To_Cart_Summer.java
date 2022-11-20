package org.purchase.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cart_Summer {
	
	public WebDriver driver;

	@FindBy(xpath = "//p[@id='quantity_wanted_p']//child::input")
	private WebElement quanty;

	@FindBy(xpath = "//p[@id='quantity_wanted_p']//child::input")
	private WebElement quanty1;

	@FindBy(xpath = "//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//div[@class='attribute_list']//preceding-sibling::a[@title='Blue']")
	private WebElement color;


	@FindBy(xpath = "//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']")
	private WebElement cart;

	public Add_To_Cart_Summer(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getQuanty() {
		return quanty;
	}

	public WebElement getQuanty1() {
		return quanty1;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart() {
		return cart;
	}



}

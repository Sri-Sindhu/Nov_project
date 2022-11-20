package org.Utilityfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastnmame;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardnumber;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement creditcard;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement years;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement ccv_no;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book;


	public Book_Now(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastnmame() {
		return lastnmame;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYears() {
		return years;
	}

	public WebElement getCcv_no() {
		return ccv_no;
	}

	public WebElement getBook() {
		return book;
	}

}

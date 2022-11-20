package org.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Acc3 {

	public WebDriver driver;

	@FindBy(xpath = "//div[@id='uniform-id_gender2']//descendant::input")
	private WebElement gender;

	@FindBy(xpath = "//label[@for='customer_firstname']//following-sibling::input[@id='customer_firstname']")
	private WebElement firstname;

	@FindBy(xpath = "//label[@for='customer_lastname']//following-sibling::input")
	private WebElement lastname;

	@FindBy(xpath = "//label[@for='passwd']//following-sibling::input")
	private WebElement password;

	@FindBy(xpath = "//div[@id='uniform-days']//child::select")
	private WebElement date;

	@FindBy(xpath = "//div[@id='uniform-months']//child::select")
	private WebElement month;

	@FindBy(xpath = "//div[@id='uniform-years']//child::select")
	private WebElement year;

	@FindBy(xpath = "//div[@id='uniform-newsletter']//child::input")
	private WebElement signupbox;

	@FindBy(xpath = "//div[@id='uniform-optin']//child::input")
	private WebElement receivebox;

	@FindBy(xpath = "//label[text()='Company']//following-sibling::input")
	private WebElement company;

	@FindBy(xpath = "//label[@for='address1']//following-sibling::input")
	private WebElement address1;

	@FindBy(xpath = "//label[@for='address2']//following-sibling::input")
	private WebElement address2;

	@FindBy(xpath = "//label[@for='city']//following-sibling::input")
	private WebElement city;

	@FindBy(xpath = "//div[@class='selector']//child::select[@id='id_state']")
	private WebElement state;

	@FindBy(xpath = "//label[@for='postcode']//following-sibling::input")
	private WebElement zipcode;

	@FindBy(xpath = "//div[@class='selector']//child::select[@id='id_country']")
	private WebElement country;

	@FindBy(xpath = "//label[@for='other']//following-sibling::textarea")
	private WebElement info;

	@FindBy(xpath = "//label[@for='phone']//following-sibling::input")
	private WebElement homephone;

	@FindBy(xpath = "//label[@for='phone_mobile']//following-sibling::input")
	private WebElement mobilephone;

	@FindBy(xpath = "//div[@class='submit clearfix']//child::button")
	private WebElement register;

	public Create_Acc3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getSignupbox() {
		return signupbox;
	}

	public WebElement getReceivebox() {
		return receivebox;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getHomephone() {
		return homephone;
	}

	public WebElement getMobilephone() {
		return mobilephone;
	}

	public WebElement getRegister() {
		return register;
	}

}

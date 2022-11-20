package org.Utilityfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Adacatin {

	public WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement select_location1;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Select_Hotel1;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement select_Roomtype1;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement select_number;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement select_date;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement select_outdate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement select_adults;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement Select_children;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement select_search;

	public Search_Hotel_Adacatin(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect_location1() {
		return select_location1;
	}

	public WebElement getSelect_Hotel1() {
		return Select_Hotel1;
	}

	public WebElement getSelect_Roomtype1() {
		return select_Roomtype1;
	}

	public WebElement getSelect_number() {
		return select_number;
	}

	public WebElement getSelect_date() {
		return select_date;
	}

	public WebElement getSelect_outdate() {
		return select_outdate;
	}

	public WebElement getSelect_adults() {
		return select_adults;
	}

	public WebElement getSelect_children() {
		return Select_children;
	}

	public WebElement getSelect_search() {
		return select_search;
	}

}
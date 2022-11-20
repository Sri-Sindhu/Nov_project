package org.annotation;

import org.Utilityfile.Base_Class;
import org.Utilityfile.Page_Object_Manager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Adactin_TestNG extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome"); // 74 lines

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@BeforeClass
	private void Sessioncreate() {
		get_Url("http://www.adactinhotelapp.com/");
		System.out.println("Adactin session is opened");
	}

	@Test(priority = -3)
	public void homepage() {
		sendkeys(pom.getHomepg().getUsername(), "AdamBala");
		sendkeys(pom.getHomepg().getPassword(), "281026");
		click_on_element(pom.getHomepg().getLogin());
		System.out.println("Signin page created");
	}

	@Test(priority = -2)
	public void hotel() {
		select_By_Visible_Text(pom.getSearch().getSelect_location1(), "Paris");
		select_By_Index(pom.getSearch().getSelect_Hotel1(), 3);
		select_By_Visible_Text(pom.getSearch().getSelect_Roomtype1(), "Deluxe");
		select_By_Index(pom.getSearch().getSelect_number(), 2);
		sendkeys(pom.getSearch().getSelect_date(), "10/03/2020");
		sendkeys(pom.getSearch().getSelect_outdate(), "19/07/2020");
		select_By_Index(pom.getSearch().getSelect_adults(), 1);
		select_By_Index(pom.getSearch().getSelect_children(), 1);
		click_on_element(pom.getSearch().getSelect_search());
		click_on_element(pom.getNext().getSelect_Click());
		click_on_element(pom.getNext().getSelect_Continue());
		System.out.println("hotel selected");
	}

	@Test(priority = -1, dependsOnMethods = "hotel")
	public void booking() {
		sendkeys(pom.getBook().getFirstname(), "Adam");
		sendkeys(pom.getBook().getLastnmame(), "Bala");
		sendkeys(pom.getBook().getAddress(), "N0:6, Gandhi street,chennai");
		sendkeys(pom.getBook().getCardnumber(), "4321098765654321");
		select_By_Visible_Text(pom.getBook().getCreditcard(), "VISA");
		select_By_Visible_Text(pom.getBook().getMonth(), "May");
		select_By_Visible_Text(pom.getBook().getYears(), "2016");
		sendkeys(pom.getBook().getCcv_no(), "2601");
		click_on_element(pom.getBook().getBook());
	}
	@Test
	public void litenary() {
		move_to_element(driver, pom.getClick().getMy_litenery());
		click_on_element(pom.getClick().getMy_litenery());
		System.out.println("Litenary is click");
	}
@Test(priority = 1)
public void log() {
		click_on_element(pom.getLogout().getBox_Click());

		click_on_element(pom.getLogout().getLogout());

		System.out.println("Logout the adactin page");
	}


	@AfterClass
	public void sessionclose() {
		System.out.println("Adactin session closed");
	}

}

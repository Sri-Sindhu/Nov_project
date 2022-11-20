package org.Nov_1_Project;

import java.io.IOException;
import java.time.Duration;
import org.Utilityfile.Base_Class;
import org.Utilityfile.Page_Object_Manager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Adacatin_Page_Obj_Manager_Runner extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome"); // 74 lines

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static Logger log = Logger.getLogger(Adacatin_Page_Obj_Manager_Runner.class);

	public static void main(String[] args) throws IOException {

		PropertyConfigurator.configure("log4j.properties");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		get_Url("http://www.adactinhotelapp.com/");

		log.info("Session created");

		sendkeys(pom.getHomepg().getUsername(), "AdamBala");

		sendkeys(pom.getHomepg().getPassword(), "281026");

		click_on_element(pom.getHomepg().getLogin());

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

		sendkeys(pom.getBook().getFirstname(), "Adam");

		sendkeys(pom.getBook().getLastnmame(), "Bala");

		sendkeys(pom.getBook().getAddress(), "N0:6, Gandhi street,chennai");

		sendkeys(pom.getBook().getCardnumber(), "4321098765654321");

		select_By_Visible_Text(pom.getBook().getCreditcard(), "VISA");

		select_By_Visible_Text(pom.getBook().getMonth(), "May");

		select_By_Visible_Text(pom.getBook().getYears(), "2016");

		sendkeys(pom.getBook().getCcv_no(), "2601");

		click_on_element(pom.getBook().getBook());

		click_on_element(pom.getClick().getMy_litenery());

		click_on_element(pom.getLogout().getBox_Click());

		click_on_element(pom.getLogout().getLogout());

		 log.info("Session end");

	}

}

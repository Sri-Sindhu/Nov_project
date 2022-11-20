package org.Nov_1_Project;

import java.io.IOException;
import java.time.Duration;

import org.Utilityfile.Base_Class;
import org.Utilityfile.Page_Object_Manager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.reader.properties.Filereader_Manager;

public class Adactin_Read_Singleton extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome"); // 74 lines

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static Logger log = Logger.getLogger(Adacatin_Page_Obj_Manager_Runner.class);

	public static void main(String[] args) throws IOException {

		PropertyConfigurator.configure("log4j.properties");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		get_Url("http://www.adactinhotelapp.com/");

		log.info("Session created");

		String username = Filereader_Manager.getInstanceFR().getInstanceTD().getusername();

		sendkeys(pom.getHomepg().getUsername(), username);

		String password = Filereader_Manager.getInstanceFR().getInstanceTD().getpassword();

		sendkeys(pom.getHomepg().getPassword(), password);

		click_on_element(pom.getHomepg().getLogin());
		
		String location = Filereader_Manager.getInstanceFR().getInstanceTD().getlocation();

		select_By_Visible_Text(pom.getSearch().getSelect_location1(), location);
		
		select_By_Index(pom.getSearch().getSelect_Hotel1(), 3);
		
		String roomtype = Filereader_Manager.getInstanceFR().getInstanceTD().getroom();

		select_By_Visible_Text(pom.getSearch().getSelect_Roomtype1(), roomtype);

		select_By_Index(pom.getSearch().getSelect_number(), 2);

		String datein = Filereader_Manager.getInstanceFR().getInstanceTD().getdatein();

		sendkeys(pom.getSearch().getSelect_date(), datein);

		String dateout = Filereader_Manager.getInstanceFR().getInstanceTD().getdateout();

		sendkeys(pom.getSearch().getSelect_outdate(), dateout);

		select_By_Index(pom.getSearch().getSelect_adults(), 1);

		select_By_Index(pom.getSearch().getSelect_children(), 1);

		click_on_element(pom.getSearch().getSelect_search());

		click_on_element(pom.getNext().getSelect_Click());

		click_on_element(pom.getNext().getSelect_Continue());

		String firstname = Filereader_Manager.getInstanceFR().getInstanceTD().getfirstname();

		sendkeys(pom.getBook().getFirstname(), firstname);

		String lastname = Filereader_Manager.getInstanceFR().getInstanceTD().getlastname();

		sendkeys(pom.getBook().getLastnmame(), lastname);

		String address = Filereader_Manager.getInstanceFR().getInstanceTD().getaddress();

		sendkeys(pom.getBook().getAddress(), address);

		String cardno = Filereader_Manager.getInstanceFR().getInstanceTD().getcardno();

		sendkeys(pom.getBook().getCardnumber(), cardno);

		String creditcard = Filereader_Manager.getInstanceFR().getInstanceTD().getcreditcard();

		select_By_Visible_Text(pom.getBook().getCreditcard(), creditcard);

		String month = Filereader_Manager.getInstanceFR().getInstanceTD().getmonth();

		select_By_Visible_Text(pom.getBook().getMonth(), month);

		String year = Filereader_Manager.getInstanceFR().getInstanceTD().getyear();

		select_By_Visible_Text(pom.getBook().getYears(), year);

		String ccvno = Filereader_Manager.getInstanceFR().getInstanceTD().getccvno();

		sendkeys(pom.getBook().getCcv_no(), ccvno);

		click_on_element(pom.getBook().getBook());

		click_on_element(pom.getClick().getMy_litenery());

		click_on_element(pom.getLogout().getBox_Click());

		click_on_element(pom.getLogout().getLogout());

		log.info("Session end");

	}

}

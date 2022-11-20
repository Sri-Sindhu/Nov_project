package org.Automation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.WebDriver;  //78---->72lines

public class Automation_Page_obj_Manager_Runner extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Obj_Manager_Auto auto = new Page_Obj_Manager_Auto(driver);

	public static void main(String[] args) throws InterruptedException {

		maximize();

		get_Url("http://automationpractice.com/index.php");
		
		click_on_element(auto.getClicksignin().getSignin());

		sendkeys(auto.getAcc().getEmail(), "aru65@gmail.com");

		click_on_element(auto.getAcc().getCreate_acc());

		sleep(8000);
//
		click(driver, auto.getRegister_details().getGender());

		sleep(8000);

		sendkeys(auto.getRegister_details().getFirstname(), "Sri");

		sendkeys(auto.getRegister_details().getLastname(), "Devi");

		sendkeys(auto.getRegister_details().getPassword(), "65873");

		select_By_Index(auto.getRegister_details().getDate(), 26);

		select_By_Index(auto.getRegister_details().getMonth(), 4);

		select_By_Value(auto.getRegister_details().getYear(), "1982");

		click_on_element(auto.getRegister_details().getSignupbox());

		click_on_element(auto.getRegister_details().getReceivebox());

		sleep(8000);

		sendkeys(auto.getRegister_details().getCompany(), "HCL");

		sendkeys(auto.getRegister_details().getAddress1(), "Hcl company");

		sendkeys(auto.getRegister_details().getAddress2(), "3rd Floor");

		sendkeys(auto.getRegister_details().getCity(), "Chennai");

		select_By_Visible_Text(auto.getRegister_details().getState(), "Indiana");

		sendkeys(auto.getRegister_details().getZipcode(), "00000");

		select_By_Visible_Text(auto.getRegister_details().getCountry(), "United States ");

		sendkeys(auto.getRegister_details().getInfo(), "Reg is done");

		sendkeys(auto.getRegister_details().getHomephone(), "4567890453");

		sendkeys(auto.getRegister_details().getMobilephone(), "9876423219");

		click_on_element(auto.getRegister_details().getRegister());

	}

}

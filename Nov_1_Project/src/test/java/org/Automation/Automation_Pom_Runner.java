package org.Automation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.WebDriver;   
   //99 previous lines----->76 this page line

public class Automation_Pom_Runner extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome");
	
	public static My_Store signin = new My_Store(driver);

	public static Login_Email acc = new Login_Email(driver);

	public static Create_Acc3 register_details = new Create_Acc3(driver);

	public static void main(String[] args) throws InterruptedException {
		
		maximize();
		
		get_Url("http://automationpractice.com/index.php");

		click_on_element(signin.getSignin());

		sendkeys(acc.getEmail(), "ashj9@gmail.com");

		click_on_element(acc.getCreate_acc());
		
		sleep(8000);

		click(driver, register_details.getGender());

		sleep(8000);

		sendkeys(register_details.getFirstname(), "Sri");

		sendkeys(register_details.getLastname(), "Devi");

		sendkeys(register_details.getPassword(), "65873");

		select_By_Index(register_details.getDate(), 26);

		select_By_Index(register_details.getMonth(), 4);

		select_By_Value(register_details.getYear(), "1982");

		click_on_element(register_details.getSignupbox());

		click_on_element(register_details.getReceivebox());

		sleep(8000);

		sendkeys(register_details.getCompany(), "HCL");

		sendkeys(register_details.getAddress1(), "Hcl company");

		sendkeys(register_details.getAddress2(), "3rd Floor");

		sendkeys(register_details.getCity(), "Chennai");

		select_By_Visible_Text(register_details.getState(), "Indiana");

		sendkeys(register_details.getZipcode(), "00000");

		select_By_Visible_Text(register_details.getCountry(), "United States ");

		sendkeys(register_details.getInfo(), "Reg is done");

		sendkeys(register_details.getHomephone(), "4567890453");

		sendkeys(register_details.getMobilephone(), "9876423219");

		click_on_element(register_details.getRegister());

	}
}

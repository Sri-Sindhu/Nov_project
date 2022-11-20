package org.auto.purchase;

import java.io.IOException;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.WebDriver;
import org.purchase.automation.Add_Cart_Casual;
import org.purchase.automation.Add_To_Cart_Evening;
import org.purchase.automation.Add_To_Cart_Summer;
import org.purchase.automation.Back_To_Order_Casual;
import org.purchase.automation.Back_To_Order_Evening;
import org.purchase.automation.Back_To_Order_Summer;
import org.purchase.automation.Causual_Dress;
import org.purchase.automation.Conform_Casual;
import org.purchase.automation.Conform_Evening;
import org.purchase.automation.Conform_Summer;
import org.purchase.automation.Evening_Outfit;
import org.purchase.automation.Image_Casual;
import org.purchase.automation.Image_Evening;
import org.purchase.automation.Image_Summer;
import org.purchase.automation.Login_Page2;
import org.purchase.automation.Logout_Page;
import org.purchase.automation.Pay10_Casual;
import org.purchase.automation.Pay10_Evening;
import org.purchase.automation.Pay10_Summer;
import org.purchase.automation.Procced_Page1_Casual;
import org.purchase.automation.Proceed7_Evening;
import org.purchase.automation.Proceed7_Summer;
import org.purchase.automation.Proceed8_Casual;
import org.purchase.automation.Proceed8_Evening;
import org.purchase.automation.Proceed8_Summer;
import org.purchase.automation.Proceed9_Casual;
import org.purchase.automation.Proceed9_Evening;
import org.purchase.automation.Proceed9_Summer;
import org.purchase.automation.Proceed_Page1_Evening;
import org.purchase.automation.Proceed_Page1_Summer;
import org.purchase.automation.Signin_Page1;
import org.purchase.automation.Summer_Outfit;
import org.purchase.automation.Proceed7_Casual;

public class Automation_Purchase_Pom_Runner extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome"); // 271 lines------>271 lines
	
	public static Signin_Page1 signin = new Signin_Page1(driver);

	public static Login_Page2 login = new Login_Page2(driver);

	public static Causual_Dress select_dress = new Causual_Dress(driver);

	public static Image_Casual select_image = new Image_Casual(driver);

	public static Add_Cart_Casual quan_cart = new Add_Cart_Casual(driver);

	public static Procced_Page1_Casual proceed1 = new Procced_Page1_Casual(driver);

	public static Proceed7_Casual proceed2 = new Proceed7_Casual(driver);

	public static Proceed8_Casual proceed3 = new Proceed8_Casual(driver);

	public static Proceed9_Casual proceed4 = new Proceed9_Casual(driver);

	public static Pay10_Casual pay = new Pay10_Casual(driver);

	public static Conform_Casual conform = new Conform_Casual(driver);

	public static Back_To_Order_Casual order = new Back_To_Order_Casual(driver);
	
	public static Evening_Outfit choose = new Evening_Outfit(driver);

	public static Image_Evening evening = new Image_Evening(driver);

	public static Add_To_Cart_Evening cart = new Add_To_Cart_Evening(driver);

	public static Proceed_Page1_Evening proceed = new Proceed_Page1_Evening(driver);

	public static Proceed7_Evening procced_Eve = new Proceed7_Evening(driver);

	public static Proceed8_Evening click_proceed = new Proceed8_Evening(driver);

	public static Proceed9_Evening click_proceed9_eve = new Proceed9_Evening(driver);
	
	public static Pay10_Evening pay_evening = new Pay10_Evening(driver);
	
	public static Conform_Evening conform_Evening = new Conform_Evening(driver);
	
	public static Back_To_Order_Evening back_evening = new Back_To_Order_Evening(driver);
	
	public static Summer_Outfit summer = new Summer_Outfit(driver);

	public static Image_Summer img = new Image_Summer(driver);

	public static Add_To_Cart_Summer add_to_cart = new Add_To_Cart_Summer(driver);

	public static Proceed_Page1_Summer summer_proceed = new Proceed_Page1_Summer(driver);

	public static Proceed7_Summer proceed_Summer = new Proceed7_Summer(driver);

	public static Proceed8_Summer click = new Proceed8_Summer(driver);

	public static Proceed9_Summer click_proced9_summer = new Proceed9_Summer(driver);
	
	public static Pay10_Summer pay_summer = new Pay10_Summer(driver);
	
	public static Conform_Summer  conform_summer = new Conform_Summer(driver);
	
	public static Back_To_Order_Summer back_summer = new Back_To_Order_Summer(driver);
	
	public static Logout_Page logout = new Logout_Page(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		get_Url("http://automationpractice.com/index.php");

		maximize();

		click_on_element(signin.getSignin());

		sleep(8000);

		sendkeys(login.getEmail(), "xdg54@gmail.com");

		sleep(8000);

		sendkeys(login.getPassword(), "65873");

		sleep(8000);

		click_on_element(login.getSignin_click());

		move_to_element(driver, select_dress.getDress());

		sleep(8000);

		move_to_element(driver, select_dress.getCausual());
		click(driver, select_dress.getCausual());

		click_on_element(select_image.getImage());

		driver.switchTo().frame(0);

		clear_on_element(quan_cart.getQuanty());

		sendkeys(quan_cart.getQuanty1(), "4");

		select_By_Index(quan_cart.getSize(), 2);

		click_on_element(quan_cart.getCart());

		sleep(8000);

		move_to_element(driver, proceed1.getProceed());
		click(driver, proceed1.getProceed());

		click_on_element(proceed2.getProceed());

		click_on_element(proceed3.getProceed());

		click_on_element(proceed4.getAgree());

		click_on_element(proceed4.getProceed());

		click_on_element(pay.getPay());

		click_on_element(conform.getConform());

		sleep(8000);

		Take_Pic_Causal(null);

		click_on_element(order.getBack_to_order());

		sleep(8000);
		
		move_to_element(driver, choose.getDress());

		move_to_element(driver, choose.getEvening());
		click(driver, choose.getEvening());

		sleep(7000);

		click_on_element(evening.getImage());

		sleep(8000);

		driver.switchTo().frame(0);

		clear_on_element(cart.getQuanty());

		sendkeys(cart.getQuanty1(), "3");

		select_By_Index(cart.getSize(), 2);

		click_on_element(cart.getColor());

		click_on_element(cart.getCart());

		sleep(8000);

		move_to_element(driver, proceed.getProceed());
		click(driver, proceed.getProceed());

		click_on_element(procced_Eve.getProceed());

		click_on_element(click_proceed.getProceed());

		click_on_element(click_proceed9_eve.getAgree());

		click_on_element(click_proceed9_eve.getProceed());

		click_on_element(pay_evening.getPay());

		click_on_element(conform_Evening.getConform());

		sleep(8000);

		Take_Pic_Evening(null);

		click_on_element(back_evening.getBack_to_order());
		
		move_to_element(driver, summer.getDress());

		move_to_element(driver, summer.getSummer());
		click(driver, summer.getSummer());

		sleep(8000);

		click_on_element(img.getImage());

		driver.switchTo().frame(0);

		clear_on_element(add_to_cart.getQuanty());

		sendkeys(add_to_cart.getQuanty1(), "10");

		select_By_Index(add_to_cart.getSize(), 2);

		sleep(8000);

		click_on_element(add_to_cart.getColor());

		click_on_element(add_to_cart.getCart());

		sleep(8000);

		move_to_element(driver, summer_proceed.getProceed());
		click_on_element(summer_proceed.getProceed());

		click_on_element(proceed_Summer.getProceed());

		click_on_element(click.getProceed());

		click_on_element(click_proced9_summer.getAgree());

		click_on_element(click_proced9_summer.getProceed());

		click_on_element(pay_summer.getPay());

		click_on_element(conform_summer.getConform());

		sleep(8000);

		Take_Pic_Summer(null);
		
		click_on_element(back_summer.getBack_to_order());
		
		click_on_element(logout.getLogout());

	}

}

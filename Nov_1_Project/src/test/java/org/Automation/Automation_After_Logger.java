package org.Automation;

import java.io.IOException;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.WebDriver;
import org.purchase.automation.Page_Obj_Manager_Purchase;

public class Automation_After_Logger extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome");

	public static Page_Obj_Manager_Purchase purchase_dress = new Page_Obj_Manager_Purchase(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		get_Url("http://automationpractice.com/index.php");

		maximize();

		click_on_element(purchase_dress.getSignin().getSignin());

		sleep(8000);
		
		String email = Particular_Cell_Data("", 0, 0, 0);

		sendkeys(purchase_dress.getLogin().getEmail(),email);

		sleep(8000);

		sendkeys(purchase_dress.getLogin().getPassword(), "65873");

		sleep(8000);

		click_on_element(purchase_dress.getLogin().getSignin_click());

		move_to_element(driver, purchase_dress.getSelect_dress().getDress());

		sleep(8000);

		move_to_element(driver, purchase_dress.getSelect_dress().getCausual());
		click(driver, purchase_dress.getSelect_dress().getCausual());

		click_on_element(purchase_dress.getSelect_image().getImage());

		driver.switchTo().frame(0);

		clear_on_element(purchase_dress.getQuan_cart().getQuanty());

		sendkeys(purchase_dress.getQuan_cart().getQuanty1(), "4");

		select_By_Index(purchase_dress.getQuan_cart().getSize(), 2);

		click_on_element(purchase_dress.getQuan_cart().getCart());

		sleep(8000);

		move_to_element(driver, purchase_dress.getProceed1().getProceed());
		click(driver, purchase_dress.getProceed1().getProceed());

		click_on_element(purchase_dress.getProceed2().getProceed());

		click_on_element(purchase_dress.getProceed3().getProceed());

		click_on_element(purchase_dress.getProceed4().getAgree());

		click_on_element(purchase_dress.getProceed4().getProceed());

		click_on_element(purchase_dress.getPay().getPay());

		click_on_element(purchase_dress.getConform().getConform());

		sleep(8000);

		Take_Pic_Causal(null);

		click_on_element(purchase_dress.getOrder().getBack_to_order());

		sleep(8000);

		click_on_element(purchase_dress.getLogout().getLogout());

		click_on_element(purchase_dress.getSignin().getSignin());

		sleep(8000);

		sendkeys(purchase_dress.getLogin().getEmail(), "xdg54@gmail.com");

		sleep(8000);

		sendkeys(purchase_dress.getLogin().getPassword(), "65873");

		sleep(8000);

		click_on_element(purchase_dress.getLogin().getSignin_click());

		move_to_element(driver, purchase_dress.getChoose().getDress());

		move_to_element(driver, purchase_dress.getChoose().getEvening());
		click(driver, purchase_dress.getChoose().getEvening());

		sleep(7000);

		click_on_element(purchase_dress.getEvening().getImage());

		sleep(8000);

		driver.switchTo().frame(0);

		clear_on_element(purchase_dress.getCart().getQuanty());

		sendkeys(purchase_dress.getCart().getQuanty1(), "3");

		select_By_Index(purchase_dress.getCart().getSize(), 2);

		click_on_element(purchase_dress.getCart().getColor());

		click_on_element(purchase_dress.getCart().getCart());

		sleep(8000);

		move_to_element(driver, purchase_dress.getProceed().getProceed());
		click(driver, purchase_dress.getProceed().getProceed());

		click_on_element(purchase_dress.getProcced_Eve().getProceed());

		click_on_element(purchase_dress.getClick_proceed().getProceed());

		click_on_element(purchase_dress.getClick_proceed9_eve().getAgree());

		click_on_element(purchase_dress.getClick_proceed9_eve().getProceed());

		click_on_element(purchase_dress.getPay_evening().getPay());

		click_on_element(purchase_dress.getConform_Evening().getConform());

		sleep(8000);

		Take_Pic_Evening(null);

		click_on_element(purchase_dress.getBack_evening().getBack_to_order());

		click_on_element(purchase_dress.getLogout().getLogout());

		click_on_element(purchase_dress.getSignin().getSignin());

		sleep(8000);

		sendkeys(purchase_dress.getLogin().getEmail(), "xdg54@gmail.com");

		sleep(8000);

		sendkeys(purchase_dress.getLogin().getPassword(), "65873");

		sleep(8000);

		click_on_element(purchase_dress.getLogin().getSignin_click());

		move_to_element(driver, purchase_dress.getSummer().getDress());

		move_to_element(driver, purchase_dress.getSummer().getSummer());
		click(driver, purchase_dress.getSummer().getSummer());

		sleep(8000);

		click_on_element(purchase_dress.getImg().getImage());

		driver.switchTo().frame(0);

		clear_on_element(purchase_dress.getAdd_to_cart().getQuanty());

		sendkeys(purchase_dress.getAdd_to_cart().getQuanty1(), "10");

		select_By_Index(purchase_dress.getAdd_to_cart().getSize(), 2);

		sleep(8000);

		click_on_element(purchase_dress.getAdd_to_cart().getColor());

		click_on_element(purchase_dress.getAdd_to_cart().getCart());

		sleep(8000);

		move_to_element(driver, purchase_dress.getSummer_proceed().getProceed());
		click_on_element(purchase_dress.getSummer_proceed().getProceed());

		click_on_element(purchase_dress.getProceed_Summer().getProceed());

		click_on_element(purchase_dress.getClick_proceed().getProceed());

		click_on_element(purchase_dress.getClick_proced9_summer().getAgree());

		click_on_element(purchase_dress.getClick_proced9_summer().getProceed());

		click_on_element(purchase_dress.getPay_summer().getPay());

		click_on_element(purchase_dress.getConform_summer().getConform());

		sleep(8000);

		Take_Pic_Summer(null);

		click_on_element(purchase_dress.getBack_summer().getBack_to_order());

		click_on_element(purchase_dress.getLogout().getLogout());

	}

}

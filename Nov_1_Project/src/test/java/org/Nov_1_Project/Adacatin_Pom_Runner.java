package org.Nov_1_Project;

import java.time.Duration;

import org.Utilityfile.Base_Class;
import org.Utilityfile.Book_Now;
import org.Utilityfile.Click_Contiune3;
import org.Utilityfile.Home_Page_Adacatin;
import org.Utilityfile.Logout;
import org.Utilityfile.My_litenery;
import org.Utilityfile.Search_Hotel_Adacatin;
import org.openqa.selenium.WebDriver;

public class Adacatin_Pom_Runner extends Base_Class {

	public static WebDriver driver = browser_Launch("chrome");  //90 lines

	public static Home_Page_Adacatin homepg = new Home_Page_Adacatin(driver);

	public static Search_Hotel_Adacatin search = new Search_Hotel_Adacatin(driver);

	public static Click_Contiune3 next = new Click_Contiune3(driver);

	public static Book_Now book = new Book_Now(driver);

	public static My_litenery click = new My_litenery(driver);

	public static Logout logout = new Logout(driver);

	public static void main(String[] args) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		get_Url("http://www.adactinhotelapp.com/");

		sendkeys(homepg.getUsername(), "Adambala");

		sendkeys(homepg.getPassword(), "281026");

		click_on_element(homepg.getLogin());

		select_By_Visible_Text(search.getSelect_location1(), "Paris");

		select_By_Index(search.getSelect_Hotel1(), 3);

		select_By_Visible_Text(search.getSelect_Roomtype1(), "Deluxe");

		select_By_Index(search.getSelect_number(), 2);

		sendkeys(search.getSelect_date(), "10/03/2020");

		sendkeys(search.getSelect_outdate(), "19/07/2020");

		select_By_Index(search.getSelect_adults(), 1);

		select_By_Index(search.getSelect_children(), 1);

		click_on_element(search.getSelect_search());

		click_on_element(next.getSelect_Click());

		click_on_element(next.getSelect_Continue());

		sendkeys(book.getFirstname(), "Adam");

		sendkeys(book.getLastnmame(), "bala");

		sendkeys(book.getAddress(), "N0:6, Gandhi street,chennai");

		sendkeys(book.getCardnumber(), "4321098765654321");

		select_By_Visible_Text(book.getCreditcard(), "VISA");

		select_By_Visible_Text(book.getMonth(), "May");

		select_By_Visible_Text(book.getYears(), "2016");

		sendkeys(book.getCcv_no(), "2601");

		click_on_element(book.getBook());
		
		click_on_element(click.getMy_litenery());

		click_on_element(logout.getBox_Click());

		click_on_element(logout.getLogout());

	}

}

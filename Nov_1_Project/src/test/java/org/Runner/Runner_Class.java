package org.Runner;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner_Class extends Base_Class {

	public static WebDriver driver;   //100 lines

	public static void main(String[] args) throws InterruptedException {

		driver = browser_Launch("chrome");

		get_Url("http://www.adactinhotelapp.com/");
		maximize();

		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		sendkeys(name, "Adambala");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		sendkeys(pass, "281026");

		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		click_on_element(login);

		WebElement select_Location = driver.findElement(By.xpath("//select[@id='location']"));
		select_By_Visible_Text(select_Location, "Paris");

		WebElement select_Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		select_By_Index(select_Hotel, 3);

		WebElement select_roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		select_By_Visible_Text(select_roomtype, "Deluxe");

		WebElement select_num = driver.findElement(By.xpath("//select[@id='room_nos']"));
		select_By_Index(select_num, 2);

		WebElement select_date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		sendkeys(select_date, "10/03/2020");

		WebElement select_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		sendkeys(select_out, "19/07/2020");

		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		select_By_Index(adults, 1);

		WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
		select_By_Index(children, 1);

		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		click_on_element(search);

		WebElement click_button = driver.findElement(By.xpath("//input[@type='radio']"));
		click_on_element(click_button);

		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		click_on_element(cont);

		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		sendkeys(firstname, "Adam");

		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		sendkeys(lastname, "bala");

		WebElement billaddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		sendkeys(billaddress, "N0:6, Gandhi street,chennai");

		WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		sendkeys(cardno, "4321098765654321");

		WebElement credit_card = driver.findElement(By.xpath("//select[@id='cc_type']"));
		select_By_Visible_Text(credit_card, "VISA");

		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		select_By_Visible_Text(month, "May");

		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		select_By_Visible_Text(year, "2016");

		WebElement cvvno = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		sendkeys(cvvno, "2601");
		sleep(8000);

		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		click_on_element(book);
		sleep(8000);

		WebElement litenery = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		click_on_element(litenery);

		WebElement box = driver.findElement(By.xpath("//input[@id='check_all']"));
		click_on_element(box);

		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		click_on_element(logout);

	}
}

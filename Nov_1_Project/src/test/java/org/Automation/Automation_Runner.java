package org.Automation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automation_Runner extends Base_Class {

	public static WebDriver driver;    

	public static void main(String[] args) throws InterruptedException {
		
		driver = browser_Launch("chrome");

		maximize();
		
		get_Url("http://automationpractice.com/index.php");

		WebElement sign_in = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a"));
		click_on_element(sign_in);

		WebElement acc = driver
				.findElement(By.xpath("//label[text()='Email address']//following-sibling::input[@id='email_create']"));
		sendkeys(acc, "bjh0@gmail.com");

		WebElement create = driver.findElement(By.xpath("//div[@class='submit']//ancestor::button"));
		click_on_element(create);
		
		sleep(7000);

		WebElement gender = driver.findElement(By.xpath("//div[@id='uniform-id_gender2']//descendant::input"));
		click(driver, gender);

		sleep(8000);

		WebElement firstname = driver.findElement(
				By.xpath("//label[@for='customer_firstname']//following-sibling::input[@id='customer_firstname']"));
		sendkeys(firstname, "Sri");

		WebElement lastname = driver
				.findElement(By.xpath("//label[@for='customer_lastname']//following-sibling::input"));
		sendkeys(lastname, "Devi");

		WebElement password = driver.findElement(By.xpath("//label[@for='passwd']//following-sibling::input"));
		sendkeys(password, "65873");

		WebElement date = driver.findElement(By.xpath("//div[@id='uniform-days']//child::select"));
		select_By_Index(date, 26);

		WebElement month = driver.findElement(By.xpath("//div[@id='uniform-months']//child::select"));
		select_By_Index(month, 4);

		WebElement year = driver.findElement(By.xpath("//div[@id='uniform-years']//child::select"));
		select_By_Value(year, "1982");

		WebElement signupbox = driver.findElement(By.xpath("//div[@id='uniform-newsletter']//child::input"));
		click_on_element(signupbox);

		WebElement receivebox = driver.findElement(By.xpath("//div[@id='uniform-optin']//child::input"));
		click_on_element(receivebox);
		
		sleep(8000);

		WebElement comp = driver.findElement(By.xpath("//label[text()='Company']//following-sibling::input"));
		sendkeys(comp, "HCL");

		WebElement addre1 = driver.findElement(By.xpath("//label[@for='address1']//following-sibling::input"));
		sendkeys(addre1, "Hcl company");

		WebElement addres2 = driver.findElement(By.xpath("//label[@for='address2']//following-sibling::input"));
		sendkeys(addres2, "3rd Floor");

		WebElement city = driver.findElement(By.xpath("//label[@for='city']//following-sibling::input"));
		sendkeys(city, "Chennai");

		WebElement state = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='id_state']"));
		select_By_Visible_Text(state, "Indiana");

		WebElement zipcode = driver.findElement(By.xpath("//label[@for='postcode']//following-sibling::input"));
		sendkeys(zipcode, "00000");

		WebElement country = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='id_country']"));
		select_By_Visible_Text(country, "United States ");

		WebElement info = driver.findElement(By.xpath("//label[@for='other']//following-sibling::textarea"));
		sendkeys(info, "Reg is done");

		WebElement homeph = driver.findElement(By.xpath("//label[@for='phone']//following-sibling::input"));
		sendkeys(homeph, "4567890453");

		WebElement mobileph = driver.findElement(By.xpath("//label[@for='phone_mobile']//following-sibling::input"));
		sendkeys(mobileph, "9876423219");

		WebElement reg = driver.findElement(By.xpath("//div[@class='submit clearfix']//child::button"));
		click_on_element(reg);

	}
}

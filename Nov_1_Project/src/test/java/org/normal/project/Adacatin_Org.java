package org.normal.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adacatin_Org {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Automation2_Project\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("Adambala");

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("281026");

		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();

		WebElement select_Location = driver.findElement(By.xpath("//select[@id='location']"));
		Select a = new Select(select_Location);
		a.selectByVisibleText("Paris");

		WebElement select_Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s = new Select(select_Hotel);
		s.selectByIndex(3);

		WebElement select_roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select d = new Select(select_roomtype);
		d.selectByVisibleText(" Deluxe");

		WebElement select_num = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select f = new Select(select_num);
		f.selectByIndex(2);

		WebElement select_date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		select_date.sendKeys("10/03/2020");

		WebElement select_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		select_out.sendKeys("19/07/2020");

		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select j = new Select(adults);
		j.selectByIndex(1);

		WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select k = new Select(children);
		k.selectByIndex(1);

		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();

		WebElement click_button = driver.findElement(By.xpath("//input[@type='radio']"));
		click_button.click();

		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();

		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("Adam");

		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("bala");

		WebElement billaddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		billaddress.sendKeys("N0:6, Gandhi street,chennai");

		WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardno.sendKeys("4321098765654321");

		WebElement credit_card = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select q = new Select(credit_card);
		q.selectByVisibleText("VISA");

		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select w = new Select(month);
		w.selectByVisibleText("May");

		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select e = new Select(year);
		e.selectByVisibleText("2016");

		WebElement cvvno = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvvno.sendKeys("2601");
		Thread.sleep(8000);

		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
		Thread.sleep(8000);

		WebElement litenery = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		litenery.click();

		WebElement box = driver.findElement(By.xpath("//input[@id='check_all']"));
		box.click();

		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		logout.click();
	}

}




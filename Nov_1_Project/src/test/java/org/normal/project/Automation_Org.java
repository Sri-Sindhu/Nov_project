package org.normal.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Org {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Dyna_Project\\Tree\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		WebElement sign_in = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a"));
		sign_in.click();

		WebElement acc = driver.findElement(By.xpath("//label[text()='Email address']//following-sibling::input[@id='email_create']"));
		acc.sendKeys("bdjs8@gmail.com");

		WebElement create = driver.findElement(By.xpath("//div[@class='submit']//ancestor::button"));
		create.click();
		Thread.sleep(8000);

		Actions a = new Actions(driver);
		WebElement gender = driver
				.findElement(By.xpath("//div[@id='uniform-id_gender2']//descendant::input"));////div[@id='uniform-id_gender2']//descendant::input
		a.moveToElement(gender).build().perform();
		a.click().build().perform();

		Thread.sleep(8000);

		WebElement firstname = driver.findElement(By.xpath("//label[@for='customer_firstname']//following-sibling::input[@id='customer_firstname']"));
		firstname.sendKeys("Sri");

		WebElement lastname = driver.findElement(By.xpath("//label[@for='customer_lastname']//following-sibling::input"));
		lastname.sendKeys("Devi");

		WebElement password = driver.findElement(By.xpath("//label[@for='passwd']//following-sibling::input"));
		password.sendKeys("65873");

		WebElement date = driver.findElement(By.xpath("//div[@id='uniform-days']//child::select"));
		Select s = new Select(date);
		s.selectByIndex(26);

		WebElement month = driver.findElement(By.xpath("//div[@id='uniform-months']//child::select"));
		Select d = new Select(month);
		d.selectByIndex(4);

		WebElement year = driver.findElement(By.xpath("//div[@id='uniform-years']//child::select"));
		Select f = new Select(year);
		f.selectByValue("1982");

		WebElement signupbox = driver.findElement(By.xpath("//div[@id='uniform-newsletter']//child::input"));
		signupbox.click();

		WebElement receivebox = driver.findElement(By.xpath("//div[@id='uniform-optin']//child::input"));
		receivebox.click();

		Thread.sleep(8000);

		WebElement comp = driver.findElement(By.xpath("//label[text()='Company']//following-sibling::input"));
		comp.sendKeys("HCL");

		WebElement addre1 = driver.findElement(By.xpath("//label[@for='address1']//following-sibling::input"));
		addre1.sendKeys("Hcl company");

		WebElement addres2 = driver.findElement(By.xpath("//label[@for='address2']//following-sibling::input"));
		addres2.sendKeys("3rd Floor");

		WebElement city = driver.findElement(By.xpath("//label[@for='city']//following-sibling::input"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='id_state']"));
		Select q = new Select(state);
		q.selectByVisibleText("Indiana");

		WebElement zipcode = driver.findElement(By.xpath("//label[@for='postcode']//following-sibling::input"));
		zipcode.sendKeys("00000");

		WebElement country = driver.findElement(By.xpath("//div[@class='selector']//child::select[@id='id_country']"));
		Select w = new Select(country);
		w.selectByVisibleText("United States ");

		  WebElement info = driver.findElement(By.xpath("//label[@for='other']//following-sibling::textarea"));
		  info.sendKeys("Reg is done");
		  
		  WebElement homeph = driver.findElement(By.xpath("//label[@for='phone']//following-sibling::input"));
		  homeph.sendKeys("4567890453");
		  
		  WebElement mobileph = driver.findElement(By.xpath("//label[@for='phone_mobile']//following-sibling::input"));
		  mobileph.sendKeys("9876423219");
		  
		  WebElement reg = driver.findElement(By.xpath("//div[@class='submit clearfix']//child::button"));
		  reg.click();


	}



}

package org.annotation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enable_Demo {
	
	public static WebDriver driver = Base_Class.browser_Launch("chrome");

	@Test
	public void url() {
		Base_Class.get_Url("http://www.adactinhotelapp.com/");
		System.out.println("Adactin page");
	}

	@Test
	public void username() {
		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("Adambala");
		System.out.println("username");
	}

	@Test(enabled = false)
	public void password() {
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("281026");
		System.out.println("password");
	}
    @Ignore
	@Test
	private void login() {
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		System.out.println("login");
	}


}

package org.annotation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Groups {
	
	public static WebDriver driver = Base_Class.browser_Launch("chrome");

	@Test(groups = "Signin")
	public void url() {
		Base_Class.get_Url("http://www.adactinhotelapp.com/");
		System.out.println("Adactin page");
	}

	@Test(groups = "Login")
	public void username() {
		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("Adambala");
		System.out.println("username");
	}
	
	
}

package org.annotation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Invocation_Count_Timeout {
	
	public static WebDriver driver=Base_Class.browser_Launch("chrome");

	@Test(priority = -2)
	public void url()
	{
		Base_Class.get_Url("http://www.adactinhotelapp.com/");
	}
	
	@Test(priority =-1,invocationCount = 3 ,invocationTimeOut = 8000)
	private void refresh() {
		System.out.println("Refresh");
	}
	
	@Test
	public void username() {
		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("Adambala");
	}

}

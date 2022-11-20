package com.junit;

import java.time.Duration;

import org.Utilityfile.Base_Class;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Timeouts {
	public static WebDriver driver=Base_Class.browser_Launch("chrome");
	
@Test(timeout =20000 )

public void signin() throws InterruptedException {
	
	Base_Class.get_Url("http://www.adactinhotelapp.com/");
	
	Thread.sleep(2000);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
	name.sendKeys("Adambala");

	WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("281026");
}

}

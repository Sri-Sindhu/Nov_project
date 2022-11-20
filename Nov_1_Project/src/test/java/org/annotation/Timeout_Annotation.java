package org.annotation;

import java.time.Duration;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Timeout_Annotation {
	
	public static WebDriver driver=Base_Class.browser_Launch("chrome");
	
	@Test(timeOut = 20000)
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

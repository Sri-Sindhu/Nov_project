package org.annotation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Parallel {

	public static WebDriver driver = Base_Class.browser_Launch("chrome");

	@Test
	public void socialmedia() {

		Base_Class.get_Url("https://www.instagram.com/");
		Base_Class.maximize();

	}

	@Test
	public void food() {

		Base_Class.get_Url("https://www.zomota.com/");
		Base_Class.maximize();

	}

	@AfterClass
	public void close() {
		Base_Class.quit();
	}

}

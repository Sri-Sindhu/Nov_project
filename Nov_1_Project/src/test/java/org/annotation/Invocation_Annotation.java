package org.annotation;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Invocation_Annotation {
	public static WebDriver driver=Base_Class.browser_Launch("chrome");
	/*@Test(invocationCount = 0)
	public void adactin_Created()
	{
		System.out.println("Created successfully");
	}
	
	@Test
	private void refresh()
	{
		System.out.println("Refresh");
	}
	
	@Test
	public void credentials()
	{
		System.out.println("Crendetials");
	}*/
	

	@Test(invocationCount = 2)
	public void socialmedia() {
		Base_Class.get_Url("http://www.adactinhotelappss.com/");

		
		
	}

}

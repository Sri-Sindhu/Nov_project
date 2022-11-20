package org.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@DataProvider
	private String[][] pdata() {
	
	String[][] data ={
			{ "Sri","Chennai"},
			{"Dev","Trichy"},
			{"Krish","Madhurai"}
			
	};
	
	return data;
}
	
	@Test(dataProvider = "pdata")
	private void details(String name,String city)
	{
		System.out.println("name :" +name);
		System.out.println("city:" +city);
	}



}

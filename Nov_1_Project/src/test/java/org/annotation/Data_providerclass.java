package org.annotation;

import org.testng.annotations.Test;

public class Data_providerclass {
	
	@Test(dataProvider = "pdata",dataProviderClass = Data_Provider.class)
	public void proclass(String name,String city) {
		
		System.out.println("username:" +name);
		System.out.println("location:"+city);
		
	}

}

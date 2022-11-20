package org.annotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Singledata {
	
	@Parameters({"Dress","Rate"})
	@Test
	private void dress(String Saree,String high) {
		System.out.println("Saree:" +Saree);
		System.out.println("high:" +high);
	}
	
	@Parameters({"Bus","Type"})
	@Test
	private void travel(String Resbus,String Nonac ) {
		System.out.println("travel:" +Resbus);
		System.out.println("bustype:" +Nonac);
	}
	@Parameters({"firstnameiy","lastname"})
	@Test
	private void name(@Optional("Customised")String username,String name ) {
		System.out.println("username:" +username);
		System.out.println("name:" +name);
	}
	
	

}

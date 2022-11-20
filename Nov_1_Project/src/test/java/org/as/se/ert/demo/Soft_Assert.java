package org.as.se.ert.demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	private void instagram()
	{
		String excepted_id = "asdv";
		String actual_id = "itssri";
		
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(excepted_id, actual_id);
		ass.assertAll();
		System.out.println("Instagram ID");

	}

}

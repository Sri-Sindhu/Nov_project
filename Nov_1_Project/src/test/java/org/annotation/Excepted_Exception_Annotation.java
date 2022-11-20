package org.annotation;

import org.testng.annotations.Test;

public class Excepted_Exception_Annotation {
	
	@Test(expectedExceptions = StringIndexOutOfBoundsException.class)
	public void name() {
		String a = "Lion";
		a.charAt(8);
		System.out.println(a);
	}

}

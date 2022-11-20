package com.junit;

import org.junit.Test;

public class Expected_Exception {
	
	@Test(expected = ArithmeticException.class)
	//public void opertions()
	
		public void name() {
			String a = "Lion";
			a.charAt(8);
			System.out.println(a);
		}

}

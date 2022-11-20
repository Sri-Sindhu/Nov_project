package org.annotation;

import org.testng.annotations.Test;

public class Priority_Annotation {
	
	@Test(priority = 2)
    private void Wind() {
        System.out.println("Wind");
	}
	//default value is (0)
	@Test     
	public void Rain() {
		System.out.println("Rain");
	}
	@Test(priority = -2)
	private void Summer() {
		System.out.println("Summer");
	}

}

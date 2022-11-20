package org.annotation;

import org.testng.annotations.Test;

public class Description_Annotation {
	
	@Test(description = "Due to heavy rain")
	private void Rain() {
		System.out.println("Rain");
	}
	
	@Test(description = "Its too hot")
	public void Summer() {
		System.out.println("Summer");
	}

}

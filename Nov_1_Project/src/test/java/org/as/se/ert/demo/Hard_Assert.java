package org.as.se.ert.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {

	@Test
	private void fruits() {
		String excepted_fruit = "Jack Fruit";
		String actual_fruit = "Mango";

		Assert.assertNotEquals(excepted_fruit, actual_fruit);
		System.out.println("Tastefully");

		Assert.assertEquals(excepted_fruit, actual_fruit);
		System.out.println("Buy fruits is done");

	}
}

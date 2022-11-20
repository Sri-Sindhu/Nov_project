package org.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retryanalyzer_Runner {

	@Test
	private void season() {
		String excepted_season = "Rainy";
		String actual_season = "Rainy";
		Assert.assertEquals(actual_season, excepted_season);
	}

	@Test
	private void colour() {
		String excepted_colour = "Dark blue";
		String actual_colour = "Sky blue";
		Assert.assertEquals(actual_colour, excepted_colour);
	}

}

package org.annotation;

import org.testng.annotations.Test;

public class Group_Of_Groups {
	
	@Test(groups = "Season")
	private void winter()
	{
		System.out.println("Winter");
	}

	@Test(groups = "Season")
	private void rain()
	{
		System.out.println("Rain");
	}
	
	@Test(groups = "Food")
	public void briyani()
	{
		System.out.println("Briyani");
	}
	@Test(groups = "Food")
	public void paratta()
	{
		System.out.println("Parotta");
	}

}

package org.junit.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Juint_Demo {
	public void Briyani()
	{
		System.out.println("Briyani");
	}
	
	@Test
	public void Chicken_Fired_Rice()
	{
		System.out.println("Chicken rice");
	}
	
	@Test
	public void Parotta()
	{
		System.out.println("Parotta");
	
	}
	@Before
	public void Order()
	{
		System.out.println("Order");
	}
	@After
	public void Pay()
	{
		System.out.println("Pay");
	}
}

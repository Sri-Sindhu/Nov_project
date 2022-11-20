package org.testng.demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeTest
	public void Browser_Launch() {
		System.out.println("Browser Lanuch");
	}

	@AfterTest
	private void browser_Close() {
		System.out.println("Browser Close");
	}

	@BeforeClass
	private void launch_url() {
		System.out.println("url launch");
	}

	@AfterClass
	public void verify_Homepage() {
		System.out.println("Home Page");
	}

	@Test
	public void Causualdress() {
		System.out.println("Casual Dress");
	}

	@Test
	private void evening() {
		System.out.println("Evening Dress");
	}

	@Test
	public void Summerdress() {
		System.out.println("Summmer Dress");
	}

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}

}

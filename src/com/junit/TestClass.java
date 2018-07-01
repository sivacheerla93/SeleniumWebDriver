package com.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	@Test
	public void LoginTest() {
		System.out.println("First JUnit Test");
	}

	@Ignore
	@Test
	public void AddToCartTest() {
		System.out.println("Add to cart test");
	}

	@Test
	public void SearchTest() {
		System.out.println("Search Test");
	}

	@Test
	public void FirefoxLaunchTest() {
		FirefoxDriver objDriver = new FirefoxDriver();
		objDriver.get("http://opencart.com");
		String strTitle = objDriver.getTitle();
		System.out.println(strTitle);
		Assert.assertEquals("Title Mismatch", "Performance Store", strTitle);
		objDriver.close();
	}
}

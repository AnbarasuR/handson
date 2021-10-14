package com.TestRunnner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Managers.PageManager;
import com.Managers.TestBaseClass;

public class GoogleSearch extends TestBaseClass {
	PageManager pm = new PageManager();

	@BeforeMethod
	public void setUp() {
		initBrowser("chrome");
		driver.get("https://www.google.com");
	}

	@Test
	public void test() {
		pm.getHomePage().checkGoogleSearch("Java");
	}

}

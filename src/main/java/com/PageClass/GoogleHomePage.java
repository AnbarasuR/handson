package com.PageClass;

import org.openqa.selenium.WebDriver;

import com.Managers.PageManager;
import com.Managers.TestBaseClass;

public class GoogleHomePage extends TestBaseClass {

//	public GoogleHomePage(WebDriver driver) {
//
//	}

	PageManager pm = new PageManager();

	public void checkGoogleSearch(String keyword) {
		driver.findElement(com.PageObjectClass.GoogleHomePage.googleSearchBox).sendKeys(keyword);
		System.out.println(driver.getTitle());
	}
}

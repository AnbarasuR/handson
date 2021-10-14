package com.PageObjectClass;

import org.openqa.selenium.By;

import com.Managers.TestBaseClass;

public class GoogleHomePage  extends TestBaseClass{
	
	public static By googleSearchBox = By.xpath("//input[@title='Search']");

}

package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/V1/";
	public String username="mngr552011";
	public String password="rupAhug";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}

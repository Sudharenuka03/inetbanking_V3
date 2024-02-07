package com.inetbanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TCLoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage l=new LoginPage(driver);
		l.setlogin("mngr552011" , "rupAhug" );
	}
}

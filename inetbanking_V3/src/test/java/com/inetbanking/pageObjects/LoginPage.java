package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
  WebDriver ldriver;
   public LoginPage(WebDriver rdriver)
   {
	   ldriver=rdriver;
	   PageFactory.initElements(rdriver, this);
   }
	
	@FindBy(name="uid")
	WebElement txtUN;
	
	@FindBy(name="password")
	WebElement txtPW;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void setlogin(String un, String pw)
	{
		txtUN.sendKeys(un);
		txtPW.sendKeys(pw);
		btnlogin.click();
	}
	
}

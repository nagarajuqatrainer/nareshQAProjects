package com.AppTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.AppObjects.LoginObjects;



public class LoginAppTest {
	public static WebDriver driver;
	public static LoginObjects loginpage;
	
	
	
	
	
  @Test
  public void verifyLogin() {
	  
	  BrowserFactory.getbrowser("chrome", Appurl);
	  
	  
  }
}

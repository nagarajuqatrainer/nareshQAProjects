package com.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.AppUtilities.ConfigFile;




public class LoginObjects {
	
	public static WebDriver driver;
	
	
	
	//@FindBy(name="user")WebElement uname;
	//@FindBy(name="pass")WebElement pword;
	//@FindBy(name="btnSubmit")WebElement loginbutton;

	ConfigFile config1=new ConfigFile();
	
	By uname = By.name(config1.getunameelement());
	By pword = By.name(config1.getpwordelement());
	By loginbutton = By.name(config1.getbuttonelement());
	
	
	
	
	public LoginObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyusername(String un) {
		driver.findElement(uname).sendKeys(un);
	}
	
	public void verifypassword(String pw) {
		driver.findElement(pword).sendKeys(pw);
	}
	
	
	
	
	public void clickloginbutton() {
		WebElement button = driver.findElement(loginbutton);
		if(button.isEnabled()) {
			button.click();
			
		}
		
		
	}
	
	
	
	
	
	
	/*
	//creating methods for objects
	public void verifylogin(String un,String pw) {
		uname.sendKeys(un);
		pword.sendKeys(pw);
	}
	
	public void clickloginbutton() {
		loginbutton.click();
	}
	
	*/
}

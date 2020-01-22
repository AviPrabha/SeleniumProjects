package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.LoginPage;

public class LoginFeatures {
WebDriver driver;
LoginPage lp;

public LoginFeatures(WebDriver driver)
{
	this.driver=driver;
	lp=new LoginPage(driver);	
}
//Login Features
public void login(String username, String password) {
	lp.getUnTxtBx().sendKeys(username);
	lp.getPwdTxtBx().sendKeys(password);
	lp.getLoginBtn().click();	
}
public void verifyInvalidLoginMsg() {
	String actualMsg = lp.getInvalidLoginEle().getText();
	String expMsg="Username or Password is invalid. Please try again.";
	Assert.assertEquals(actualMsg, expMsg);
	Reporter.log("Invalid Login msg is verified", true);
}
}

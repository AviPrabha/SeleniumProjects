package com.odoo.features;

import org.openqa.selenium.WebDriver;
import com.odoo.steps.LoginSteps;

public class LoginFeature 
{
	LoginSteps ls;
	
	public LoginFeature(WebDriver driver) {
		ls=new LoginSteps(driver);
	}
	
	public  void validLogin(String username,String password) 
	{
	ls.enterUsername(username);
	ls.enterPassword(password);
	ls.clickLoginBtn();
	}
}

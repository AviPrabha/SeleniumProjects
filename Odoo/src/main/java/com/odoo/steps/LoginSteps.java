package com.odoo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.odoo.pageobjects.LoginPage;

public class LoginSteps
{
	WebDriver driver;
	LoginPage lp;
	
	public LoginSteps(WebDriver driver) {
		this.driver=driver;
		lp=new LoginPage();
		
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(By.xpath(lp.unTxtBx)).sendKeys(username);
		
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(By.xpath(lp.pwdTxtBx)).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.xpath(lp.loginBtn)).click();
	}
	
}

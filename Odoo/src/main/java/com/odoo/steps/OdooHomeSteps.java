package com.odoo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.odoo.pageobjects.OdooHomePage;

public class OdooHomeSteps 
{
	WebDriver driver;
	OdooHomePage ohp;
	
	public OdooHomeSteps(WebDriver driver)
	{
		this.driver=driver;
		ohp=new OdooHomePage();
	}
	
	public void verifyCRM() 
	{
		Assert.assertTrue(driver.findElement(By.xpath(ohp.crm)).isDisplayed());
		Reporter.log("CRM is displayed in Home Page",true);
	}
	
	public void verifyUsername(String username) 
	{
		String actualUsername=driver.findElement(By.xpath(ohp.username)).getText();
		Assert.assertEquals(actualUsername, username);
		Reporter.log("Logged in Username is verified",true);
	}
	
}

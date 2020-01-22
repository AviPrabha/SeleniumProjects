package com.odoo.features;

import org.openqa.selenium.WebDriver;

import com.odoo.steps.OdooHomeSteps;

public class OdooHomeFeatures
{
	OdooHomeSteps ohs;
	
	public OdooHomeFeatures(WebDriver driver) 
	{
		ohs=new OdooHomeSteps(driver);
	}
		
	public void verifyOdooHomePage(String username) 
	{
		ohs.verifyCRM();
	}
}

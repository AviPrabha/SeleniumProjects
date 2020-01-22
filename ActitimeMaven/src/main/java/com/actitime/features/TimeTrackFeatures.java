package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.EnterTimeTrackPage;

public class TimeTrackFeatures{
WebDriver driver;
EnterTimeTrackPage ettp;

public TimeTrackFeatures(WebDriver driver) 
{
	this.driver=driver;
	ettp=new EnterTimeTrackPage(driver);
}

	public void verifyHomePage() 
	{
		String expText="Enter Time-Track";
		String actualText=ettp.getPageTitleEle().getText();
		Assert.assertEquals(actualText, expText);
		
		String expTitle = "actiTIME - Enter Time-Track";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expTitle);
		Reporter.log("Home Page is verified", true);
	}
	
}

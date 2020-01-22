package com.qspiders;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class FWLibrary {
	public static String scriptStatus;
		
	WebDriver driver;
	public Logger logger;
	
	public FWLibrary(WebDriver driver)
	{
		this.driver=driver;
		logger = Logger.getLogger(this.getClass().getName());
	}
	
	public boolean elementExist(String xpath)
	{  
		try
		{
		 driver.findElement(By.xpath(xpath));
		 logger.info("Element found with xpath:"+xpath);
		 return true;
		}
		catch(NoSuchElementException ex)
		{
			return false;
		}
	}
	
	public void verifyTitle(String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			logger.info("Title is correct:"+expectedTitle);
		}
		else
		{  
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:Title is not correct:Expected:"+expectedTitle+" Actual:"+actualTitle);
			
		}
	}
	
	public void verifyText(String xpath,String expectedText)
	{ 
		if(elementExist(xpath))  //true
		{
			String actualText=driver.findElement(By.xpath(xpath)).getText();
		 if(actualText.equalsIgnoreCase(expectedText))
		  {
			 logger.info("Text is correct:"+expectedText);
		  }
		  else
		  {
			 scriptStatus="FAIL";
			 TakeScreenShot();
			 logger.error("FAIL:Text is not correct:Expected:"+expectedText+" Actual:"+actualText);
		   }
		}
		else
		{ 
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:verifyText();Element Not Found with the xpath:"+xpath );
		}
	}
	
	public void sendKeys(String xpath,String input)
	{
		
		if(elementExist(xpath))
		{
			driver.findElement(By.xpath(xpath)).sendKeys(input);
			logger.info("Entering \""+input+"\"");
		}
		else
		{
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:sendKeys();Element Not Found with the xpath:"+xpath);
		}
	}
	
	public void click(String xpath)
	{
		
		if(elementExist(xpath))
		{
			driver.findElement(By.xpath(xpath)).click();
			logger.info("clicking on the element");
		}
		else
		{
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:click(): Element Not Found with the xpath:"+xpath);
		}
	}
	
	  public void clearText(String xpath)
	  {
		  if(elementExist(xpath))
			{
				driver.findElement(By.xpath(xpath)).clear();
				logger.info("clearing the text");
			}
			else
			{
				scriptStatus="FAIL";
				TakeScreenShot();
				logger.error("FAIL:clearText();Element Not Found with the xpath:"+xpath);
			}
	  }
	
	public void waitForSeconds(String s)
	{
		try
		{  
			
		    int seconds = (int)Double.parseDouble(s);
		    logger.info("Wait for "+ seconds + " seconds");
		    Thread.sleep(1000 * seconds);
			 
		}
		catch(Exception ex)
		{
			logger.error("invalid input for: waitForSeconds:"+s);
		}
	}
	
	
	public void checkAlertDisplayed()
	{
		try
		{
			driver.switchTo().alert();
			logger.info("Alert popup displayed: ");
		}
		catch(Exception ex)
		{
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:checkAlertDisplayed();Alert popup not displayed: ");
		}
	}
	
	public void acceptAlertPopup()
	{
		try
		{
			driver.switchTo().alert().accept();
			logger.info("Alert popup accepted: ");
		}
		catch(Exception ex)
		{
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:acceptAlertPopup();Accept Alert popup failed:");
		}
	}
	
	public void dismissAlertPopup()
	{
		try
		{
			driver.switchTo().alert().dismiss();
			logger.info("Alert popup dismissed: ");
		}
		catch(Exception ex)
		{
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("FAIL:dismissAlertPopup();dismiss Alert popup failed:");
		}
	}
 
	public void verifyElementPresent(String xpath)
	{
		if(elementExist(xpath))
		{
			
			 logger.info("Element found with xpath:"+xpath);
		}
		else
		{
			scriptStatus="FAIL";
			TakeScreenShot();
			logger.error("Element not found with xpath:"+xpath);
		}
	}
	
	public void verifyElementNotPresent(String xpath)
	{
		if(elementExist(xpath))
		{
			scriptStatus="FAIL";
			logger.error("Element found with xpath:"+xpath);
			TakeScreenShot();
		}
		else
		{
			TakeScreenShot();
			logger.info("Element not found with xpath:"+xpath);
		}
	}
	
	public void TakeScreenShot() 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		Date date = new Date();		
		logger.error("Calling  onTestFailure Method: ");
		
		try{
			  Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./ScreenShots/FailedScreenShot"+sdf.format(date)+".png"));
		}catch(Exception e)
		{
			logger.error("Error: ");
		}	
	}	
}

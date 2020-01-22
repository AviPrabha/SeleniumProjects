package com.odoo.webutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserFactory 
{
	public static WebDriver launchBrowser(String platformName,String browserName,String headless)
	{
	WebDriver driver=null;
	
	if(platformName.equalsIgnoreCase("Windows")|| platformName.contains("win"))
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", GenericLib.dir +"/exefiles/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(ChromeCapabilities.getChromeCapabilities(headless));
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(FirefoxCapabilities.getFirefoxCapabilities(headless));
		}
	}

	else if(platformName.contains("mac")) 
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			//	System.setProperty("webdriver.chrome.driver", "GenericLib.dir +"/exefiles/geckodriver.exe"");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver(ChromeCapabilities.getChromeCapabilities(headless));
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver(FirefoxCapabilities.getFirefoxCapabilities(headless));
			}		
	}
	else if(platformName.equalsIgnoreCase("Linux")|| platformName.contains("Ubuntu"))
	{
	
	}
	return driver;
	}
}
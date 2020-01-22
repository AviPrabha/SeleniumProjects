package com.odoo.webutils;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;
import com.odoo.generic.Driver;
import com.odoo.generic.GenericLib;

public class MyTestListener implements ITestListener , WebDriverEventListener {

	public static Logger log;
	public static int executionCount,passCount,failCount,skipCount=0;
	public static long startTime,stopTime=0;
	
	
	
	@Override
	public void beforeAlertAccept(WebDriver driver) {	
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {	
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		log.info("Finding WebElement using Locator: "+by);
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
	}

	@Override
	public void onException(Throwable t, WebDriver driver) {
		log.fatal(t.getMessage());
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
	}

	@Override
	public void onTestStart(ITestResult result) {
		log.info(result.getName()+" script execution starts");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		passCount++;
		log.info(result.getName()+" script is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failCount++;
		log.error(result.getName()+" script is failed");
		TakesScreenshot ts=(TakesScreenshot) Driver.getdriver();
		 File srcFile = ts.getScreenshotAs(OutputType.FILE);
		 File destFile=new File(GenericLib.dir+"/screenshots/"+result.getName()+".png");
		
		 try 
		 {
			Files.copy(srcFile, destFile);
		 }
		 catch (IOException e) 
		 {
			e.printStackTrace();
		 }
		 
		log.info("screenshot has been taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		skipCount++;
		log.warn(result.getName()+" Script is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	startTime=System.currentTimeMillis();
	PropertyConfigurator.configure("log4j.properties");
	log=Logger.getLogger("MyTestListener");
	log.info("Framework execution starts ");
	String platformName = System.getProperty("platform");
	String browserName = System.getProperty("browser");
	String headless = System.getProperty("headless");
	WebDriver driver=BrowserFactory.launchBrowser(platformName, browserName, headless);
	log.info("Browser launched");
	RemoteWebDriver rwd=(RemoteWebDriver) driver;
	String browserVersion = rwd.getCapabilities().getVersion();
	Driver.setDriver(driver);
	//to be continued...
	}

	@Override
	public void onFinish(ITestContext context) {
		
		log.info("framework execution ends");
		stopTime=System.currentTimeMillis();
		double totalTime=(stopTime-startTime)/1000;
		log.info("framework toatal execution Time: "+ totalTime + " seconds");
		log.info("Total script Executed: "+executionCount);
		log.info("Total script passed"+passCount);
		log.info("Total script failed: "+failCount);
		log.info("Total script skipped: "+skipCount);	
	}
}

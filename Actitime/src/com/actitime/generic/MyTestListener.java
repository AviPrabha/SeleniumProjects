package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyTestListener implements ITestListener 
	{
	public static int executionCount, passCount, failCount, skipCount=0;
                                                                              //we can remove @Override......this will work after removing it.
	@Override
	public void onTestStart(ITestResult result) 
	{
		executionCount++;
		Reporter.log(result.getName()+"Script execution starts:"+new Date(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		passCount++;
		Reporter.log(result.getName()+"Script is Passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		failCount++;
		Reporter.log(result.getName()+"Script is Failed",true);
		
		TakesScreenshot ts=(TakesScreenshot) BaseLib.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshots/"+result.getName()+".png");
		
		try 
		{
			Files.copy(srcFile, destFile);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		Reporter.log("Screenshot has been Taken",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		skipCount++;
		Reporter.log(result.getName()+"Script is Skipped",true);
	}
	@Override
	public void onStart(ITestContext result) 
	{
		Reporter.log("Framework Execution Starts: "+new Date(),true);
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("Framework Execution ends:"+new Date(),true);	
		Reporter.log("Total scrips executed: "+executionCount,true);
		Reporter.log("Total scrips executed: "+passCount,true);
		Reporter.log("Total scrips executed: "+failCount,true);
		Reporter.log("Total scrips executed: "+skipCount,true);
	}
	
	
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {	
	}
}

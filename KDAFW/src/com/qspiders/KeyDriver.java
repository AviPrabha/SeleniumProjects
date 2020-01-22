package com.qspiders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyDriver 
{
	public Logger logger;
	public Generic g=new Generic();
	public WebDriver driver;
	public FWLibrary lib;
	public int passCount=0;
	public int failCount=0;
	public int skipCount=0;
	
	public String controller="./scripts/Controller.xlsx";
	public String scenarios="./scripts/Scenarios.xlsx";
	
	public KeyDriver()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		String startTime=dateFormat.format(date);
		System.setProperty("logfileName","./logs/"+startTime+".log");
		logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void controllerExecutor()
	{	
		logger.info("**********************Starting Frame Work**********************");
		String url=g.getExcelCellValue(controller,"Configuration", 0, 1);
		String timeOut=g.getExcelCellValue(controller,"Configuration", 1, 1);
		String browserName = g.getExcelCellValue(controller, "Configuration", 2, 1);
		logger.info("Timeout is:"+timeOut+" SECONDS");
		driver=BrowserFactory.launchBrowser(browserName);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeOut),TimeUnit.SECONDS);
		driver.get(url);
		lib=new FWLibrary(driver);
		
	  int scenarioCount=g.getExcelRowCount(controller,"ScenarioList");
	  logger.info("Total Number of Scenarios:"+scenarioCount);
	  for(int i=1;i<=scenarioCount;i++)
	  {
		  String scenarioName=g.getExcelCellValue(controller,"ScenarioList", i, 0);
		  String executeScenario=g.getExcelCellValue(controller,"ScenarioList", i, 1);
		  if(executeScenario.equalsIgnoreCase("yes"))
		  {
			  FWLibrary.scriptStatus="PASS";
			  logger.info("======================================================");
			  logger.info("Starting scenario:"+scenarioName);
			  scenarioExecutor(scenarioName);
			  logger.info("Ending scenario:"+scenarioName);
			  if(FWLibrary.scriptStatus.equals("PASS"))
			  {
				  passCount++;
			  }
			  else
			  {
				  failCount++;
			  }
			  logger.info("!!!! Execution Status of above scenario:"+ FWLibrary.scriptStatus+" !!!!");
			  logger.info("======================================================");
		  }
		  else
		  {
			  skipCount++;
			  logger.info("_________________________________________________________");
			  logger.warn("Skipping scenario:"+scenarioName);
			 
		  }
	  }
	  driver.quit();
	  logger.info("Total Pass:"+passCount+" ; Total Fail:"+failCount+" ; Total Skip:"+skipCount);
	  logger.info("**********************Ending Frame Work**********************");
	  
	}
	
	public void scenarioExecutor(String scenarioName) 
	{
		int StepCount=g.getExcelRowCount(scenarios, scenarioName);
		logger.info("StepCount:"+StepCount);
			for(int k=1;k<=StepCount;k++)
			{
				String desc=g.getExcelCellValue(scenarios, scenarioName, k, 0);
				String keyword1=g.getExcelCellValue(scenarios, scenarioName, k, 1);
				String keyword3=g.getExcelCellValue(scenarios, scenarioName, k, 2);
				String keyword4=g.getExcelCellValue(scenarios, scenarioName, k, 3);
				logger.info(desc);
				logger.info("Reading keyword1:"+keyword1);
				logger.info("Reading keyword3:"+keyword3);
				logger.info("Reading keyword3:"+keyword4);
				
				if(keyword1.equalsIgnoreCase("sendKeys"))
				{
					lib.sendKeys(keyword3, keyword4);
				}
				else if(keyword1.equalsIgnoreCase("click"))
				{
					lib.click(keyword3);
				}
				else if(keyword1.equalsIgnoreCase("acceptAlertPopup"))
				{
					lib.acceptAlertPopup();
				}
				else if(keyword1.equalsIgnoreCase("checkAlertDisplayed"))
				{
					lib.checkAlertDisplayed();
				}
				else if(keyword1.equalsIgnoreCase("clearText"))
				{
					lib.clearText(keyword3);
				}
				else if(keyword1.equalsIgnoreCase("dismissAlertPopup"))
				{
					lib.dismissAlertPopup();
				}
				else if(keyword1.equalsIgnoreCase("verifyText"))
				{
					lib.verifyText(keyword3,keyword4);
				}
				else if(keyword1.equalsIgnoreCase("verifyTitle"))
				{
					lib.verifyTitle(keyword4);
				}
				else if(keyword1.equalsIgnoreCase("verifyElementPresent"))
				{
					lib.verifyElementPresent(keyword3);
				}
				else if(keyword1.equalsIgnoreCase("verifyElementNotPresent"))
				{
					lib.verifyElementNotPresent(keyword3);
				}
				else if(keyword1.equalsIgnoreCase("waitForSeconds"))
				{
					lib.waitForSeconds(keyword4);
				}
				else
				{
					logger.error("Invalid keyword:"+keyword1);
					FWLibrary.scriptStatus="FAIL";
				}
			}
			
	}
	
	
	public static void main(String[] args)
	{
		KeyDriver d=new KeyDriver();
		d.controllerExecutor();
	}

}

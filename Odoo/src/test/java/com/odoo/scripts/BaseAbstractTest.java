package com.odoo.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.odoo.features.LoginFeature;
import com.odoo.features.OdooHomeFeatures;
import com.odoo.generic.Driver;
import com.odoo.webutils.MyTestListener;

public abstract class BaseAbstractTest
{
	public static EventFiringWebDriver driver;
	LoginFeature lf;
	OdooHomeFeatures ohf;
	
	    // Declare feature class
	
	@BeforeClass
	public void setUp() {
		driver=new EventFiringWebDriver(Driver.getdriver());
		driver.register(new MyTestListener());
		driver.manage().window().maximize();
		lf=new LoginFeature(driver);
		ohf=new OdooHomeFeatures(driver);
		
		//initialize feature classes
		
	}
	
	@BeforeMethod
	public void preCondition() {
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(System.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	
	
}

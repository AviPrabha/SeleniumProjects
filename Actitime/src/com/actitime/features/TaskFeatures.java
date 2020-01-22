package com.actitime.features;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.ActiveProjCustPage;
import com.actitime.pageobjects.CreateNewCustPage;
import com.actitime.pageobjects.CreateNewProjPage;
import com.actitime.pageobjects.CreateNewTaskPage;
import com.actitime.pageobjects.EditCustInfoPage;
import com.actitime.pageobjects.EditProjInfoPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.OpenTaskPage;

public class TaskFeatures
{
WebDriver driver;
EnterTimeTrackPage ettp;
OpenTaskPage otp;
ActiveProjCustPage apcp;
CreateNewCustPage cncp;
EditCustInfoPage ecip;
CreateNewProjPage cnpp;
CreateNewTaskPage cntp;
EditProjInfoPage epip;


	public TaskFeatures(WebDriver driver) 
  {
	this.driver=driver;
	ettp=new EnterTimeTrackPage(driver);	
	otp=new OpenTaskPage(driver);
	apcp=new ActiveProjCustPage(driver);
	cncp=new CreateNewCustPage(driver);
	ecip=new EditCustInfoPage(driver);
	cnpp=new CreateNewProjPage(driver);
	cntp=new CreateNewTaskPage(driver);
	epip=new EditProjInfoPage(driver);
  }

// feature--> create customer
	public void createCustomer(String customerName) 
  {
	ettp.getTaskele().click();
	otp.getProjAndCustLink().click();
	apcp.getCreateNewCustBtn().click();
	cncp.getCustNameTextBx().sendKeys(customerName);
	cncp.getCreateCustSubmitBtn().click();
  }
	public void verifyCreateCustomer(String customerName) {
		String actualMsg = apcp.getSuccessMsgEle().getText();
		String expectedMsg="Customer \""+customerName+"\" has been successfully created.";
		Assert.assertEquals(actualMsg, expectedMsg);
		Reporter.log(expectedMsg, true);
	}
	
	//create Project Feature
	
	public void createProject(String customerName,String projectName) {
		ettp.getTaskele().click();
		otp.getProjAndCustLink().click();
		apcp.getCreateNewProjBtn().click();
		Select sel=new Select(cnpp.getSelDrpDwn());
		sel.selectByVisibleText(customerName);
		cnpp.getCustProj().sendKeys(projectName);
		cnpp.getCustProjectSubmitBtn().click();
	}
	
	public void verifyCreateProject(String projectName) {
		
		String actualMsg = apcp.getSuccessMsgEle().getText();
		String expMsg = "Project \""+projectName+"\" has been successfully created.";
		Assert.assertEquals(actualMsg, expMsg);
		Reporter.log(expMsg,true);
	}
	
	public void deleteProject() {
		ettp.getTaskele().click();
		otp.getProjAndCustLink().click();
		apcp.getProjectLink().click();
		ecip.getDelThisProjBtn().click();
		ecip.getDeleteBtn().click();
	}
	
	public void verifyDeleteProject(String expCustName) {
		String expMsg="Project has been successfully deleted.";
		String actualMsg=apcp.getSuccessMsgEle().getText();
		Assert.assertEquals(expMsg, actualMsg);
		Select sel1=new Select(apcp.getCustDrpDwn());
		List<WebElement> allOps = sel1.getOptions();
		for (int i = 0; i < allOps.size(); i++) {
			String actualCustName=allOps.get(i).getText();
			Assert.assertNotEquals(actualCustName, expCustName);
		}
		Reporter.log(expMsg,true);
	
	
	}
	public void logout() {
		apcp.getLogout();
	}
	
	public void deleteCustomer(String customerName) {
		ettp.getTaskele().click();
		otp.getProjAndCustLink().click();
		
		Select sel=new Select(apcp.getCustDrpDwn());
		sel.selectByVisibleText(customerName);
		apcp.getShowBtn().click();
		apcp.getCustomerLink().click();
		ecip.getDelThisBtn().click();
		ecip.getDeleteBtn().click();
	}
	
	public void verifyDeleteCustomer(String expCustomerName) {
		String expectedMsg="Customer has been successfully deleted.";
		String actualMsg=apcp.getSuccessMsgEle().getText();
		Assert.assertEquals(actualMsg, expectedMsg);
		Select sel=new Select(apcp.getCustDrpDwn());		
		List<WebElement> allOps = sel.getOptions();
		
		for (int i = 0; i < allOps.size(); i++) {
			String actualCustName = allOps.get(i).getText();
			Assert.assertNotEquals(actualCustName, expCustomerName);
		}
		Reporter.log(expectedMsg,true);
	}

	public void createTask(String customerName,String projectName,String taskName ) {
		ettp.getTaskele().click();
		otp.getCreateNewTaskBtn().click();
		
		Select sel=new Select(cntp.getSelCust());
		sel.selectByVisibleText(customerName);
		
		Select sel1=new Select(cntp.getSelProject());
		sel1.selectByVisibleText(projectName);
		cntp.getTaskNameTxtBx().get(0).sendKeys(taskName);
		cntp.getSelDate().get(0).click();
		cntp.getDeadline().click();
		
		Select sel2=new Select(cntp.getBillableDrpDwn());
		sel2.selectByVisibleText("Billable");
		cntp.getAddTimeTrack().get(0).click();
		
		cntp.getCreateTaskBtn().click();
	}
	
	public void verifyCreateTask(String customerName,String projectName) {
		String actualMsg=apcp.getSuccessMsgEle().getText();
		String expMsg="1 new task was added to the customer \""+customerName+"\", project \"Medical Software\".";
		Assert.assertEquals(actualMsg, expMsg);
		Reporter.log(expMsg,true);
	}
	
	public void deleteTask(String customerName,String projectName,String taskName) {
		
		
		
		
	}
	
	
}


















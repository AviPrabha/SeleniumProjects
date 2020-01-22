package com.actitime.scripts;

import org.testng.annotations.Test;
import com.actitime.features.LoginFeatures;
import com.actitime.features.TaskFeatures;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class TaskTest extends BaseLib {
@Test
public void createCustomer() {
	ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String username = eu.readData("Sheet1", 3, 1);
	String password = eu.readData("Sheet1", 3, 2);
	
	
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	
	String customerName = eu.readData("Sheet1",3, 3);
	TaskFeatures tf=new TaskFeatures(driver);
	tf.createCustomer(customerName);
	tf.verifyCreateCustomer(customerName);	
	//tf.logout();
}
	/*
	  @Test(dependsOnMethods = {"createCustomer"}) 
	  public void deleteCustomer() {
	  ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx"); String
	  username = eu.readData("Sheet1", 4, 1); 
	  String password =eu.readData("Sheet1", 4, 2);
	  LoginFeatures lf=new LoginFeatures(driver);
	  lf.login(username, password);
	  String customerName=eu.readData("Sheet1", 4, 3); 
	  TaskFeatures tf=new TaskFeatures(driver); 
	  tf.deleteCustomer(customerName);
	  tf.verifyDeleteCustomer(customerName); 
	  tf.logout();
	   }
	*/

@Test(dependsOnMethods = {"createCustomer"})
public void createProject() {
	ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String username = eu.readData("Sheet1", 5, 1);
	String password = eu.readData("Sheet1", 5, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	String customerName=eu.readData("Sheet1", 5, 3);
	String projectName =eu.readData("Sheet1", 5, 4);
	TaskFeatures tf=new TaskFeatures(driver);
	tf.createProject(customerName, projectName);
	tf.verifyCreateProject(projectName);
//	tf.logout();
}

@Test(dependsOnMethods = {"createProject"})
public void deleteProject() {
	ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String username = eu.readData("Sheet1", 3, 1);
	String password = eu.readData("Sheet1", 3, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	TaskFeatures tf=new TaskFeatures(driver);
	tf.deleteProject();

}


/*

@Test(dependsOnMethods = {"createProject"})
public void createTask() {
	ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String username = eu.readData("Sheet1", 5, 1);
	String password = eu.readData("Sheet1", 5, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	String customerName=eu.readData("Sheet1", 5, 3);
	String projectName =eu.readData("Sheet1", 5, 4);
	String taskName=eu.readData("Sheet1",5, 5);
	
	TaskFeatures tf=new TaskFeatures(driver);
	tf.createTask(customerName, projectName, taskName);
	tf.verifyCreateTask(customerName, projectName);
	tf.logout();
}
*/
}
















package com.actitime.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTaskPage {
@FindBy(name="customerId")
private WebElement selCust;

@FindBy(name="projectId")
private WebElement selProject;

@FindBy(xpath="//input[starts-with(@name,'task')]")
private List<WebElement> taskNameTxtBx;

@FindBy(css="img[id*='ext-gen']")
private List<WebElement> selDate;

@FindBy(xpath="//button[text()='today']")
private WebElement deadline;
	
@FindBy(name="task[0].billingType")
private WebElement billableDrpDwn;

@FindBy(xpath="//input[starts-with(@name,'task')]")
private List<WebElement> addTimeTrack;

@FindBy(css="input[value='Create Tasks']")
private WebElement createTaskBtn;

public CreateNewTaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getSelCust() {
	return selCust;
}

public WebElement getSelProject() {
	return selProject;
}

public List<WebElement> getTaskNameTxtBx() {
	return taskNameTxtBx;
}
public List<WebElement> getSelDate() {
	return selDate;
}

public WebElement getDeadline() {
	return deadline;
}

public WebElement getBillableDrpDwn() {
	return billableDrpDwn;
}

public List<WebElement> getAddTimeTrack() {
	return addTimeTrack;
}

public WebElement getCreateTaskBtn() {
	return createTaskBtn;
}
	
	
}

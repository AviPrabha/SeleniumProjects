package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProjInfoPage {

	@FindBy(css="input[value='Delete This Project']")
	private WebElement delProjEle;
	
	@FindBy(id="deleteButton")
	private WebElement deleteBtn;

	
	public EditProjInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDelProjEle() {
		return delProjEle;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	
}

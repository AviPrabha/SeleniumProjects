package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustInfoPage {
@FindBy (css="input[value='Delete This Customer']")
private WebElement delThisBtn;

@FindBy(css="input[value='Delete This Project']")
private WebElement delThisProjBtn;

@FindBy(id="deleteButton")
private WebElement deleteBtn;

public EditCustInfoPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getDelThisBtn() {
	return delThisBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}

public WebElement getDelThisProjBtn() {
	return delThisProjBtn;
}
	
	
}

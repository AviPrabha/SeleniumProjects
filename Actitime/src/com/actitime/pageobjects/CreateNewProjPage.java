package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProjPage {
@FindBy(name="customerId")
private WebElement selDrpDwn;

@FindBy(name="name")
private WebElement custProj;

@FindBy(name="createProjectSubmit")
private WebElement custProjectSubmitBtn;

public CreateNewProjPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCustDrpDwn() {
	return selDrpDwn;
}

public WebElement getSelDrpDwn() {
	return selDrpDwn;
}

public WebElement getCustProj() {
	return custProj;
}

public WebElement getCustProjectSubmitBtn() {
	return custProjectSubmitBtn;
}


	
	
}

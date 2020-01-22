package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustPage {
@FindBy(name="name")
private WebElement custNameTextBx;

@FindBy(name="createCustomerSubmit")
private WebElement createCustSubmitBtn;

public CreateNewCustPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCustNameTextBx() {
	return custNameTextBx;
}
public WebElement getCreateCustSubmitBtn() {
	return createCustSubmitBtn;
}
}

package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjCustPage extends BasePage
{

	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCustBtn;
	
	@FindBy(xpath="//table[@id='SuccessMessages']//span")
	private WebElement successMsgEle;
	
	@FindBy(name="selectedCustomer")
	private WebElement custDrpDwn;
	
	@FindBy (css="input[value*='Show']")
	private WebElement showBtn;
	
	@FindBy (xpath="//td[starts-with(@id,'customerName')]//a[contains(@href,'customerId')]")
	private WebElement customerLink;
	
	@FindBy(css="input[value='Create New Project']") 
	private WebElement createNewProjBtn;
	
	@FindBy(xpath="//td[starts-with(@id,'projectNameCell')]//a[contains(@href,'projectId')]")
	private WebElement projectLink;
	
	public ActiveProjCustPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewCustBtn() {
		return createNewCustBtn;
	}

	public WebElement getSuccessMsgEle() {
		return successMsgEle;
	}

	public WebElement getCustDrpDwn() {
		return custDrpDwn;
	}

	public WebElement getShowBtn() {
		return showBtn;
	}

	public WebElement getCustomerLink() {
		return customerLink;
	}

	public WebElement getCreateNewProjBtn() {
		return createNewProjBtn;
	}

	public WebElement getProjectLink() {
		return projectLink;
	}
	
	
	
	
	
}

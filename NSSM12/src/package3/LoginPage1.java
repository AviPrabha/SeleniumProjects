package package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	@FindBy(name="username")
	private WebElement unTxtBx;
	
	@FindBy(name="pwd")
	private WebElement pwdTxtBx;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement chkBx;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;

public LoginPage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUnTxtBx() {
	return unTxtBx;
}

public WebElement getPwdTxtBx() {
	return pwdTxtBx;
}

public WebElement getChkBx() {
	return chkBx;
}

public WebElement getLoginBtn() {
	return loginBtn;
}

}
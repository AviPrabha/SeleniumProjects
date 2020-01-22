package package3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import package1.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver=BrowserFactory.launchBrowser("chrome");
		driver.get("http://127.0.0.1/login.do");
	}
	
	@Test
	public void validLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.getUnTxtBx().sendKeys("admin");
		lp.getPwdTxtBx().sendKeys("manager");
		lp.getChkBx().click();
		lp.getLoginBtn().click();
	}
	
	@Test
	public void invalidLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.getUnTxtBx().sendKeys("admin");
		lp.getPwdTxtBx().sendKeys("12345");
		lp.getLoginBtn().click();
	}
}

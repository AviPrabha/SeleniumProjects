package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import package1.BrowserFactory;

public class Login1Test {

	WebDriver driver;

    @BeforeMethod
	public void preCondition() {
		driver=BrowserFactory.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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

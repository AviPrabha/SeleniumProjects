package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
		private WebElement unTxtBx;
		private WebElement pwdTxtBx;
		private WebElement chkBx;
		private WebElement loginBtn;
		
		public LoginPage(WebDriver driver) {
			unTxtBx=driver.findElement(By.name("username"));
			pwdTxtBx=driver.findElement(By.name("pwd"));
			chkBx=driver.findElement(By.id("keepLoggedInCheckBox"));
			loginBtn=driver.findElement(By.id("loginButton"));
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

package package3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFEandFEs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		String jsCode1="document.getElementById('user').setAttribute('value','admin')";
		je.executeScript(jsCode1);
		
		String jsCode2="document.getElementsByName('pwd')[0].value='12345'";
		je.executeScript(jsCode2);
		
		String jsCode3="document.getElementsByTagName('a')[0].click()";
		je.executeScript(jsCode3);
	}

}

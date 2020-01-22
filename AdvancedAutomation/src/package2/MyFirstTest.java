package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {
@Test
public void launchTest() {
WebDriverManager.chromedriver().setup();
//WebDriverManager.iedriver().setup();
//WebDriverManager.firefoxdriver().setup();
	
WebDriverManager.chromedriver().arch32().setup();
//WebDriverManager.chromedriver().arch64().setup();

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.quit();
}
}

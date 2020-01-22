package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainWindowSessionID {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String sessionID=driver.getWindowHandle();
	System.out.println(sessionID);

	}

}

package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PrivateFirefox {

	public static void main(String[] args) {
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--private");
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
	}
}

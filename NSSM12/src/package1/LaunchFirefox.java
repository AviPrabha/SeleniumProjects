package package1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
	}

}

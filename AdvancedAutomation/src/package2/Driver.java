package package2;

import org.openqa.selenium.WebDriver;

public class Driver {

	public static WebDriver wDriver;
	public static void setDriver(WebDriver driver) {
		wDriver=driver;
	}
	public static WebDriver getDriver() {
		return wDriver;
	}

}

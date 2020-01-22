package package1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumScreenshot {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumhq.org/download/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	File destFile=new File("./screenshots/FirstScreenshot.png");
	try {
		Files.copy(srcFile, destFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("screenshot has been taken");

	}

}

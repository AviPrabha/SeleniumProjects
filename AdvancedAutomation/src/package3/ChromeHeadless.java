package package3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ChromeHeadless {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		try {
			Files.copy(ts.getScreenshotAs(OutputType.FILE), new File("./screenshots/first.png"));
		} catch (WebDriverException  | IOException e) {
		
			e.printStackTrace();
	    }
		System.out.println("chrome headless");
	}
}

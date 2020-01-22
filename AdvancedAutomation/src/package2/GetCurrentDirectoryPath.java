package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentDirectoryPath {

	public static void main(String[] args) {
	String currentDir=System.getProperty("user.dir");
	System.out.println(currentDir);
	
	System.setProperty("webdriver.chrome.driver",currentDir+"/exefiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.close();
	}
}

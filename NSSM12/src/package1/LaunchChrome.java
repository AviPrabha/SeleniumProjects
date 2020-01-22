package package1;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		//cd.get("file:///C:/Users/AviPrabha/Desktop/NSSM12.html");
		cd.navigate().to("https://www.seleniumhq.org");
		Thread.sleep(2000);
		cd.navigate().back();
		Thread.sleep(2000);
		cd.navigate().forward();
		Thread.sleep(2000);
		cd.navigate().refresh();
		//cd.close();
	}
}

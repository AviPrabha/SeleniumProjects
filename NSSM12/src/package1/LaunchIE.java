package package1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
	}

}

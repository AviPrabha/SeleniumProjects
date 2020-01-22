package package1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./exefiles/MicrosoftWebDriver.exe");
		EdgeDriver ed=new EdgeDriver();
	}

}

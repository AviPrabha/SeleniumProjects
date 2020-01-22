package package2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListnerTest {
	 @Test
	  public void demo() {
		  Reporter.log("demo Script",true);
	  }
	 @Test
	  public void dummy() {
		  Reporter.log("dummy Script",true);
	  }
	 @Test(dependsOnMethods= {"dummy"})
	  public void prototype() {
		  Reporter.log("prototype Script",true);
	  }
  
}

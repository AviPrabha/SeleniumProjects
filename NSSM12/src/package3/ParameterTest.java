package package3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParameterTest {
 
  @BeforeMethod
  @Parameters({"browser","baseurl"})
  public void preCondition(String browserName,String url) {
	System.out.println(browserName);
	System.out.println(url);
  }
  
  @Test
  public void demo() {
	  System.out.println("demo Script");
  }
}

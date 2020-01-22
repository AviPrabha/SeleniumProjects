package package2;

import org.testng.annotations.Test;

public class NewTestUsingEnabled {
	 @Test
	  public void demo()
	  {
		  System.out.println("demo");
	  }
	  
	  @Test(enabled=false)
	  public void prototype()
	  {
		  System.out.println("prototype");
	  }
	  
	  @Test(enabled=false)
	  public void dummy()
	  {
		  System.out.println("dummy");
	  }
}

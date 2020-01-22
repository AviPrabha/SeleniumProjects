package package2;

import org.testng.annotations.Test;

public class NewTestPriority {
  @Test(priority=3)
  public void demo() { 
	  System.out.println("demo");
  }
  
  @Test(priority=1)
  public void prototype()
  {
	  System.out.println("prototype");
  }
  
  @Test(priority=2)
  public void dummy()
  {
	  System.out.println("dummy");
  }
}

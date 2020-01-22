package package2;

import org.testng.annotations.Test;

public class MultipleTimesTest {
  @Test(invocationCount=10)
  public void multiple() {
	  System.out.println("sample");
  }
}

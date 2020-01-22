package package2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
 
  @DataProvider
  public Object[][] getData() {
  Object[][] obj=new Object[3][2];
  //1stRow
  obj[0][0]="Sachin";
  obj[0][1]="Sehwag";
  //2nd Row
  obj[1][0]="Dhoni";
  obj[1][1]="Yuvraj";
  
  //3rd Row
  obj[2][0]="Virat";
  obj[2][1]="Rohit";
  
    return obj;
  }
  
    @Test(dataProvider = "getData")
    public void dataTest(String firstData, String secondData) {
    	System.out.println(firstData+","+secondData);
    }

  }
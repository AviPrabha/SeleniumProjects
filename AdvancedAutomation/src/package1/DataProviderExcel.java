package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
@DataProvider
public Object[][] getData() throws EncryptedDocumentException, IOException{
File file=new File("./excel/dataProvider1.xlsx");
FileInputStream fis=new FileInputStream(file);
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("sheet1");
int rowCount=sh.getLastRowNum();
Row rw = sh.getRow(0);
int cellCount=rw.getLastCellNum();

Object[][] obj=new Object[rowCount][cellCount];
	for (int i = 1; i <= rowCount ; i++) {
		Row row = sh.getRow(i);
		int colCount=row.getLastCellNum();
			for (int j = 0; j <colCount ; j++) {
				Cell cl=row.getCell(j);
				obj[i-1][j]=cl.getStringCellValue();
			}
	}
return obj;
}	

@Test(dataProvider = "getData")
public void dataTest(String firstData,String secondData,String thirdData) {
	System.out.println(firstData +" "+secondData+" "+thirdData);
}
}
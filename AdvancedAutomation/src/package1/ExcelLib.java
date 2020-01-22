package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib 
{
String filepath;

public ExcelLib(String filepath) 
{
	this.filepath=filepath;
}
	
	public Object[] readData(String testCaseID,String sheetName) throws EncryptedDocumentException, IOException 
	{
		Object[] obj=null;
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(new File(filepath));
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		for (int i = 1; i <= rowCount; i++) 
		{
			Row rw=sh.getRow(i);
			if (rw.getCell(0).toString().equalsIgnoreCase(testCaseID)) 
			{
				int cellCount=rw.getLastCellNum();
				obj=new Object[cellCount];
				for (int j = 0; j <cellCount; j++) 
				{
					obj[j]=rw.getCell(j).getStringCellValue();
				}
				break;
			}

		}
		return obj;
	}
}















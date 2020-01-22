package com.odoo.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
String filepath;
public ExcelUtilities(String filepath) {
	this.filepath=filepath;
}
public String[] readData(String testcaseID,String sheetName) {
	String[] value=null;
	
	try {
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		for (int i = 1; i <= rowCount; i++) 
		{
			if (sh.getRow(i).getCell(0).toString().equalsIgnoreCase(testcaseID)) {
				Row rw=sh.getRow(i);
				int cellCount=rw.getLastCellNum();
				value=new String[cellCount];

				for (int j = 0; j <cellCount; j++) 
				{
					Cell cl=rw.getCell(j);
					
					switch (cl.getCellType()) {

					case STRING:
						value[j]=cl.getStringCellValue();
						break;
						
					case NUMERIC:
						if (DateUtil.isCellDateFormatted(cl)) {
							SimpleDateFormat sdf=new SimpleDateFormat("");
							value[j]=sdf.format(cl.getDateCellValue());
						} else {
							long numValue=(long) cl.getNumericCellValue(); 
							value[j]=Long.toString(numValue);
						}
						break;
					
					case BOOLEAN:
						value[j]=Boolean.toString(cl.getBooleanCellValue());
						break;

					default:
						break;
					}	//end of switch case
				} // end of cell loop
				break;
			} //end of if
		}	// end of row loop
		
	} catch(EncryptedDocumentException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	return value;
}
}
package package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumericExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File file=new File("C:/Users/AviPrabha/Desktop/dataSheet1.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row rw = sh.getRow(2);
	Cell cl = rw.getCell(1);
//		double value=cl.getNumericCellValue();
//		System.out.println(value);
//		long exactValue=(long)value;
//		System.out.println(exactValue);
	//or
	long value=(long)cl.getNumericCellValue();
	System.out.println(value);
	}

}

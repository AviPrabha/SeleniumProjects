package package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetName {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:/Users/AviPrabha/Desktop/dataSheet1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		int SheetCount=wb.getNumberOfSheets();
		System.out.println("Total No: "+SheetCount);
		for (int i = 0; i < SheetCount; i++) {
			Sheet sh=wb.getSheetAt(i);
			String sheetName=sh.getSheetName();
			System.out.println(sheetName);
		}
		
	}

}

package package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRowAndCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:/Users/AviPrabha/Desktop/dataSheet1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		System.out.println("Total Row: "+rowCount);
		for (int i = 0; i < rowCount; i++) {
			Row rw=sh.getRow(i);
			int cellCount=rw.getLastCellNum();
			System.out.println("Row: "+i+" Total Cells:"+cellCount);
		}
	}

}

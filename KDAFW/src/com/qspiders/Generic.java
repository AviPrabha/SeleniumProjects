package com.qspiders;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic
{
	public int getExcelRowCount(String xlPath,String sheetName)
	{
		try
		{
			FileInputStream fis=new FileInputStream(xlPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			int rc=s.getLastRowNum();
			return rc;
		}
		catch(Exception e)
		{
			return -1;
		}
		
	}

	public String getExcelCellValue(String xlPath,String sheetName,int row,int cell)
	{
		try
		{
			FileInputStream fis=new FileInputStream(xlPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			Cell c = s.getRow(row).getCell(cell);
			if(c.getCellType()==CellType.NUMERIC)  //numeric
			{
				return ""+(long)c.getNumericCellValue();
			}
			else   //string
			{
				return c.getStringCellValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
}

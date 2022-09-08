package objects;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pom.base.Testbase;

public class ExcelFileReader{
	
	
	
	public ExcelFileReader() throws IOException
	{
		FileInputStream file = new FileInputStream("E:\\HybridFrameWork\\TestCase.xlsx\\TestCase.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		sheet.getRow(0).getCell(0).getStringCellValue();
		  
	}

	
}

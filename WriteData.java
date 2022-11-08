package com.mohs10.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData 
{
	@Test
	public void enterdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\ExcelAutomate2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet1").createRow(5).createCell(5).setCellValue("sapiens");
		FileOutputStream fos= new FileOutputStream("D:\\ExcelAutomate2.xlsx");
		wb.write(fos);
		
	}
}

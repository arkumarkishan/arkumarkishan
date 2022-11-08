package com.mohs10.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData 
{
	@Test
	public void fetchdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\ExcelAutomate2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getSheet("Sheet1").getRow(5).getCell(5).toString());
	}
}

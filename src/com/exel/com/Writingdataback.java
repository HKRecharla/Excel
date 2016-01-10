package com.exel.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writingdataback 
{
	public static void main(String[] args) throws IOException, InvalidFormatException 
	{
		

	String xpath = "E://Harikrishna.xls";
	FileInputStream fis=new FileInputStream(xpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s1 = wb.getSheet("Sheet1");
	s1.getRow(0).getCell(0).setCellValue("java");
	s1.getRow(0).createCell(1).setCellValue("sql");
	s1.createRow(1).createCell(0).setCellValue("unix");
	FileOutputStream fos=new FileOutputStream(xpath);
	wb.write(fos);
}
}

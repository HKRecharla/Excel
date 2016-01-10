package com.exel.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelhhh 
{
public static void main(String[] args) throws IOException, InvalidFormatException 
{
	FileInputStream fis=new FileInputStream("./exelfiles/Hari.xls");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("sheet1");
	String v = s.getRow(0).getCell(1).getStringCellValue();
	System.out.println(v);
	
	
	
}
}

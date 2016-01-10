package com.exel.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheet1nd2 
{
public static void main(String[] args) throws InvalidFormatException, IOException 
{
	FileInputStream a=new FileInputStream("I://Hari.xls");
	Workbook b = WorkbookFactory.create(a);
	Sheet s1 = b.getSheet("sheet1");	
	String f1 = s1.getRow(0).getCell(0).getStringCellValue();
	System.out.println(f1);
	Sheet s2 = b.getSheet("sheet2");
	s2.createRow(0).createCell(0).setCellValue(f1);
	FileOutputStream fos=new FileOutputStream("I://Hari.xls");
	b.write(fos);
	
}
}

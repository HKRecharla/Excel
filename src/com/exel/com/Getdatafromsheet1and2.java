package com.exel.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getdatafromsheet1and2 
{
public static void main(String[] args) throws IOException, InvalidFormatException 
{
	String xpath = "I:/Exel/exelfiles/Hari.xls";
	FileInputStream fis=new FileInputStream(xpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s1 = wb.getSheet("Sheet1");
	Sheet s2 = wb.getSheet("sheet2");
	Row r = s1.getRow(0);
	Cell c = r.getCell(1);	
	Row r1 = s2.getRow(0);
	Cell c1 = r1.getCell(1);	
}
}

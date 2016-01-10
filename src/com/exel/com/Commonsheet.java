package com.exel.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Commonsheet 
{
public static void main(String[] args) throws InvalidFormatException, IOException 
{
String xpath = "I:/Hari.xls";
FileInputStream fis=new FileInputStream(xpath);
Workbook wb=WorkbookFactory.create(fis);
Sheet s1 = wb.getSheet("sheet1");
String r = s1.getRow(0).getCell(0).getStringCellValue();
String r1 = s1.getRow(0).getCell(1).getStringCellValue();
String r2 = s1.getRow(1).getCell(0).getStringCellValue();
String r3 = s1.getRow(1).getCell(1).getStringCellValue();
System.out.println(r);
System.out.println(r1);
System.out.println(r2);
System.out.println(r3);
int rc = s1.getLastRowNum();
System.out.println("Row count is:"+rc);
s1.getRow(1).createCell(1).setCellValue("hari");
}
}

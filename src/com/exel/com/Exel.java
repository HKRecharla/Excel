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
import org.openqa.jetty.log.Factory;

public class Exel 
{
public static void main(String[] args) throws IOException, InvalidFormatException 
{
String xpath = "E://Harikrishna.xls";
FileInputStream fis=new FileInputStream(xpath);
Workbook wb=WorkbookFactory.create(fis);
Sheet s1 = wb.getSheet("Sheet1");
Row r = s1.getRow(0);
Cell c = r.getCell(0);
s1.getRow(0).getCell(1).setCellValue("java");
String v = c.getStringCellValue();
System.out.println(v);

}
}

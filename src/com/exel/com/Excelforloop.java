package com.exel.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelforloop 
{
public static void main(String[] args) throws InvalidFormatException, IOException 
{
	String xpath = "I://Exel//exelfiles//Hari.xls";
FileInputStream fis=new FileInputStream(xpath);	
Workbook wb=WorkbookFactory.create(fis);
Sheet s1 = wb.getSheet("sheet1");
int rc = s1.getLastRowNum();
for (int i = 0; i < rc; i++) 
{
Row r = s1.getRow(i);	
short cc = r.getLastCellNum();
for (int j = 0; j < cc; j++)
{
String v = r.getCell(j).getStringCellValue();	
System.out.println(v+" ");
}
System.out.println();
}

}
}

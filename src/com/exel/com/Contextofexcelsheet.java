package com.exel.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Contextofexcelsheet 
{
public static void main(String[] args) 
		throws IOException, InvalidFormatException 
{
FileInputStream a=new FileInputStream("I://Exel//exelfiles//Hari.xls");
Workbook b = WorkbookFactory.create(a);
Sheet c = b.getSheet("sheet1");
int d = c.getLastRowNum();
for (int i = 0; i <=d; i++) 
{
Row e = c.getRow(i);
short f = e.getLastCellNum();
for (int j = 0; j < f; j++)
{
	String h = e.getCell(j).getStringCellValue();
	System.out.print(h+"");
}
System.out.println();
}

}
}

package com.exel.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Countofrowspresentinexcel 
{
public static void main(String[] args) throws IOException, InvalidFormatException 
{
FileInputStream a=new FileInputStream("I:/Exel/exelfiles/Hari.xls");
Workbook b = WorkbookFactory.create(a);
Sheet c = b.getSheet("sheet1");
int d = c.getLastRowNum();
System.out.println(d);


}
}

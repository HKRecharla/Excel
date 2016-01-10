package com.exel.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelpractice 
{
public static void main(String[] args) throws IOException, InvalidFormatException 
{
String xpath = "I:/Exel/exelfiles/Hari.xls";	
FileInputStream a=new FileInputStream(xpath);
Workbook b = WorkbookFactory.create(a);
Sheet c = b.getSheet("Sheet1");
Row d = c.getRow(0);
Cell e = d.getCell(0);
System.out.println(e);

}
}

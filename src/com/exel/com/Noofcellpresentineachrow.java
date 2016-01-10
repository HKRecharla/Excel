package com.exel.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Noofcellpresentineachrow 
{
public static void main(String[] args) throws IOException, InvalidFormatException 
{
FileInputStream a=new FileInputStream("I:/Exel/exelfiles/Hari.xls");
Workbook b = WorkbookFactory.create(a);
Sheet c = b.getSheet("sheet1");
int d = c.getLastRowNum();
for (int i = 0; i < 4; i++) 
{
	short e = c.getRow(i).getLastCellNum();
	System.out.println(e);
}


}
}

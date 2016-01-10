package com.lib;

import java.io.FileInputStream;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Excellib 
{
public static int count(String xpath,String sheetname)
{
	try 
	{
	FileInputStream fis=new FileInputStream(xpath);
	Workbook wb = WorkbookFactory.create(fis);
	
	int rc = wb.getSheet(sheetname).getLastRowNum();
	return rc;
	}
	catch (Exception e) 
	{
		return -1;
		
	}
//	String getcellvalue(String xpath1,String sheetname1,int rownum,int cellnum)
//	{
//		try 
//		{
//			FileInputStream fis=new FileInputStream(xpath1);
//			Workbook wb = WorkbookFactory.create(fis);
//			String v = wb.getSheet(sheetname1).getRow(rownum).getCell(cellnum).getStringCellValue();
//			return v;
//		}
//		catch (Exception e) 
//		{
//			return "";
//		}
//	}

	
}
}

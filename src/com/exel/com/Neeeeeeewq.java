package com.exel.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Neeeeeeewq 
{
public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
String xpath = "I://Hari.xls";	
FileInputStream fis=new FileInputStream(xpath);
Workbook wb=WorkbookFactory.create(fis);
Sheet s1 = wb.getSheet("sheet1");

String f2 = s1.getRow(2).getCell(0).getStringCellValue();
String f1 = s1.getRow(1).getCell(0).getStringCellValue();
s1.getRow(3).getCell(0).setCellValue("Hari");
System.out.println(f1);
System.out.println(f2);

String v = s1.getRow(0).getCell(0).getStringCellValue();
driver.get(v);
List<WebElement> a = driver.findElements(By.xpath("//a"));
int b = a.size();
System.out.println(b);
for (int i = 0; i <=a.size(); i++) 
{
WebElement c = a.get(i);
String x = c.getText();	
System.out.println(x);
s1.createRow(4).createCell(0).setCellValue(x);
}
FileOutputStream z=new FileOutputStream(xpath);
wb.write(z);
driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(f1);
driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(f2);
driver.findElement(By.xpath(".//*[@id='signIn']")).click();
Thread.sleep(10000);
driver.quit();
System.out.println("browser is closed");
}
}

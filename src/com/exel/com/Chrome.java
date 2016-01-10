package com.exel.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
//System.setProperty("WebDriver.chrome.driver","I://chromedriver.exe");
//WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
List<WebElement> a = driver.findElements(By.xpath("//a"));
int b = a.size();
System.out.println(b);
for (int i = 0; i <=b; i++) 
{
WebElement c = a.get(i);
String d = c.getText();
int e = d.length();	
System.out.println(d);
System.out.println(e);
System.out.println(c);
}
Thread.sleep(2000);
driver.close();
}
}


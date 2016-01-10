package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.gmail.com");
driver.findElement(By.id("Email")).sendKeys("harsha4030");
driver.findElement(By.id("Passwd")).sendKeys("97894403571");
driver.findElement(By.id("signIn")).click();

}
}

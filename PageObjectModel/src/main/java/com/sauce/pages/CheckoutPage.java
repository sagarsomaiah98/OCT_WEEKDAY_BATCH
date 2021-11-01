package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class CheckoutPage extends TestBase {
	 
    public WebElement Fname=driver.findElement(By.xpath("//input[@id='first-name']"));
    public WebElement Lname=driver.findElement(By.xpath("//input[@id='last-name']"));
    public WebElement ZipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
    
    public WebElement ContinueOrder=driver.findElement(By.xpath("//input[@id='continue']"));

}

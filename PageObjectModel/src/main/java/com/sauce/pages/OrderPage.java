package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class OrderPage extends TestBase {
	
	public WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
	
     public WebElement ContinueShopping=driver.findElement(By.xpath(" //button[@id='continue-shopping']"));
     
     public WebElement RemoveItem=driver.findElement(By.xpath(" //button[@id='remove-sauce-labs-backpack']"));
    
     
     
     
    
     
     
}

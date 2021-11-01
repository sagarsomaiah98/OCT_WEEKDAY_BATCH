package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class HomePage extends TestBase{
	
	public WebElement AddToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	
	public WebElement Cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	
//	public WebElement Remove=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	
	public WebElement ItemTitle=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));

}

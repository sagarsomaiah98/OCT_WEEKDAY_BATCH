package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class CheckOutCompletePage extends TestBase {
 public WebElement ThankOrder=driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"));
     
     public WebElement BackHome=driver.findElement(By.xpath("//button[@id='back-to-products']"));

}

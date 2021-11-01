package com.sauce.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.CheckoutOverViewPage;
import com.sauce.pages.CheckoutPage;
import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.OrderPage;
import com.sauce.testbase.TestBase;

public class OrderTest extends TestBase {
	
	
	@BeforeMethod
	public void intial() {
		
		intialize();	
	}
	
	
	@Test
	
	public void OrderTest() throws InterruptedException {
		
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce");
		
		HomePage h= new HomePage();
		
		h.AddToCart.click();
		h.Cart.click();
		
		
		  OrderPage o= new OrderPage();
		  Thread.sleep(2000);
		  o.checkout.click();
		  Thread.sleep(2000);
			
		  CheckoutPage c= new CheckoutPage();
		  
		 c.Fname.sendKeys("sam");
		 c.Lname.sendKeys("winchester");
		 c.ZipCode.sendKeys("12345");
         c.ContinueOrder.click();
         Thread.sleep(3000);
         
         CheckoutOverViewPage co= new CheckoutOverViewPage();
         co.Finish.click();
		
		
		
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}

package com.sauce.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void intial() {
		
		intialize();	
	}
	
	@Test
	public void Valid_Logintest() {
		
		
	
	LoginPage l= new LoginPage();
	l.login("standard_user", "secret_sauce");
		
		
	}
	
	@Test
	public void Invalid_Logintest() {
		
		
		
		LoginPage l= new LoginPage();
		l.login("standard_user", "secret_sauce1");
			
			
		}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}

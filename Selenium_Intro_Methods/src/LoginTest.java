import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
		//Launch chrome browser	
		WebDriver driver= new ChromeDriver();

		//shortcut to import all the packages is ctrl+shift_O
		//Navigate to the url
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//implicit wait or maximum timeout
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']"	)).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		boolean flag=true;
		try {
		driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		flag=true;
		}
		catch(Exception e) {
			
			flag=false;
		}
		
		if(flag)
			System.out.println("TEST PASS");
		else
			System.out.println("TEST FAIL");
		
			

	}

}

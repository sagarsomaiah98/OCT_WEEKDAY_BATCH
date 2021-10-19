import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_With_Different_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
		//Launch chrome browser	
		WebDriver driver= new ChromeDriver();

		//shortcut to import all the packages is ctrl+shift_O
		//Navigate to the url
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//implicit wait or maximum timeout
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password"	)).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
	}

}

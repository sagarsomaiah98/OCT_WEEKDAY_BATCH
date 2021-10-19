import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
		//Launch chrome browser	


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		//shortcut to import all the packages is ctrl+shift_O
		//Navigate to the url
		

		driver.navigate().to("https://www.bing.com/");
		
		Thread.sleep(2000);
		driver.navigate().to("http://www.ebay.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.janbask.com");
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}

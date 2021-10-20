import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
//Launch chrome browser	


WebDriver driver= new ChromeDriver();

//shortcut to import all the packages is ctrl+shift_O
//Navigate to the url
driver.get("https://www.saucedemo.com/");
//or

//d.navigate().to("https://www.bing.com/");
//Maximize the browser

driver.manage().window().maximize();

//to get the title of page

String title= driver.getTitle();

System.out.println(title);

Thread.sleep(3000);

//close the browser

//driver.close();

driver.quit();



		
	}

}

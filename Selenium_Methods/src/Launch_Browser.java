import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		//https://chromedriver.chromium.org/downloads
		
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
		
		//WebDriver driver= new ChromeDriver();
		
		//Launch Firefox browser
		//https://github.com/mozilla/geckodriver/releases
		
		System.setProperty("webdriver.gecko.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\geckodriver.exe");
		
	//	WebDriver driver1= new FirefoxDriver();
		
		
		WebDriver driver2= new SafariDriver();
		

	}

}

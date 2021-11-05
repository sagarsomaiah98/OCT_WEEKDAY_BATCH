import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLoginExcelData {

	public static void main(String[] args) throws InterruptedException {
		
		
		  
		
		
		Xls_Reader xls= new Xls_Reader("TESTDATA\\SAUCE_LOGIN.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		System.out.println("rowCount = "+rowCount);
		
		
		for(int i=2;i<=rowCount;i++) {
			
			String username=xls.getCellData("SAUCE", "USERNAME", i);
			String password=xls.getCellData("SAUCE", "PASSWORD", i);
			
			
			System.out.println(username+"  "+password);
			
			
			System.setProperty("webdriver.chrome.driver",
					  "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
					  
					  WebDriver driver=new ChromeDriver();
					  driver.manage().window().maximize();
					  driver.get("https://www.saucedemo.com/");
					  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys( username);
					  driver.findElement(By.xpath("//input[@id='password']")).sendKeys( password);
					  driver.findElement(By.xpath("//input[@id='login-button']")).click();
					  Thread.sleep(2000);
					 driver.close();
			
			
			
		}
		
		
		
		
	}

}

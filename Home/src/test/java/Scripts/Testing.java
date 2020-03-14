package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Batch240\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.guru99.com/");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); //Implicit wait
		//WebDriverWait wait = new WebDriverWait(driver,300);//Explicit wait
		
		driver.findElement(By.xpath("div[@class='featured-box cloumnsize1']//h4[1]//b[1]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//li[@class='fa fa-chevron-circle-right']//a[contains(text(),'Software Testing')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'QTP (Quick Test Professional)')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Selenium')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobile App Testing')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Cucumber Testing')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Agile Testing')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'JUnit')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'RPA')]")).click();
		driver.navigate().back();
					
	}

}

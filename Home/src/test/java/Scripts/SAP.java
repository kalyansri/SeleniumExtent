package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SAP {

	//public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Batch240\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); //Implicit wait
		//WebDriverWait wait = new WebDriverWait(driver,300);//Explicit wait
		
		public static void navigateSAP(WebDriver driver) {
			driver.navigate().to("https://www.guru99.com/");
		
		//driver.findElement(By.xpath("//div[@class='row featured-boxes']//div[2]//div[1]//h4[1]")).click();
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP Beginner')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP ABAP')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP HR/HCM')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP FICO')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP Basis')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP SD')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP CRM')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP MM')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP Payroll')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP BI/BW')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP PP')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP QM')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'SAP HANA')]")).click();
		driver.navigate().back();
		AI.navigateAI(driver);
		}

}


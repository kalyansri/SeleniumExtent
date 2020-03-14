package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AI {

	/*public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Batch240\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.guru99.com/");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); //Implicit wait
		//WebDriverWait wait = new WebDriverWait(driver,300);//Explicit wait
*/		public static void navigateAI(WebDriver driver) {
	driver.navigate().to("https://www.guru99.com/");
	//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//b[contains(text(),'AI')]")).click();
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'TensorFlow')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'R Programming')]")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'NLTK')]")).click();
		driver.navigate().back();
		
			}}



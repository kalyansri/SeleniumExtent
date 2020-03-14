package Guru999.Home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Scripts.AI;
import Scripts.SAP;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {

public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\Batch240\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.navigate().to("https://www.guru99.com/");
		 * driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 */ //Implicit wait
		
		/*@Test
		public void Test1() {
		AI.navigateAI(driver);
		}*/
		
		
		//SAP.navigateSAP(driver);
		
	}}



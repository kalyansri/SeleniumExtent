package GuruTeset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuruHome {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="guru99")
	private WebElement guru99;
	
	@SuppressWarnings("deprecation")
	public GuruHome(WebDriver driver) {
	this.driver=driver;
	int timeOutInSeconds;
	//this.wait= new WebDriverWait(driver, timeOutInSeconds); 
	}
 public void goTo() {
	 this.driver.get("https://www.guru99.com/");
	 this.wait.until(ExpectedConditions.visibilityOf(this.guru99));
	  }
 
 
 }
 
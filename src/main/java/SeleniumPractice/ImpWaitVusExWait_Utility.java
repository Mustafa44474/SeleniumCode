package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpWaitVusExWait_Utility {
static WebDriver driver;
	

	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("http://classic.crmpro.com/");
	
		By pwd=By.name("password");
		By login=By.xpath("//input[@value='login']");
			By userName=By.name("username");
			WebDriverWait wait = new WebDriverWait(driver,5);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(login));
			
			


		
		
		
		
		
		
		
		waitForPresenceofElement(userName, 5).sendKeys("Test");
		
		
	}
	public static WebElement waitForPresenceofElement(By locator, int timeou) {
		WebDriverWait wait =new WebDriverWait(driver, timeou);
		return 	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
			
	}


}

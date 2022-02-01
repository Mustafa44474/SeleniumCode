package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitforClick {

	static WebDriver driver;
	public static void main(String[] args) {
		driver =new FirefoxDriver();
		driver.get("https://www.freshworks.com/");
		WebDriverWait wait =new WebDriverWait(driver,10);
		By fortoPWD= By.linkText("Forgot Passwrod");
		WebElement fortElemen =wait.until(ExpectedConditions.elementToBeClickable(fortoPWD));
		fortElemen.click();
		By footerLinks=By.cssSelector("ul.footer-nav li a");
		WebDriverWait wait1 =new WebDriverWait(driver, 10);
		List <WebElement> footerList =wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
	
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitForNoWebElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new FirefoxDriver();
		driver.get("https://www.dollartree.com/");
		By quickOrder= By.xpath("//span[text()='Catalog Quick Order']");
		 //https://www.dollartree.com/
		WebDriverWait wait = new WebDriverWait(driver, 05);
		wait.until(ExpectedConditions.presenceOfElementLocated(quickOrder)).click();
	boolean flag=	wait.until(ExpectedConditions.urlContains("catalog-quick-order"));
	System.out.println(flag);
		
		
		
		
		
		
		
		
 
		
		
		

	}
	public static void WebDriverWaitForNoWebElement(String string, int i) {
		// TODO Auto-generated method stub
		
	}
	public boolean waitforUrltobe(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));
	}

}

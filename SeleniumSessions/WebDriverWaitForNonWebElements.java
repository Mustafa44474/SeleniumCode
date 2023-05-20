package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements {

	static WebDriver driver;

	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		String title = eleUtil.waitForTitleToBe("Rediff", 5);
		System.out.println("page title is: " + title);
		
		//By quickOrder = By.xpath("//span[text()='Catalog Quick Order']");
		By signButton = By.name("proceed");
		
		eleUtil.waitForElementPresent(signButton, 10).click();
		
		//eleUtil.waitForElementPresent(quickOrder, 10).click();
		
		//url:
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		boolean flag = wait.until(ExpectedConditions.urlContains("catalog-quick-order"));
//		System.out.println(flag);
		
//		if(eleUtil.waitForUrlToBe("catalog-quick-order", 10)) {
//			System.out.println("Correct quick order url....");
//		}
		
		//alerts:
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
		eleUtil.acceptJSAlert(5);
		
		
		
		
	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethods {
	static WebDriver driver;

	public static void main(String[] args) {

		//actions click and sendkeys
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		By forgotPwdLink = By.linkText("Forgotten Password");
		
//		Actions action = new Actions(driver);
//		
//		action.sendKeys(driver.findElement(email), "naveen@gmail.com").perform();
//		action.sendKeys(driver.findElement(password), "naveen123").perform();
//		
//		action.click(driver.findElement(loginButton)).perform();
//		action.click(driver.findElement(forgotPwdLink)).perform();
		doActionsSendKeys(email, "naveen@gmail.com");
		doActionsSendKeys(password, "naveen123");
		doActionsClick(loginButton);
		doActionsClick(forgotPwdLink);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	

}

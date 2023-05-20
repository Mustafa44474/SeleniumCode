package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// two types of waits:
		// static wait: Thread.sleep(10000)
		// dynamic wait: imp wait & Exp Wait --> a. WebDriverWait b. FluentWait --> both
		// implements Wait Interface

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");

		By forgotPwd = By.linkText("Forgot Password?");
		waitForElementWithFluentWait(forgotPwd, 10, 1).click();

//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class);
//
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
//		ele.click();

	}

	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}

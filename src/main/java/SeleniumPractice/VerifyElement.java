package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		List<WebElement> fogtPass = driver.findElements(By.linkText("Forgotten Password"));
		System.out.println(fogtPass.size());
		if (fogtPass.size() > 0) {
			System.out.println("The Elemnt isDisplayed Found: ");

		} else {
			System.out.println("The Element isDisplayed not found");
		}

	}
	public static boolean checkElementPresent(By locator ) {
		List<WebElement> eleList = driver.findElements(locator);
		System.out.println(eleList.size());
		if (eleList.size() > 0) {
		return true;

		} else {
			System.out.println("The Element isDisplayed not found");
		}
		return false;

		
	}

}

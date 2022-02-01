package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDiplayMethod {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By url = By.id("Form_submitForm_subdomain");
		By fullName = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");
		By submit = By.id("Form_submitForm_action_request");
		driver.findElement(url).isDisplayed();
		System.out.println(driver.findElement(url).isDisplayed());
		System.out.println(driver.findElement(fullName).isDisplayed());
		System.out.println(driver.findElement(phone).isDisplayed());
		System.out.println(driver.findElement(email).isDisplayed());

		doIsDisplayMethod(url);
		doIsDisplayMethod(phone);
		doIsDisplayMethod(email);
		doIsDisplayMethod(fullName);

		if (doIsDisplayMethod(url)) {
			System.out.println("Url is displayed:  ");

		} else {
			System.out.println("Url is Not displayed ");
		}

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static boolean doIsDisplayMethod(By locator) {
		return getElement(locator).isDisplayed();

	}

}

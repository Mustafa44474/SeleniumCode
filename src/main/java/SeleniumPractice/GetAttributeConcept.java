package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By email = By.id("Form_submitForm_Email");
		By fullName = By.id("Form_submitForm_Name");
		String emailPlaceHolder = driver.findElement(email).getAttribute("placeholder");
		System.out.println(emailPlaceHolder);
		String fullName_PlaaceHolder = driver.findElement(fullName).getAttribute("placeholder");
		System.out.println(fullName_PlaaceHolder);

		String privatePolicy = driver.findElement(By.linkText("Privacy Policy")).getAttribute("href");

		System.out.println(privatePolicy);
	}

	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}
	public String doGetAttribute(By locator, String attributeNmae) {
		return getElement(locator).getAttribute(attributeNmae);


	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

}

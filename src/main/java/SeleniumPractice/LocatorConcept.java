package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://classic.crmpro.com/index.html");

		// By.ID

		By url = By.id("Form_submitForm_subdomain");
		By fullName = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");
		By submit = By.id("Form_submitForm_action_request");
//		getElement(url).sendKeys("WWW.Yahoo.com");
//		getElement(fullName).sendKeys("Mustafa");
//		getElement(email).sendKeys("Mustafa@google.com");
//		getElement(phone).sendKeys("99999999999999");
//		getElement(submit).click();

		// Create a webElemen(By using some locatro --> Perform Action on it ... (Click,
		// SendKey,Gettext:)

		// driver.findElement(By.id("input-email")).sendKeys("gmustafasiddiqi1@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("Mustaf@321");

		// WebElement email =driver.findElement(By.id("input-email"));
		// WebElement pwd =driver.findElement(By.id("input-password"));
		// email.sendKeys("Mustafa@yahoo.com");
		// pwd.sendKeys("PPM@21");

		// By email =By.id("input-email");
		// By pwd =By.id("input-password");
		// driver.findElement(email).sendKeys("Mustafa@yahoo.com");
		// driver.findElement(pwd).sendKeys("Mustafa@321");

		// getElement(email).sendKeys("Best@gmail.com");
		// getElement(pwd).sendKeys("OPP@321");
//		doSenKeys(fullName, "Abdullah");
//		doSenKeys(phone, "5555555555");
//		doSenKeys(email, "M.@ahoo.com");
//		doSenKeys(url, "goodwell");
//		doClick(submit);
		// By Name
//		driver.findElement(By.name("username")).sendKeys("Batch Automation");
//		driver.findElement(By.name("password")).sendKeys("test@123");

		
		// Class Name 
		//form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
		//	driver.findElement(By.className("login-email"));
		// driver.findElement(By.className("login-password"));
		
		
		// 4- X path:
		
		//driver.findElement(By.linkText("//*[@id=\"Form_submitForm_Name\"]"));
		
		
		//5 CssSelector 
		driver.findElement(By.cssSelector("#Form_submitForm_subdomain"));
		
		//6-[[[[[[[ Linktext
		By privatePolicy = By.linkText("Privacy Policy");
		doClick(privatePolicy);
		
		//7: Partial Linktext
		By privateP= By.partialLinkText("Policy");
		doClick(privatePolicy);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSenKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}

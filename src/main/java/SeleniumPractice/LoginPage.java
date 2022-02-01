package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
static WebDriver driver;
	public static void main(String[] args) {
	 
		
//		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebDriverFactory wf = new WebDriverFactory();
		//WebDriver driver = 	wf.init_driver("Chrome");
		WebDriver driver = wf.init_driver("Firefox");
		wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("Page Title is: "+ wf.getTtilePage());
		System.out.println(driver.getCurrentUrl());
	
		

		By url = By.id("Form_submitForm_subdomain");
		By fullName = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");
		By submit = By.id("Form_submitForm_action_request");
		
		
		ElementUtil ele= new ElementUtil(driver);
		ele.doSenKeys(url, "Test Automation");
		ele.doSenKeys(email, "Test Automation@yahoo.com");
		ele.doSenKeys(fullName, " WebApp Automation");
		ele.doSenKeys(phone, "77777777");
		ele.doClick(submit);
		
		//wf.closeBrowser();
	}

}
 
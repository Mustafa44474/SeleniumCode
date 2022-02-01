package TestNgSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseTest {
	static WebDriver driver;
	
	@Parameters("{browser")
	@BeforeMethod
	 public void setup(String brwoserName) {
		
		switch (brwoserName) {
		case "Chrome":
			  driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
		 
			driver= new SafariDriver();
			break;

		default:
			System.out.println("Please Pass the Correct BrowserName ");
			
			break;
		}
		
		
		
		
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().fullscreen();
		 driver.manage().deleteAllCookies();
		 
	 }
	
	
	 @AfterMethod
	 public void tearDwon() {
		  driver.quit();
	 }
	
	

}

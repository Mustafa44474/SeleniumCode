package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 //WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
	   // WebDriver driver = new FirefoxDriver();
	    driver.get("https://classic.crmpro.com/index.html");
		 
	}
		 
}

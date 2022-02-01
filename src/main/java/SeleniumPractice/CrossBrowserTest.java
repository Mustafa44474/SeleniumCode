package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	static WebDriver driver; 

	public static void main(String[] args) {
		
		
		String browser = "Teting";
		if (browser.equals("Chrome")) {  
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C;\\downlod\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		else if (browser.equals("FireFox")) {
			//System.setProperty("", "");	
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		else if (browser.equals("Safari")) {
			//System.setProperty("", "");	
			WebDriverManager.firefoxdriver().setup();
			driver =new SafariDriver();
		
		
		}
		else { System.out.println("Please Pass the Correct browser:"+ browser);}
		


	}

}

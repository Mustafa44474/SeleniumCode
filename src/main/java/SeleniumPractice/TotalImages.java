package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
		static WebDriver driver;

		public static void main(String[] args) {

			// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");
	
			// total Numbe of immage on the page
			// you  have to print the url of each 
			List <WebElement> totalimg =driver.findElements(By.tagName("img"));
			System.out.println(totalimg.size());
//			for( int i=0;i<totalimg.size();i++) {
//				String url =totalimg.get(i).getAttribute("src");
//			System.out.println(i+ "-->"+ url);
//			}
//			
			for (WebElement ele : totalimg) {
				String srUrl= ele.getAttribute("src");
				System.out.println(srUrl);
				
				
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}

}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterLink {

		static WebDriver driver;

		public static void main(String[] args) {

			// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/register");
			List <WebElement>rgTotalLink=driver.findElements(By.className("form-control"));
			System.out.println(rgTotalLink.size());
			for(WebElement ele: rgTotalLink) {
				ele.sendKeys("This have to fill out ");
				
				
				
			}
			
			
			
			
		}
		
}

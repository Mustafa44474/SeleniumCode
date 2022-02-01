package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoshopLink {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		List<WebElement> demLink = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		for (WebElement ele : demLink) {
			String text = ele.getText();
			System.out.println(text);
			if (text.endsWith("Newsletter")) {
				ele.click();
				 break;
				
			}

		}
	}

		public void getLink(By locator, String valule) {
		List<WebElement> demLink = driver.findElements(locator);
		for (WebElement ele : demLink) {
			String text = ele.getText();
			System.out.println(text);
			if (text.endsWith(valule)) {
				ele.click();
				 break;
				
			}

		}

	}

}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(30000);
		driver.findElements(By.xpath(""));

		List<WebElement> suggestionList = driver.findElements(By.xpath("KKKKKK"));
		System.out.println(suggestionList.size());
		for (WebElement ele : suggestionList) {
			String text = ele.getText();
			System.out.println(text);
			if (text.equals("Naveen Automaion lanb Cucumber")) {
				ele.click();
				break;
			}
		}

	}

}

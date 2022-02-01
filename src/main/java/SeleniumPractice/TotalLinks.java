package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		// Total Number of links on the page
		// you have to print text of each link with index numnber blank
		// you have to you print the value of each link (have text)
		List<WebElement> totatlNumberList = driver.findElements(By.tagName("a"));
		System.out.println(totatlNumberList.size());
		for (int i = 0; i < totatlNumberList.size(); i++) {
			String text = totatlNumberList.get(i).getText();
			System.out.println(text);
			if (text.isEmpty()) {
				System.out.println(i + "-->: " + text);
			}
				String url = totatlNumberList.get(i).getAttribute("href");
				System.out.println(url);
			}

	
	}

}

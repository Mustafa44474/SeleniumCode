package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownwithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		List<WebElement> optionList = driver.findElements(By.xpath("//select[@name='Country']/option"));
		System.out.println(optionList.size());
		for (int i = 0; i < optionList.size(); i++) {
			String text = optionList.get(i).getText();
			System.out.println(text);
		}
	}
	public static void SelectDropdownwithoutUsingSelectClass(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);
		System.out.println(optionList.size());
		for (int i = 0; i < optionList.size(); i++) {
			String text = optionList.get(i).getText();
			System.out.println(text);
			if (text.equals(value)) {
				optionList.get(i).click();
				break;
			}
			 
		} 
	}

}

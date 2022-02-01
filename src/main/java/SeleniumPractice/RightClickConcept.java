package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;

	public static WebElement main(String[] args) {

		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("");
		WebElement righClickEle = driver.findElement(By.id("righClick"));
		Actions action = new Actions(driver);
		action.contextClick(righClickEle).click();
		List<WebElement> optionList = driver.findElements(By.xpath("//ul[@class='context']/li/span"));
		System.out.println(optionList.size());
		for (WebElement ele : optionList) {
			String text = ele.getText();
			System.out.println(text);
			if (text.equals("copy")) {
				ele.click();
				break;
			}
		}
		return righClickEle;

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doActionSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}

	public void doActionClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}

}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("   http://seleniumpractise.blogspot" + ".com/2016/08/how-to-handle-"
				+ "calender-in-selenium.html\r\n" + "");
		driver.findElement(By.cssSelector("llllllllllll")).click();
		driver.findElement(By.xpath("//a[text()='10'")).click();
		List<WebElement> cal = driver.findElements(By.xpath("//a[text()=day/a"));
		for (WebElement ele : cal) {
			String text = ele.getText();
			if (text.equals("15")) {
				ele.click();
				break;

			}

		}

	}

	public static void seletCalData(By locatro, String day) {
		List<WebElement> cal = driver.findElements(locatro);
		for (WebElement ele : cal) {
			String text = ele.getText();
			if (text.equals(day)) {
				ele.click();
				break;

			}
		}
	}

}

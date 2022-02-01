package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().fullscreen();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		String head = driver.findElement(By.tagName("h1")).getText();
		String header = driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/h1")).getText();
		System.out.println(header);
		String ready =driver.findElement(By.tagName("h2")).getText();
		System.out.println(ready);
		String customer =driver.findElement(By.linkText("Customers")).getText();
		System.out.println(customer);
	}

}

package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramHandle {
	static WebDriver driver; 

	public static void main(String[] args) {

WebDriverManager.firefoxdriver().setup();
driver= new FirefoxDriver();
driver.get("http://www.londonfreelance.org/courses/frames/index.html");

// http://www.londonfreelance.org/courses/frames/index.html
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("");
		driver.switchTo().frame(driver.findElement(By.id("")));
		driver.switchTo().parentFrame().getTitle();
		driver.switchTo().frame(0);
		String header =driver.findElement(By.xpath("/html/body/h2")).getText();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		

	}

}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {

		//JAVA 8 : Streams: will be applied on List
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println(linksList.size());
		
		long stTime = System.currentTimeMillis();
		
		//sequential stream:
		//linksList.stream().forEach(ele -> System.out.println(ele.getText()) );
		
		//parallel stream:
		linksList.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		
		long endTime = System.currentTimeMillis();

		System.out.println("time taken: " + (endTime-stTime));
		//5398
		//4774
		
		
	}

}

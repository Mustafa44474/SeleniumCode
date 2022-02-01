package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListWithStream {
	static WebDriver driver;


	public static void main(String[] args) {
		
		 
		driver =new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List <WebElement> listlink = driver.findElements(By.tagName("a"));
		System.out.println(listlink.size());
		Long start =System.currentTimeMillis();
		
//		listlink.stream().forEach(y->System.out.println(y.getText()));
	 
		listlink.parallelStream().forEach(ele->System.out.println(ele.getText()));
		Long end = System.currentTimeMillis();
		System.out.println("Time taking is:"+ (end-start));
 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

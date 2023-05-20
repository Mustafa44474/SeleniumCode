package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//total number of links on the page
		//you have to print the text of each link with their index number(ignore the blank text)
		//you have to print the href value(url) of each link(having text)
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("total links: " + linksList.size());
		
		for(int i=0; i<linksList.size(); i++) {
			String text = linksList.get(i).getText();
			
			if(!text.isEmpty()) {
				System.out.println(i + "-->" + text);
				String url = linksList.get(i).getAttribute("href");
				System.out.println(url);
			}
			
			//System.out.println(url);
		}
		
		
	}

}

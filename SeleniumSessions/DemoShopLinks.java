package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoShopLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		
//		By ShopLinks = By.xpath("//div[@class='list-group']/a");
//
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickElement(ShopLinks, "Forgotten Password");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		
		Thread.sleep(3000);
		
		List<WebElement> suggList = driver.findElements(By.cssSelector("div.ac_results li"));
		
		//suggList.stream().filter(ele -> ele.getText().equals("Blouses > Blouse")).forEach(ele -> ele.click());
		
		suggList.stream().filter(ele -> ele.getText().equals("Blouses > Blouse")).findFirst().get().click();

		
	}

}

package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipKartTest extends BaseTest{
	WebDriver driver;
	
	 @Test (priority =1)
	 public void flipKarTitleTest() {
		 driver.get("https://www.flipkart.com/");
		 String tile =driver.getTitle();
		 System.out.println("The Page title is:  "+tile);
		Assert.assertTrue(tile.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers"));
		 
	 }
	 @Test (priority =2)
	public void flipKartLogoTest() {  
		 Assert.assertTrue( driver.findElement(By.className("_3qX0zy")).isDisplayed()); 
		
	}
	 

	 @AfterTest
	 public void tearDwon() {
		  driver.quit();
	 }
	
	

}

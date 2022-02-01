package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoonTest extends BaseTest{
	WebDriver driver;
	
	
	 
	 @Test (priority=1)
	 public void noonTitleTest( ) {
		 driver.get("https://www.noon.com/uae-en/");
		 String tile =driver.getTitle();
		 System.out.println("The Page title is:  "+tile);
		Assert.assertTrue(tile.contains("Online Shopping UAE"));
		 
	 }
	 @Test (priority=2)
	public void noonLogoTest() {  
		 Assert.assertTrue( driver.findElement(By.xpath("//img[@alt='noon']")).isDisplayed()); 
		
	}
	 @Test
		public void noonSinginTest() {  
			 Assert.assertTrue( driver.findElement(By.id("dd_header_signInOrUp")).isDisplayed()); 
			
		}
	 

	 @AfterTest
	 public void tearDwon() {
		  driver.quit();
	 }
	
	


}

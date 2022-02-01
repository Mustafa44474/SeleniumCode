package SeleniumPractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest{
	WebDriver driver;
	
	 @BeforeTest
	 public void setup() {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().fullscreen();
		 driver.manage().deleteAllCookies();
		 
	 }
	 @Test
	 public void googleTitleTest() {
		 String tile =driver.getTitle();
		 System.out.println("The Page title is:  "+tile);
		 Assert.assertEquals(tile, "Google");
		 
	 }
	 @Test
	public void googleLogoTest() {  
		 Assert.assertTrue( driver.findElement(By.xpath(" document.querySelector"
		 		+ "(\"body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img\")")).isDisplayed()); 
		
	}
	 
	 @Test
	 public void googleSearchBTNtest() {
		 Assert.assertTrue(driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).isDisplayed()); 
	 }
	 @AfterTest
	 public void tearDwon() {
		  driver.quit();
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

}

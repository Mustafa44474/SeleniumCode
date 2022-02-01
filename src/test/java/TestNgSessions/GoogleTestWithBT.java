package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestWithBT extends BaseTest{
	
	WebDriver driver;
	
	
	 @Test(priority =1)
	 public void googleTitleTest() {
		 driver.get("https://www.google.com/");
		 String tile =driver.getTitle();
		 System.out.println("The Page title is:  "+tile);
		 Assert.assertEquals(tile, "Google");
		 
	 }
	 @Test 	 (priority =2)
	public void googleLogoTest() {  
		 Assert.assertTrue( driver.findElement(By.xpath(" document.querySelector"
		 		+ "(\"body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img\")")).isDisplayed()); 
		
	}
	 
	 @Test	  (priority =2)
	 public void googleSearchBTNtest() {
		 Assert.assertTrue(driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).isDisplayed()); 
	 }
	 @AfterTest
	 public void tearDwon() {
		  driver.quit();
	 }

}

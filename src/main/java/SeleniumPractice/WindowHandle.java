package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	static WebDriver driver;

	public static void main(String[] args) {




			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.cssSelector("#social-icons > a:nth-child(1) > img")).clear();
			
			Set<String> handles =driver.getWindowHandles();
			Iterator <String> it =handles.iterator();
			String parentWindId =it.next();
			System.out.println("Parent WindoId is:  " +parentWindId);
			String childWindId= it.next();
			System.out.println("Child WindoId is:  " +childWindId);
			driver.switchTo().window(parentWindId);
			System.out.println("Child window Title is :  "+ driver.getTitle());
			driver.close();
			driver.switchTo().window(parentWindId);
			System.out.println("Parent window Title is :  "+ driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
	}

}

package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new FirefoxDriver();
		driver.findElement(By.xpath("//input[@type='file']")).
		sendKeys("C:\\Users\\19163\\Downloads\\Updated "
				+ "Child’s Immunizations.jpg") ;
		driver.findElement(By.xpath("//input[@value='Press']")).click();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		 
		//https://mail.rediff.com/cgi-bin/login.cgi
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By singin= By.name("proceed");
		getWeblement(singin).click();
		Alert alert = driver.switchTo().alert();
		String text =alert.getText();
		System.out.println(text);
		alert.accept();
		// alert.dismiss();
		
		
		
		
		
		
		
		
		

	}
	public static WebElement getWeblement(By locatory) {
		return driver.findElement(locatory);
	}

}

package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//https://the-internet.herokuapp.com/basic_auth
				
	 

	}

}

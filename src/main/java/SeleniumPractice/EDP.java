package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EDP {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	//	driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	 
	}

}

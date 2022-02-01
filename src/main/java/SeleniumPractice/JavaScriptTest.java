package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.get("http://classic.crmpro.com");
		
		
		
		
		
		
		
		
		

	}
	public String getTitleByJS() {
		JavaScriptTest js=((JavaScriptTest)driver);
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	private Object executeScript(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	  

}

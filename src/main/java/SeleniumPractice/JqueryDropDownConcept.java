package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 
	//	https;//www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
	
		Thread.sleep(30000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(40000);
		List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle"));
		for(WebElement ele: choiceList) {
			String text =ele.getText();
			System.out.println(text);
			if(text.equals("choice 2")) {
				ele.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

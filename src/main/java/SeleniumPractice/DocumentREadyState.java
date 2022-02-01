package SeleniumPractice;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DocumentREadyState {
	static WebDriver driver;

	public static void main(String[] args) {
		driver =new FirefoxDriver();
		driver.get("http://classic.crmpro.com/");
		JavascriptExecutor jSE =((JavascriptExecutor)driver);
		String jsCommond="return document.readyState";
		if(jSE.executeScript(jsCommond).toString().equals("complete")){
			System.out.println("Page is fully loaded:   ");
			
		}
		
		
		
	}
public static void jSWiatForPageload(int timeOut) {
	JavascriptExecutor jSE =((JavascriptExecutor)driver);
	String jsCommond="return document.readyState";
	if(jSE.executeScript(jsCommond).toString().equals("complete")){
		System.out.println("Page is fully loaded:   ");
		return;
	}
	for(int i=0;i<timeOut;i++) {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguage {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		List<WebElement> languageTeX = driver.findElements(By.linkText("//[div[@id='sive']/a"));
		System.out.println(languageTeX.size());
		for (WebElement ele : languageTeX) {
			if (languageTeX.equals("")) {
				ele.getText();
				ele.click();
				break;

			}
		}
		List<WebElement> lanugaText = driver.findElements(By.xpath(""));
		for (int i = 0; i < languageTeX.size(); i++) {
			String tex = languageTeX.get(i).getText();
			System.out.println(tex);
			if (tex.equals("")) {
				languageTeX.get(i).click();
			}
		}
		//} 
//		public static void clickElement(By  locator, String value) {
//			List<WebElement> lanugaText = driver.findElements(By.xpath(locator));
//			WebDriver languageTeX;
//			for (String i = 0; i < ((List<WebElement>) languageTeX).size(); i++) {
//				String tex = languageTeX.get(i).getText();
//				System.out.println(tex);
//				if (tex.equals(value)) {
//					languageTeX.get(i).click();
//			
	//	}

	}

}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdwonHadle {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By selectCountry = By.id("Form_submitForm_Country");

		Select select = new Select(driver.findElement(selectCountry));
		// select.selectByIndex(5);
		select.selectByVisibleText("Cuba");
		select.selectByValue("");
		doSelectbyIndex(selectCountry, 10);
		
		List <WebElement> selectCountryList = select.getOptions();
		
		System.out.println(selectCountryList.size());
		for(WebElement ele: selectCountryList) {
		String tex=	ele.getText();
		System.out.println(tex);
		}
		for(int i=0;i<selectCountryList.size();i++) {
		String text=	selectCountryList.get(i).getText();
			System.out.println(i+ "    :" +text);
		}
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSelectbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public static void doSelectbyVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public static void doSelectbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);

	} 
	 
}

package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSenKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public  WebElement  getElement11(By locator) {
		return driver.findElement(locator);
	}
	public String doGetAttribute(By locator, String attributeNmae) {
		return getElement(locator).getAttribute(attributeNmae);


	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	public  boolean doIsDisplayMethod(By locator) {
		return getElement(locator).isDisplayed();
		
	}
	public boolean getLink(By locator, String valule) {
		List<WebElement> demLink = driver.findElements(locator);
		for (WebElement ele : demLink) {
			String text = ele.getText();
			System.out.println(text);
			if (text.endsWith(valule)) {
				ele.click();
				 break;
				
			}
 

		}
		return false;
	} 
	//*********************Dropdonw util**************************
	public  WebElement getElement1(By locator) {
		return driver.findElement(locator);

	}

	public  void doSelectbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public  void doSelectbyVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public  void doSelectbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);

	}
}

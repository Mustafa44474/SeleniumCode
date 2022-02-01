package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelecCheckBoxWithStream {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		//https://datatables.net/extensions/select/examples/initialisation/checkbox.html
		List <WebElement> checkBoxlist =driver.findElements(By.xpath("//td[@class=' select-checkbox']"));
		//System.out.println(checkBoxlist.size());
		checkBoxlist.stream().forEach(ele-> ele.click());
		

	}

}

package SeleniumPractice;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StreamWithListAndFilter {
	static WebDriver driver;

	public static void main(String[] args) {
		driver =new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		List <WebElement> linklist =  driver.findElements(By.tagName("a"));
		List <String >collectList=linklist.stream().filter(ele_->ele_.getText().equals(""))
		.map(ele->ele.getText()).collect(Collectors.toList());
		collectList.stream().forEach(ele-> System.out.println(ele));
		
	List <String> amazonList=	linklist.stream().filter(ele-> ele.getText().contains("Amazon"))
		.map(ele->ele.getText()).
		collect(Collectors.toList());
	amazonList.stream().forEach(ele-> System.out.println(ele));
}
}
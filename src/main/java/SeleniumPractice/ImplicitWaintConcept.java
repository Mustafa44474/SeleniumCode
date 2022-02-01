package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class ImplicitWaintConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// two type of wait 
		// Static wait Threed.sleep
		// Dynamic wait 
					//a; implict wait 
					// B: Explicit wait 
							// b.1 WebDriver wait
							// b.2 Fluent Wait 
		// A implicit Wait: dynamic wait global wait
		// When you create your element with FE and FEs implicit wait will be applied by default 
		// deaful wait 0
		// it will be applied for Web Element not for non web Element; title,url, alert
	
		 
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		By username = By.name("username");
		By pwd= By.name("password");
		By login= By.xpath("//inpute[@value='login']");
		WebElement u1 =driver.findElement(username);
		u1.sendKeys("BatchAutomation");
		WebElement p1 =driver.findElement(pwd);
		p1.sendKeys("Test@321");
		WebElement lg= driver.findElement(login);
		lg.click();
		
		
		 
		
		
		
		
		

	}

}

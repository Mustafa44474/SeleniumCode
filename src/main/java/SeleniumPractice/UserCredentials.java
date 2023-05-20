package SeleniumPractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UserCredentials {
	static WebDriver  driver;

	public static void main(String[] args) {
		
		
		
		HashMap<String, String> credMap= new HashMap<String, String>();
		credMap.put("user_Cred", "Tom@gmail.com:Top321");
		credMap.put("Sellar_Crede", "Selear@gmail.com: sellar@312");
		credMap.put("Vendone_cred", "Vendor@gmail.com: Vendoer@321");
		credMap.put("admin_cred", "admin@gmail.com:admin321");
		
		WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		
		

//		
//	String userName=	credMap.get("user_Cred").split(":")[0];
//	String paswrod=	credMap.get("user_Cred").split(":")[1];
//		
//		
//		doLogin(paswrod, paswrod);
		doLogin(credMap.get("Sellar_Crede").split(":")[0], credMap.get("Sellar_Crede").split(":")[1]);
		doLogin(credMap.get("user_Cred").split(":")[0], credMap.get("user_Cred").split(":")[1]);
		doLogin(credMap.get("Vendone_cred").split(":")[0], credMap.get("Vendone_cred").split(":")[1]);
		doLogin(credMap.get("admin_cred").split(":")[0], credMap.get("admin_cred").split(":")[1]);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	public static void doLogin(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}

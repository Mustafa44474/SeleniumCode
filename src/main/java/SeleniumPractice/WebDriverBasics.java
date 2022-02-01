package SeleniumPractice;

import java.awt.SystemTray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		// - Open the brwoser: Chrom
		// 2- Enter the Url
		// 3-get the title of page
		// 4- Check the title verify
		// 5- Close the browser
		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// WebDriver driver1 = new ChromeDriver();
		// WebDriverManager.chromiumdriver().setup();

		// WebDriver driverp= new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver", "C;\\chromedriver.exe");

		// System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		// WebDriverManager.firefoxdriver().setup();
//WebDriverManager.InternetExplorer().setup();
		// Verification Point :Checkpoint (Actual Vs expected result
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page Title:  " + title);
		if (title.equals("Go66ogle")) {
			System.out.println("The Page title is Corrcet:  " + title);
		} else {
			System.out.println("The Page title is incorrect: " + title);

		}

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageResour = driver.getPageSource();
		System.out.println(pageResour);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.getClass();
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		
	}

}

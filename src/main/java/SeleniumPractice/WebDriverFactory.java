package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
	WebDriver driver;

	public WebDriver init_driver(String browerName) {
		if (browerName.equals("Chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\dwonloads\/chromedriver.exe")
			driver = new ChromeDriver();
	} else if (browerName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
	} else if (browerName.equals("Safari")) {
			driver = new SafariDriver();
	} else {
		System.out.println("Please Pass the Correct BrowserName:   " + browerName);
	}

		return driver;

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getTtilePage() {
		return driver.getTitle();

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}
}

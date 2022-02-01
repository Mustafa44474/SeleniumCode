package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegisterAccount {
	static WebDriver driver;

	public static void main(String[] args) {
		 
		WebDriverFactory wf = new WebDriverFactory();
		//WebDriver driver = 	wf.init_driver("Chrome");
		WebDriver driver = wf.init_driver("Firefox");
		wf.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println("Page Title is: "+ wf.getTtilePage());
		System.out.println(driver.getCurrentUrl());
		
		ElementUtil ele= new ElementUtil(driver)
;
		By register =By.linkText("Register"); 
		By firtname= By.id("input-firstname");
		By lastName =By.id("input-lastname");
		By emil = By.id("input-email");
		By phon = By.id("input-telephone");
		By pwd= By.id("input-password");
		By pwdConfir= By.id("input-confirm");
		By radioBTN = By.name("newsletter");
		By privacyPolicy=By.name("agree");
		By contin= By.xpath("//input[@type='submit']");
	 
		
		ele.doClick(register);
		ele.doSenKeys(firtname, "Mustafa");
		ele.doSenKeys(lastName, "Siddiqi");
		ele.doSenKeys(emil, "gmustafa.siddiqi1@gmail.com");
		ele.doSenKeys(phon, "99999999999999");
		ele.doSenKeys(pwd, "Test@321");
		ele.doSenKeys(pwdConfir, "Test@321");
		ele.doClick(radioBTN);
		ele.doClick(privacyPolicy);
		ele.doClick(contin);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

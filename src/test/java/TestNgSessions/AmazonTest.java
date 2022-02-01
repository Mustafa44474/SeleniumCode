package TestNgSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	@BeforeSuite
	
public void beforeSuit() {
		System.out.println("Create DB Conneciton");
		
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Create a test User in DB");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Lauch the Browser");
	}
	
	@BeforeMethod
	public void ebforeMetho()
	{
		System.out.println("Login to the App");
	}
	
	@Test (priority =1)
	public void AmazonTitleTest() {
		System.out.println("Get the Amazon title and verify ");
	}
	@Test
	public void AmazonSearrchtestt() {
		System.out.println("AmazonSearrchtestt");
	}
	@Test (priority =0)
	public void amazonFilterTest() {
		System.out.println("Amazon Filter Test");
	}

@AfterMethod
public void afterMetho() {
	System.out.println("Log out");
}
@AfterTest
public void afterSuite() {
	System.out.println("Disconneect the DB");
}
}

package TestNgSessions;

import org.testng.annotations.Test;

public class InvocationCounTest {
	
	
	@Test (invocationCount = 5)
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	
	
	
	
	
	
	
	
	
	

}

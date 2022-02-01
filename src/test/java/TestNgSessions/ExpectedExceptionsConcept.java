package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {
	String name="Tom";
	
	
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void divTest() {
		System.out.println("div testis:  ");
		int i=9/0;
		
		ExpectedExceptionsConcept obj= new ExpectedExceptionsConcept();
		obj=null;
		System.out.println(obj.name);
		System.out.println("Finish div test ");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=1)
	public void a_test() {
		System.out.println("This is A test:   ");
		
	}
	@Test (priority =2)
	public void b_test() {
		System.out.println("This is B test:   ");
		
	}
	@Test(priority =3)
	public void c_test() {
		System.out.println("This is C test:   ");
		
	}
	@Test (priority =4)
	public void d_test() {
		System.out.println("This is D test:   ");
		
	}
	@Test(priority =5)
	public void e_test() {
		System.out.println("This is E test:   ");
		
	}
	@Test (priority =6)
	public void f_test() {
		System.out.println("This is F test:   ");
		
	}
	@Test (priority =7)
	public void g_test() {
		System.out.println("This is G test:   ");
		
	}
	
	
	
	
		
	
	

}

package maven20102021.amazon.com;

import org.testng.annotations.*;

public class Dependency_Method {
	
	@Test(dependsOnMethods  = {"grapes","mango"})
	public void fruits() {
		System.out.println("There are many types of fruits");
	}
	@Test
	public void apple() {
		System.out.println("This is apple");
	}
	@Test
	public void mango() {
		System.out.println("This is mango");
				
	}			
	@Test
	public void grapes() {
		System.out.println("This is grapes");			
	
		
}	
}

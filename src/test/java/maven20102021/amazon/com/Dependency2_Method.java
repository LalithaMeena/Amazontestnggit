package maven20102021.amazon.com;

import org.testng.annotations.*;

public class Dependency2_Method extends Dependency_Method{

	
	@Test(dependsOnMethods  = {"tomato"})
	public void vegetables() {
		System.out.println("There are many types of vegetables");
	}
	@Test
	public void carrot() {
		System.out.println("This is carrot");
	}
	@Test
	public void beans() {
		System.out.println("This is beans");
				
	}			
	@Test
	public void potato() {
		System.out.println("This is potato");			
}	
	@Test
	public void tomato() {
		System.out.println("This is tomato");			
		
}	
}

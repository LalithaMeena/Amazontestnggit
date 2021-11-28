package maven20102021.amazon.com;

import org.testng.annotations.*;
public class Day3_Innovocation {

	@Test(invocationCount = 5)
	private void url() {
		System.out.println("Url");
}
	@Test
	private void login() {
		System.out.println("Login");
}
	@Test(invocationCount = 4)
	private void bestSellers() {
		System.out.println("Bestsellers");
}
	@Test
	private void homepage() {
		System.out.println("Homepage");
}
	@Test(invocationCount = 6)
	private void logout() {
		System.out.println("Logout");
}
	@Test
	private void close() {
		System.out.println("Close");
}
}

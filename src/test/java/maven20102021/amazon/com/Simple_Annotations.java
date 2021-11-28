package maven20102021.amazon.com;

import org.testng.annotations.*;
public class Simple_Annotations {

	@BeforeSuite
	private void setup() {
		System.out.println("setup");
	}
	@BeforeTest
	private void browsersLaunch() {
		System.out.println("browsersLaunch");
	}
	@BeforeClass
	private void Url() {
		System.out.println("Amazon Url");
	}
	@BeforeMethod
	private void Login() {
		System.out.println("Login");
	}
	@Test
	private void SearchBrowser() {
		System.out.println("Search the required Browser");
	}
	@AfterMethod
	private void VerifyingHomepage() {
		System.out.println("Come back to Homepage");
	}
	@AfterClass
	private void Logout() {
		System.out.println("Logout");
	}
	@AfterTest
	private void Close() {
		System.out.println("close");
	}
	@AfterSuite
	private void DeletingCookies() {
		System.out.println("Clearing the cookies");
	}
	
	
	
}

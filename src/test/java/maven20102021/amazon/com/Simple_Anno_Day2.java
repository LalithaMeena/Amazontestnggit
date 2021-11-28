package maven20102021.amazon.com;

import org.testng.annotations.*;


public class Simple_Anno_Day2 {

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
	@Test
	private void SearchFashion() {
		System.out.println("Select the Fashion");
	}
	@Test
	private void LakmeProduct() {
		System.out.println("Select the Lakme Products");
	}
	@Test
	private void Kajal() {
		System.out.println("click Kajal");
	}
	@Test
	private void LiquidFoundation() {
		System.out.println("Select Liquid Foundation");
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


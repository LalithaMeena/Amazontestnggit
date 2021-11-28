package maven20102021.amazon.com;

import org.testng.annotations.*;

public class Day3_Timeout {

	
	@Test
	private void login() {
		System.out.println("login");
  }
	
	@Test
	private void browserLaunch() {
		System.out.println("browserlaunch");
  }
	
	@Test(timeOut = 3000)
	private void logout() {
      System.out.println("logout");
	
}
}


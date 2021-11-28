package maven20102021.amazon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Parallel_Demo_practice {

	@Test
	private void googleChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\eclipse-workspace\\Selenium_Screenshot\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.quit();
	}		
		@Test
		private void internetExplorer() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\eclipse-workspace\\Selenium_Screenshot\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.internetexplorer.com");
			driver.quit();
	}
		@Test
		private void bing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\eclipse-workspace\\Selenium_Screenshot\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.bing.com");
		driver.quit();
}
}

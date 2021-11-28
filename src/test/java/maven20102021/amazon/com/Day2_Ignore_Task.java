package maven20102021.amazon.com;

import org.testng.annotations.*;
public class Day2_Ignore_Task {

	@Test
	private void  Url() {
		System.out.println("Url");
 }
	@Test
	private void  BrowserLaunch() {
		System.out.println("Launch the browser");
 }
	@Test
	private void Login() {
		System.out.println("Login");
 }
	@Test
	private void Setup() {
		System.out.println("Setup");
 }
	@Test (enabled=false)
	private void Homepage() {
	    System.out.println("come back to homepage");
 }
	@Test
	private void Logout() {
		System.out.println("Logout");
 }   
	@Test
	private void clearCookies  () {
		System.out.println("clear the cookies");
 
	
	}			
    }

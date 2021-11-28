package maven20102021.amazon.com;
import org.testng.annotations.*;
public class Day4_Grouping_Of_Groups {
	
	@Test(groups = "Personal Details")
	private void name() {
		System.out.println("Lalitha");
	}
	@Test(groups = "Personal Details")
	private void contactNumber() {
		System.out.println("8529637459");
	}
	@Test(groups = "Personal Details")
	private void address() {
		System.out.println("Alwarpet");
    }
	@Test(groups = "Personal Details")
	private void location() {
		System.out.println("chennai");
	}
	@Test(groups = "Company Details")
	private void companyName() {
		System.out.println("Accenture");
	}
	@Test(groups = "Company Details")
	private void designation() {
		System.out.println("Senior tester");
	}
	@Test(groups = "Company Details")
	private void department() {
        System.out.println("assemble");
	} 
	@Test(groups = "Bank Details")
	private void accountNumber() {
		System.out.println("521463259875645");
	}
	@Test(groups = "Bank Details")
	private void ifscCode() {
		System.out.println("SBI25478BN");
	}
	@Test(groups = "Bank Details")
	private void branch() {
		System.out.println("Iyappathangal");
  
  }
  }

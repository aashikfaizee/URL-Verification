package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.Enquiries_TC004;

public class Enquiries_TC004 {


	WebDriver driver;

	
	@Test(priority=4)
	public void Enquiries_test() throws InterruptedException {
		
		
		Logger log= Logger.getLogger(getClass());
		Enquiries_TC004 en= new  Enquiries_TC004(driver);
		en.Enquiry();
		en.datepicker();

	}
}

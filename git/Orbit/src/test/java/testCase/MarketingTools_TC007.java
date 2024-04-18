package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.Marketing_Tools;

public class MarketingTools_TC007 {

	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());

	@Test(priority=7)
	public void maketing_tools() throws InterruptedException {

		Marketing_Tools mt=new Marketing_Tools (driver);

		mt.newsletter();
		mt.feedback();
		mt.customer();



	}

}

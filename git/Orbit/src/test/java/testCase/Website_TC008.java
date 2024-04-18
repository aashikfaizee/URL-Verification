package testCase;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.Website_TC007;

public class Website_TC008 {

	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());

	@Test(priority=8)
	public void website() throws InterruptedException, AWTException, IOException {

		Website_TC007 wb= new Website_TC007(driver);

		wb.websiteclick();
		wb.Header_Navigation();
		wb.Announcement_bar();
		wb.chat_config();
		wb.newsletter();
		wb.search_key();
		wb.pages();
		log.info("Pages are viewed and verfified successfully");


	}
}

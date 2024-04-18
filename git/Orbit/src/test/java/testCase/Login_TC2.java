package testCase;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Quotes;
import org.testng.annotations.Test;

import page_Objects.BaseClass;
import page_Objects.DashBoard_TC002;
import page_Objects.Enquiries_TC004;
import page_Objects.HomePage_TC_001;
import page_Objects.Marketing_Tools;
import page_Objects.My_Account;
import page_Objects.Orders_TC006;
import page_Objects.Quotes_TC005;
import page_Objects.Settings_TC009;
import page_Objects.Store_Apps_TC008;
import page_Objects.Website_TC007;

public class Login_TC2 extends BaseClass{

	@Test
	public void LoginTest() throws InterruptedException, AWTException, IOException {
		HomePage_TC_001 hp= new HomePage_TC_001(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.ClickLogin();
		log.info("Login link is clicked");
		hp.emailid(emailid);
		log.info("Email-id is entered");
		Thread.sleep(2000);
		hp.password(password);
		log.info("Password is entered");
		Thread.sleep(2000);
		hp.submit();
		Thread.sleep(2000);
		hp.ClosePopup();
		log.info("Pop up closed");

	}



}




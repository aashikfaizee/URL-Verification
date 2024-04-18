package testCase;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.DashBoard_TC002;

public class Dashboard_TC002  {

	WebDriver driver;

	@Test(priority=1)
	public void dashboard_test() throws InterruptedException, AWTException, IOException {

		// TODO Auto-generated method stub
		DashBoard_TC002 db=new DashBoard_TC002(driver);
		db.dashboard();

	}


}

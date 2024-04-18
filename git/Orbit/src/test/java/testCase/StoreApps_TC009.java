package testCase;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import page_Objects.Store_Apps_TC008;

public class StoreApps_TC009 {

	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());


	//@Test(priority=9)
	public void store() throws InterruptedException, AWTException {

		Store_Apps_TC008 str= new Store_Apps_TC008(driver);

		str.blog();


	}

}

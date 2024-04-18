package testCase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.Settings_TC009;

public class Settings_TC010 {
	
	
	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());


	@Test(priority=10)
	public void Setting () throws InterruptedException, IOException {

		Settings_TC009 set= new Settings_TC009(driver);

		set.store_setting();


	}

}

package testCase;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.BaseClass;
import page_Objects.HomePage_TC_001;

public class Products_TC003  {


	WebDriver driver;

	//Logger log= Logger.getLogger(this.getClass());

	@Test(priority=3)
	public void produt_test() throws InterruptedException, AWTException, IOException {
		
		HomePage_TC_001 hp= new HomePage_TC_001(driver);

		hp.ClickProduct();
		//log.info("Product is clicked");

		hp.Checkbox();
		//log.info("Select all check box is enabled");

		hp.AddProduct();
		//log.info("Add product is selected:");
		
	}


}

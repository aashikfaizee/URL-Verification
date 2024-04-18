package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.Quotes_TC005;

public class Quotes_TC005 {

	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());


	@Test(priority=5)
	public void quote_test() throws InterruptedException {

		Quotes_TC005 qot= new Quotes_TC005(driver);

		qot.clickquote();
		qot.liveRequests();
		log.info("liveRequests is viewed");
		qot.Abondones_Quote();
		log.info("Abondoned is viewed");
		qot.Confirmed_Requests();
		log.info("Confirmed Requests is viewed");
		qot.Cancelled_Requests();
		log.info("Cancelled Requests is viewed");



	}

}

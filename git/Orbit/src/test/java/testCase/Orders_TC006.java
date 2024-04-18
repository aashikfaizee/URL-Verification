package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_Objects.Orders_TC006;

public class Orders_TC006 {

	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());


	@Test(priority=6)
	public void orders() throws InterruptedException {

		Orders_TC006 od =new Orders_TC006(driver);
		od.orders();
		od.completed_orders();
		od.cancel_orders();



	}

}

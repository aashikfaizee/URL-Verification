package testCase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import page_Objects.My_Account;

public class MyAccount_TC011 {
	
	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());
	//@Test(priority=11)
	public void My_acc() throws InterruptedException, IOException {

		My_Account acc= new My_Account(driver);

		acc.addrole();
		acc.users();
		acc.adduser();
	}



}

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
import page_Objects.Dashboard2;
import page_Objects.Enquiries;
import page_Objects.Home_page;
import page_Objects.Marketing_Tools;
import page_Objects.My_Account;
import page_Objects.Orders;
import page_Objects.Quotes2;
import page_Objects.Settings;
import page_Objects.Store_Apps;
import page_Objects.Website;

public class Login_TC001 extends BaseClass{

	@Test(priority=1)
	public void LoginTest() throws InterruptedException, AWTException, IOException {
		Home_page hp= new Home_page(driver);

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

	//@Test(priority=3)
	public void produt_test() throws InterruptedException, AWTException, IOException {
		Home_page hp= new Home_page(driver);

		hp.ClickProduct();
		//log.info("Product is clicked");
		//hp.Checkbox();
		//log.info("Select all check box is enabled");
		hp.AddProduct();
		//log.info("Add product is selected:");
	}

	//@Test(priority=2)
	public void dashboard_test() throws InterruptedException, AWTException, IOException {

		// TODO Auto-generated method stub
		Dashboard2 db=new Dashboard2(driver);
		db.dashboard();

	}

	//@Test(priority=4)
	public void Enquiries_test() throws InterruptedException {

		Enquiries en= new  Enquiries(driver);
		en.Enquiry();
		en.datepicker();

	}

	//@Test(priority=5)
	public void quote_test() throws InterruptedException {

		Quotes2 qot= new Quotes2(driver);

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

	//@Test(priority=6)
	public void orders() throws InterruptedException {

		Orders od =new Orders(driver);
		od.orders();
		od.completed_orders();
		od.cancel_orders();



	}

	//@Test(priority=7)
	public void maketing_tools() throws InterruptedException {

		Marketing_Tools mt=new Marketing_Tools (driver);

		mt.newsletter();
		mt.feedback();
		//mt.customer();



	}

	@Test(priority=8)
	public void website() throws InterruptedException, AWTException, IOException {

		Website wb= new Website(driver);

		//wb.websiteclick();
		//	wb.Header_Navigation();
		wb.Announcement_bar();
		//		wb.chat_config();
		//		wb.newsletter();
		//		wb.search_key();
		//		wb.pages();


	}

	//@Test(priority=9)
	public void store() throws InterruptedException, AWTException {

		Store_Apps str= new Store_Apps(driver);

		str.blog();


	}

	//@Test(priority=10)
	public void Setting () throws InterruptedException {

		Settings set= new Settings(driver);

		set.store_setting();


	}

	//@Test(priority=11)
	public void My_acc() throws InterruptedException, IOException {

		My_Account acc= new My_Account(driver);

		acc.addrole();
		acc.users();
		acc.adduser();
	}







}



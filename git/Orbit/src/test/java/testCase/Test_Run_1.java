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
import page_Objects.Product_TC003;
import page_Objects.Quotes_TC005;
import page_Objects.Settings_TC009;
import page_Objects.Store_Apps_TC008;
import page_Objects.Website_TC007;

public class Test_Run_1 extends BaseClass{

	@Test(priority=1)
	public void LoginTest() throws InterruptedException, AWTException, IOException {
		HomePage_TC_001 hp= new HomePage_TC_001(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.ClickLogin();


		hp.emailid(emailid);

		Thread.sleep(2000);
		hp.password(password);

		Thread.sleep(2000);
		hp.submit();
		Thread.sleep(2000);

		hp.ClosePopup();






	}

	@Test(priority=3)
	public void produt_test() throws InterruptedException, AWTException, IOException {

		Product_TC003 hp= new Product_TC003(driver);

		hp.ClickProduct();
		//log.info("Product is clicked");
		hp.Checkbox();
		//log.info("Select all check box is enabled");
		hp.AddProduct();
		//log.info("Add product is selected:");
	}

	@Test(description="Case 1",priority=2)
	public void dashboard_test() throws InterruptedException, AWTException, IOException {

		// TODO Auto-generated method stub
		DashBoard_TC002 db=new DashBoard_TC002(driver);
		db.dashboard();

	}

	@Test(priority=4)
	public void Enquiries_test() throws InterruptedException {

		Enquiries_TC004 en= new  Enquiries_TC004(driver);
		en.Enquiry();
		en.datepicker();

	}

	@Test(priority=5)
	public void quote_test() throws InterruptedException {

		Quotes_TC005 qot= new Quotes_TC005(driver);

		qot.clickquote();
		qot.liveRequests();

		qot.Abondones_Quote();

		qot.Confirmed_Requests();

		qot.Cancelled_Requests();



	}

	@Test(priority=6)
	public void orders() throws InterruptedException {

		Orders_TC006 od =new Orders_TC006(driver);
		od.orders();
		od.completed_orders();
		od.cancel_orders();



	}

	@Test(priority=7)
	public void maketing_tools() throws InterruptedException {

		Marketing_Tools mt=new Marketing_Tools (driver);

		mt.newsletter();
		mt.feedback();
		//mt.customer();



	}

	@Test(priority=8)
	public void website() throws InterruptedException, AWTException, IOException {

		Website_TC007 wb= new Website_TC007(driver);

		wb.websiteclick();
		wb.Header_Navigation();
		//wb.Announcement_bar();
		//wb.chat_config();
		wb.newsletter();
		wb.search_key();
		wb.pages();
		log.info("Pages are viewed and verfified successfully");


	}

	@Test(priority=9)
	public void store() throws InterruptedException, AWTException, IOException {

		Store_Apps_TC008 str= new Store_Apps_TC008(driver);

		str.blog();


	}

	@Test(priority=10)
	public void Setting () throws InterruptedException, IOException {

		Settings_TC009 set= new Settings_TC009(driver);

		set.store_setting();


	}

	@Test(priority=11)
	public void My_acc() throws InterruptedException, IOException {

		My_Account acc= new My_Account(driver);

		acc.addrole();
		acc.users();
		acc.adduser();
	}







}



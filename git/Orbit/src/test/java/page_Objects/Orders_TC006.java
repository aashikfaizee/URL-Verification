package page_Objects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Orders_TC006 extends BaseClass {

	WebDriver driver;
	Logger log= Logger.getLogger(this.getClass());

	public Orders_TC006(WebDriver ldriver) {

		driver=ldriver;
		PageFactory.initElements(driver,this);


	}
	@FindBy(xpath="//input[@name='from_date']")
	WebElement datepick1;

	@FindBy(xpath="//input[@name='to_date']")
	WebElement datepick2;

	@FindBy(css ="button[class='current ng-star-inserted'] span")
	WebElement next_btn;

	@FindBy(css="button[class='current ng-star-inserted'] span")
	WebElement to_btn;

	@FindBy(xpath="//span[normalize-space()='Orders']")
	WebElement ClickOrder;

	@FindBy(xpath="//*[text()=' Live Orders ']")
	WebElement LiveOrders;

	@FindBy(xpath="//*[text()=' Completed Orders ']")
	WebElement Completed_Orders;

	@FindBy(xpath="//*[text()=' Cancelled Orders ']")
	WebElement Cancelled_Orders;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-orders/app-product-orders/div/div[2]/div/div[2]/button[3]/span")
	WebElement create_folder;

	@FindBy(xpath="//button[normalize-space()='SELECT A CUSTOMER']")
	WebElement select_customer;

	@FindBy(xpath="//a[normalize-space()='CLOSE']")
	WebElement Close_popup;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[3]/span")
	WebElement Applyorder;

	@FindBy(xpath="//span[normalize-space()='filter_alt']")
	WebElement Filter_orders;

	String month="April";
	String Year="2024";
	String date="20";

	String endmonth="May";
	String date2="15";

	public void orders() throws InterruptedException {

		ClickOrder.click();
		Thread.sleep(1000);

		LiveOrders.click();
		Thread.sleep(1000);

		create_folder.click();
		Thread.sleep(1000);

		select_customer.click();
		Thread.sleep(1000);

		Close_popup.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		String url="https://yourstore.io/login/orders/create-order";
		String curr_url=driver.getCurrentUrl();

		if(!url.equals(curr_url)) {

			log.info("New order is created");
		}

		else {

			log.info("New order is not created");
		}

		Filter_orders.click();
		Thread.sleep(1000);

		List<WebElement> Byorders= driver.findElements(By.tagName("input"));

		for( WebElement byorder:Byorders) {

			String id=byorder.getAttribute("id");

			if(!id.isEmpty()) {

				System.out.println("ID:" + id);

				byorder.click();
				Thread.sleep(1000);	

			}



		}

        log.info("Filter category is checked for all radio button");

		Applyorder.click();
		Thread.sleep(2000);
		
		



	}

	public void completed_orders() throws InterruptedException {

		Completed_Orders.click();
		Thread.sleep(1000);

		Filter_orders.click();
		Thread.sleep(1000);

		datepick1.click();
		Thread.sleep(1000);

		next_btn.click();
		Thread.sleep(1000);

		List<WebElement> frommonths=driver.findElements(By.xpath("//table[@class='months']/tbody/tr/td"));
		for (WebElement allmonth:frommonths) {

			if (allmonth.getText().equals(month)) {

				allmonth.click();
				Thread.sleep(1000);
				break;
			}
		}



		List<WebElement> list= driver.findElements(By.xpath("//table[@class='days weeks']/tbody/tr/td"));

		for(WebElement alldates:list) {


			System.out.println(alldates.getText());

			if(alldates.getText().equals(date)) {

				alldates.click();
				Thread.sleep(1000);
				break;
			}

		}

		datepick2.click();
		Thread.sleep(1000);

		to_btn.click();
		Thread.sleep(1000);


		List<WebElement> tomonths=driver.findElements(By.xpath("//table[@class='months']/tbody/tr/td"));

		for (WebElement tomonth:tomonths) {

			if (tomonth.getText().equals(endmonth)) {
				tomonth.click();
				Thread.sleep(1000);
				break;

			}
		}


		List<WebElement> list2= driver.findElements(By.xpath("//table[@class='days weeks']/tbody/tr/td"));

		for(WebElement alldates1:list2) {


			System.out.println(alldates1.getText());

			if(alldates1.getText().equals(date2)) {

				alldates1.click();
				Thread.sleep(1000);
				break;
			}



		}

		Applyorder.click();
		Thread.sleep(1000);
		
		log.info("Completed orders are viewed ");
		
	
		
	    
	}

	public void cancel_orders() throws InterruptedException {

		Cancelled_Orders.click();
		Thread.sleep(1000);

		Filter_orders.click();
		Thread.sleep(1000);

		datepick1.click();
		Thread.sleep(1000);

		next_btn.click();
		Thread.sleep(1000);

		List<WebElement> frommonths=driver.findElements(By.xpath("//table[@class='months']/tbody/tr/td"));
		for (WebElement allmonth:frommonths) {

			if (allmonth.getText().equals(month)) {

				allmonth.click();
				Thread.sleep(1000);
				break;
			}
		}



		List<WebElement> list= driver.findElements(By.xpath("//table[@class='days weeks']/tbody/tr/td"));

		for(WebElement alldates:list) {


			System.out.println(alldates.getText());

			if(alldates.getText().equals(date)) {

				alldates.click();
				Thread.sleep(1000);
				break;
			}

		}

		datepick2.click();
		Thread.sleep(1000);

		to_btn.click();
		Thread.sleep(1000);


		List<WebElement> tomonths=driver.findElements(By.xpath("//table[@class='months']/tbody/tr/td"));

		for (WebElement tomonth:tomonths) {

			if (tomonth.getText().equals(endmonth)) {
				tomonth.click();
				Thread.sleep(1000);
				break;

			}
		}


		List<WebElement> list2= driver.findElements(By.xpath("//table[@class='days weeks']/tbody/tr/td"));

		for(WebElement alldates1:list2) {


			System.out.println(alldates1.getText());

			if(alldates1.getText().equals(date2)) {

				alldates1.click();
				Thread.sleep(1000);
				break;
			}



		}

		Applyorder.click();
		Thread.sleep(1000);
		

		log.info("Cancelled orders are viewed ");
		
	}

}

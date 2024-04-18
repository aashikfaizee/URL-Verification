package page_Objects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Marketing_Tools extends BaseClass {

	WebDriver driver;
	Logger log= Logger.getLogger(this.getClass());


	public Marketing_Tools (WebDriver ldriver ) {

		driver=ldriver;

		PageFactory.initElements(driver, this);


	}
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div[2]/div/div[1]/div/input")
	WebElement datepick1;

	@FindBy(xpath="//input[@name='to_date']")
	WebElement datepick2;

	@FindBy(css ="button[class='current ng-star-inserted'] span")
	WebElement next_btn;

	@FindBy(css="button[class='current ng-star-inserted'] span")
	WebElement to_btn;

	@FindBy(xpath="//*[@id=\"'heading'+i\"]/a/i")
	WebElement click_MarketTool;

	@FindBy(xpath="//*[text()=' Newsletter ']")
	WebElement NewsLetter;

	@FindBy(xpath="//*[text()=' Feedback ']")
	WebElement Feedback;

	@FindBy(xpath="//*[text()=' Customers ']")
	WebElement Customers;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[3]/span")
	WebElement Applyorder;

	@FindBy(xpath="//span[normalize-space()='filter_alt']")
	WebElement Filter_orders;

	@FindBy(xpath="//span[normalize-space()='Marketing Tools']")
	WebElement marktools;

	@FindBy(xpath="//*[@id=\"collapse5\"]/div/ul[1]/li/div/div/a")
	WebElement newsletter;

	@FindBy(xpath="//a[normalize-space()='Feedback']")
	WebElement feedback;

	@FindBy(xpath="//a[normalize-space()='Customers']")
	WebElement customer;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-customers/app-signup-users/div/div[1]/div/div[2]/button[3]/span")
	WebElement addcustomer;

	@FindBy(xpath="//a[normalize-space()='Signed Up User']")
	WebElement signed_up_user;

	@FindBy(xpath="//a[normalize-space()='Guest User']")
	WebElement Guest_User;

	@FindBy(xpath="//input[@name='name']")
	WebElement name;

	@FindBy(xpath="//input[@name='email']")
	WebElement email;

	@FindBy(xpath="//input[@name='mobile']")
	WebElement mob;

	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement nxtbtn;
	
	@FindBy(xpath="//input[@value='office']")
	WebElement office;


	String month="April";
	String Year="2024";
	String date="20";

	String endmonth="May";
	String date2="15";

	public void newsletter() throws InterruptedException {

		marktools.click();
		Thread.sleep(1000);

		newsletter.click();
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

	}


	public void feedback() throws InterruptedException {

		feedback.click();
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



	}

	public void customer() throws InterruptedException {

		customer.click();
		Thread.sleep(1000);

		addcustomer.click();
		Thread.sleep(1000);

		name.sendKeys("Pradeep ");
		Thread.sleep(1000);

		email.sendKeys("rpradeepsrinivasan1993@gmail.com");
		Thread.sleep(1000);

		mob.sendKeys("9087888945");
		Thread.sleep(1000);

		nxtbtn.click();
		Thread.sleep(1000);


		office.click();
		Thread.sleep(1000);
		
		
		List<WebElement> address= driver.findElements(By.tagName("input"));
				
		for (WebElement add:address) {
			
			String val= add.getAttribute("value");
			System.out.println(add.getText());
			
			if(val.equals("office"))
			{
				add.click();
				break;
			}
		}
		
		
		signed_up_user.click();
		Thread.sleep(1000);

		Guest_User.click();
		Thread.sleep(1000);







	}



}

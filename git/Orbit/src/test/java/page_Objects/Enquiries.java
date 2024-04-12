package page_Objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enquiries extends BaseClass{


	WebDriver driver;
	public  Enquiries(WebDriver ldriver) {

		driver=ldriver;

		PageFactory.initElements( ldriver, this);

	}

	@FindBy(xpath="//span[normalize-space()='Enquiries']")
	WebElement enquiries;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-customer-enquiries/div/div[2]/div/div[2]/button[1]")
	WebElement filter;

	@FindBy(xpath="//select[@name='list_type']")
	WebElement sc1;

	@FindBy(xpath="//input[@name='from_date']")
	WebElement datepick1;

	@FindBy(xpath="/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[1]/span")
	WebElement prev_btn;

	@FindBy(xpath="//input[@name='to_date']")
	WebElement datepick2;

	@FindBy(xpath="//span[normalize-space()='February']")
	WebElement Month;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[3]/span")
	WebElement ApplyEnquiries;

	@FindBy(css ="button[class='current ng-star-inserted'] span")
	WebElement next_btn;

	@FindBy(css="button[class='current ng-star-inserted'] span")
	WebElement to_btn;


	public void  Enquiry() throws InterruptedException {

		enquiries.click();
		Thread.sleep(1000);

		filter.click();
		Thread.sleep(0);

		Select sc= new Select(sc1);
		sc.selectByValue("all");
		Thread.sleep(1000);



	}

	public void datepicker () throws InterruptedException {

		datepick1.click();
		Thread.sleep(1000);

		String month="April";
		String Year="2024";
		String date="20";

		String endmonth="May";
		String date2="15";


		//WebElement next_btn= driver.findElement(By.cssSelector("button[class='current ng-star-inserted'] span"));

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


			//System.out.println(alldates.getText());

			if(alldates.getText().equals(date)) {

				alldates.click();
				Thread.sleep(1000);
				break;
			}

		}



		int dates=list.size();

		System.out.println(dates);

		datepick2.click();
		Thread.sleep(1000);


		//WebElement to_btn= driver.findElement(By.cssSelector("button[class='current ng-star-inserted'] span"));

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


			//System.out.println(alldates1.getText());

			if(alldates1.getText().equals(date2)) {

				alldates1.click();
				Thread.sleep(1000);
				break;
			}



		}

		ApplyEnquiries.click();
		Thread.sleep(1000);

		driver.navigate().back();
		
		String curr_url="https://yourstore.io/login/enquiries";
		String exp_url= driver.getCurrentUrl();

		if(!curr_url.equals(exp_url)) {


			log.info("Enquiries filter is successfully applied");



		}
		else {

			log.info("Enquiries filter is not applied");

		}




	}



}



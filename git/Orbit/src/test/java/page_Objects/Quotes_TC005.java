package page_Objects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Quotes_TC005 {

	WebDriver driver;
	Logger log= Logger.getLogger(this.getClass());
	
	public  Quotes_TC005 (WebDriver ldriver) {

		driver=ldriver;

		PageFactory.initElements( ldriver, this);

	}

	@FindBy(xpath="//*[@id=\"'heading'+i\"]/a/i")
	WebElement Quotes;

	@FindBy(xpath=" //*[text()=' Live Requests ']")
	WebElement Live_Requests;

	@FindBy(xpath="//select[@name='type']")
	WebElement allrequests;

	@FindBy(xpath="//*[text()=' Abandoned Quote ']")
	WebElement  Abandoned_Quote;

	@FindBy(xpath="//*[@id=\"collapse3\"]/div/ul[3]/li/div/div/a")
	WebElement  Confirmed_Requests ;

	@FindBy(xpath="//*[@id=\"collapse3\"]/div/ul[4]/li/div/div/a")
	WebElement  Cancelled_Requests ;

	@FindBy(xpath="//input[@name='from_date']")
	WebElement datepick1;

	@FindBy(xpath="//input[@name='to_date']")
	WebElement datepick2;

	@FindBy(css ="button[class='current ng-star-inserted'] span")
	WebElement next_btn;

	@FindBy(css="button[class='current ng-star-inserted'] span")
	WebElement to_btn;

	@FindBy(xpath="//a[normalize-space()='Sign Up User']")
	WebElement sign_Up_user;

	@FindBy(xpath="//a[normalize-space()='Guest User']")
	WebElement Guest_User;

	String month="April";
	String Year="2024";
	String date="20";

	String endmonth="May";
	String date2="15";


	public void clickquote() throws InterruptedException {


		Quotes.click();
		Thread.sleep(1000);
		

		Live_Requests.click();
		Thread.sleep(1000);
	}

	public void liveRequests() throws InterruptedException {

		Select sc= new Select(allrequests);
		sc.selectByValue("placed");
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
		
		


		//				Abandoned_Quote.click();
		//				Thread.sleep(1000);
		//				
		//				Confirmed_Requests.click();
		//				Thread.sleep(1000);
		//				
		//				Cancelled_Requests.click();
		//				Thread.sleep(1000);

		log.info("liveRequests is viewed");

	}

	public void Abondones_Quote() throws InterruptedException {

		Abandoned_Quote.click();
		Thread.sleep(1000);
		
	
		sign_Up_user.click();
		Thread.sleep(1000);

		Guest_User.click();
		Thread.sleep(1000);


		log.info("Abondoned is viewed");

	}

	public void Confirmed_Requests() throws InterruptedException {

		Confirmed_Requests.click();
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

		log.info("Confirmed Requests is viewed");


	}

	public void Cancelled_Requests() throws InterruptedException {

		Cancelled_Requests.click();
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

		log.info("Cancelled Requests is viewed");

	}


	


}

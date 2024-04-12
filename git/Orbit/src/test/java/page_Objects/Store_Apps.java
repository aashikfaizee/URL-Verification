package page_Objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Store_Apps extends BaseClass{

	WebDriver driver;

	public   Store_Apps (WebDriver ldriver) {

		driver=ldriver;

		PageFactory.initElements(driver, this);



	}

	@FindBy(xpath="//span[normalize-space()='Store Apps']")
	WebElement clickstore;

	@FindBy(xpath="//a[normalize-space()='Blogs']")
	WebElement blogs;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-blog/div/div[2]/div/div[2]/button[3]/span")
	WebElement addblog;

	@FindBy(xpath="//p[normalize-space()='Click to upload image']")
	WebElement upload_img;

	@FindBy(xpath="//input[@name='author']")
	WebElement authortxt;

	@FindBy(xpath="//input[@placeholder='Select Date']")
	WebElement selectdate;

	@FindBy(css ="button[class='current ng-star-inserted'] span")
	WebElement next_btn;

	@FindBy(xpath="//input[@name='name']")
	WebElement Nametxt;

	@FindBy(xpath="//div[@class='ql-editor ql-blank']//p")
	WebElement desc;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-blog-event/div/form/div[4]/div/button[2]/span[1]")
	WebElement Addbtn;

	String month="April";
	String Year="2024";
	String date="1";

	String endmonth="May";
	String date2="15";


	public void blog() throws InterruptedException, AWTException {

		clickstore.click();
		Thread.sleep(1000);

		blogs.click();
		Thread.sleep(1000);

		addblog.click();
		Thread.sleep(1000);

		upload_img.click();
		Thread.sleep(1000);

		String img="Ride.png";


		StringSelection selection = new StringSelection(img);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot =new Robot();

		robot.delay(2000);


		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);

		authortxt.sendKeys("Automation Testing");
		Thread.sleep(1000);

		selectdate.click();
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


		Nametxt.sendKeys("Selenium Java");
		Thread.sleep(1000);

		desc.sendKeys(" Welcome to our blog dedicated to all things testing! Whether you're a seasoned QA professional or just dipping your toes into the realm of quality assurance, this blog is your go-to destination for insightful discussions, practical tips, and cutting-edge techniques in software testing.");
		Thread.sleep(1000);

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("argumtents[0].click();", Addbtn);
		
		//WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(10));
		//wt.until(ExpectedConditions.elementToBeClickable(Addbtn));

		

		


	}

}

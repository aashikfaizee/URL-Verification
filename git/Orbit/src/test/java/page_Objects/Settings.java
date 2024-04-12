package page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Settings extends BaseClass{

	WebDriver driver;

	public Settings(WebDriver ldriver) {

		driver=ldriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//span[normalize-space()='Settings']")
	WebElement set;

	@FindBy(xpath="//a[normalize-space()='Store Settings']")
	WebElement clickstore;

	@FindBy(xpath="//span[@class='black-outline-txt']")
	WebElement cancel_btn;

	@FindBy(xpath="//button[@class='btn btn-wide btn-primary ladda-button']//span[@class='ladda-label'][normalize-space()='Submit']")
	WebElement submit;

	@FindBy(xpath="//span[@class='checkmark']")
	WebElement checkmark;

	@FindBy(xpath="//input[@name='contact_no']")
	WebElement contact_no;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div[2]/div[1]/tag-input/div/div/tag-input-form/form/input")
	WebElement cc;

	@FindBy(xpath="(//label[@class='switch'])")
	WebElement toggle;

	@FindBy(xpath="//input[@name='cancel_order_email']")
	WebElement Cancel_Email;

	@FindBy(xpath="//input[@name='gift_wrapping_charges']")
	WebElement wrap_charges;

	@FindBy(xpath="//select[@name='tag_position']")
	WebElement tag_position;

	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement update;

	@FindBy(xpath="//input[@name='inv_prefix']")
	WebElement prefix;

	@FindBy(xpath="//input[@name='inv_suffix']")
	WebElement suffix;

	@FindBy(xpath="//input[@name='inv_min_digit']")
	WebElement min_digit;

	public void  store_setting() throws InterruptedException {

		set.click();
		Thread.sleep(1000);

		clickstore.click();
		Thread.sleep(1000);

		List<WebElement> list= driver.findElements(By.tagName("label"));

		for(WebElement l:list) {

			if(l.getText().equals("Opening Hours")){

				l.click();
				Thread.sleep(2000);

				List<WebElement> days= driver.findElements(By.tagName("strong"));

				for (WebElement day: days) {

					if(!day.getText().equals("Null")){

						day.click();
						Thread.sleep(2000);

					}
				}

				submit.click();
				Thread.sleep(2000);

			}




			if(l.getText().equals("Mail Configuration")) {

				l.click();
				Thread.sleep(2000);

				//checkmark.click();
				//Thread.sleep(2000);

				contact_no.sendKeys("9087888925");
				Thread.sleep(2000);

				cc.sendKeys("johnclintonm97@gmail.com");
				Thread.sleep(2000);

				submit.click();
				Thread.sleep(2000);


			}

//			if(l.getText().equals("Logo Management")) {
//
//				l.click();
//				Thread.sleep(2000);
//
//			}

			if(l.getText().equals("Store Management")) {

				l.click();
				Thread.sleep(2000);	

				List<WebElement> toggles= driver.findElements(By.xpath("(//label[@class='switch'])"));

				for(WebElement toggle:toggles) {

					toggle.click();
					Thread.sleep(2000);

				}

				Cancel_Email.clear();
				Thread.sleep(2000);

				Cancel_Email.sendKeys("rpradeepsrinivasan1992@gmail.com");
				Thread.sleep(2000);

				wrap_charges.sendKeys("20");
				Thread.sleep(2000);

				Select tag= new Select(tag_position);
				tag.selectByValue("t_r");

				update.click();
				Thread.sleep(2000);




			}

			if(l.getText().equals("Checkout Setting")) {

				l.click();
				Thread.sleep(2000);


				for(int i=1;i<=6;i++) {

					driver.findElement(By.xpath("(//label[@class='switch'])["+i+"]")).click();
					Thread.sleep(2000);

				}

				update.click();
				Thread.sleep(2000);


			}


			if(l.getText().equals("Invoice Setting")) {

				l.click();
				Thread.sleep(2000);


				checkmark.click();
				Thread.sleep(2000);


				prefix.clear();
				prefix.sendKeys("22");
				Thread.sleep(2000);


				suffix.clear();
				suffix.sendKeys("24");
				Thread.sleep(2000);

				min_digit.clear();
				min_digit.sendKeys("1");
				Thread.sleep(2000);

				update.click();
				Thread.sleep(2000);
			}

			if(l.getText().equals("Social Logins")) {

				l.click();
				Thread.sleep(2000);
				cancel_btn.click();
				Thread.sleep(2000);
			}
			if(l.getText().equals("Domain Setup")) {

				l.click();
				Thread.sleep(2000);
				driver.navigate().back();

			}
			if(l.getText().equals("Auto SKU")) {

				l.click();
				Thread.sleep(2000);
				cancel_btn.click();
				Thread.sleep(2000);
			}


		}









	}

}

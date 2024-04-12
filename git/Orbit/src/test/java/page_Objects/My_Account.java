package page_Objects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class My_Account extends BaseClass {

	WebDriver driver;

	public My_Account(WebDriver ldriver) {
		// TODO Auto-generated constructor stub


		driver=ldriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement click_acc;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-branches/div/div[2]/div/div[2]/button/span")
	WebElement add_branch;

	@FindBy(xpath="//span[@class='checkmark ng-tns-c86-1']")
	WebElement checkbox;

	@FindBy(xpath="//input[@name='name']")
	WebElement name;

	@FindBy(xpath="//input[@name='contact_person']")
	WebElement contact_person;

	@FindBy(xpath="//input[@name='mobile']")
	WebElement mob;

	@FindBy(xpath="//select[@name='country']")
	WebElement country;

	@FindBy(xpath="//select[@name='state']")
	WebElement state;

	@FindBy(xpath="//input[@name='city']")
	WebElement city;

	@FindBy(xpath="//input[@name='pincode']")
	WebElement pincode;

	@FindBy(xpath="//textarea[@name='completeAddress']")
	WebElement address;

	@FindBy(xpath="//a[normalize-space()='Branches']")
	WebElement branch;

	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement Addbtn;

	@FindBy(xpath="//input[@name='location_url']")
	WebElement mapurl;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-sub-users/div/div[2]/div/div[2]/button[2]/span")
	WebElement adduser;

	@FindBy(xpath="//button[@type='button']")
	WebElement addbtn;

	@FindBy(xpath="//select[@name='designation']")
	WebElement designation;

	@FindBy(xpath="//input[@name='email']")
	WebElement email;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]/span[1]")
	WebElement submit;

	@FindBy(xpath="(//span[text()='Submit'])[2]")
	WebElement submit1;

	@FindBy(xpath="//a[normalize-space()='Users']")
	WebElement user;

	@FindBy(xpath="//button[normalize-space()='Manage Roles']")
	WebElement Manageroles;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-user-roles/div/div[2]/div/div[2]/button/span")
	WebElement addrole;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div[3]/div/div/label/span[2]")
	WebElement CheckAnalytics;

	@FindBy(xpath="//span[normalize-space()='Customer Enquiries']")
	WebElement cust_enq;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div[9]/div/div[1]/label/span[2]")
	WebElement quotes;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div[11]/div/div[2]/label/span[2]")
	WebElement feedback;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div[13]/div/div[4]/label/span[1]")
	WebElement chatconfig;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div[17]/div/div[2]/label/span[1]")
	WebElement paygate;

	public void  addrole() throws InterruptedException {

		click_acc.click();
		Thread.sleep(1000);

		branch.click();
		Thread.sleep(1000);

		add_branch.click();
		Thread.sleep(1000);

		//		checkbox.click();
		//		Thread.sleep(1000);

		name.sendKeys("Estore");
		Thread.sleep(1000);

		contact_person.sendKeys("Lahir");
		Thread.sleep(1000);

		mob.sendKeys("9087888925");
		Thread.sleep(1000); 

		Select count= new Select(country);

		count.selectByValue("India");
		Thread.sleep(1000); 

		Select State= new Select(state);

		State.selectByVisibleText("Tamil Nadu");

		city.sendKeys("Chennnai");
		Thread.sleep(1000); 

		pincode.sendKeys("9342299743");
		Thread.sleep(1000); 

		address.sendKeys("Guindy, velachery road");
		Thread.sleep(1000); 

		mapurl.sendKeys("https://www.google.com/maps/search/ms+mens+pg+velachery/@12.9554702,80.0905159,12z?entry=ttu");
		Thread.sleep(1000); 

		Addbtn.click();
		Thread.sleep(1000);



	}

	public void users() throws InterruptedException {

		//click_acc.click();
		//Thread.sleep(1000);

		user.click();
		Thread.sleep(1000);

		Manageroles.click();
		Thread.sleep(1000);

		addrole.click();
		Thread.sleep(1000);

		name.sendKeys("ArumugaRaja");
		Thread.sleep(1000);

		//CheckAnalytics.click();
		//Thread.sleep(1000);

		List<WebElement> checkbox = driver.findElements(By.tagName("span"));


		for(WebElement check:checkbox) 

		{


			//System.out.println(check.getText());

			if(check.getText().equals("Catalog Management")) {

				check.click();
				Thread.sleep(1000);

			}
			if(check.getText().equals("All Products")) {

				check.click();
				Thread.sleep(1000);

			}

			if(check.getText().equals("Product Tags")) {

				check.click();
				Thread.sleep(1000);

			}

			//			if(check.getText().equals("Foot Note")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			
			//			if(check.getText().equals("Size Chart")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("FAQ")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//
			//			if(check.getText().equals("Image Tags")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//
			//			if(check.getText().equals("Product Taxonomy")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Image Uploader")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Customer Enquiries")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Quotes")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Abandoned Quote")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Orders")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Feedback")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Customers")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Home Page")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Header Navigation")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Announcement Bar")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Chat Configuration")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Newsletter & Popup")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("All Products")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Search Keywords")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Policies")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Store SEO")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Pages")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Contact Page")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Store Locator")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Extra Pages")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Footer Configuration")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Blogs")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Tax Rates")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Payment Gateway")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Store Settings")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Branches")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Create Manual Order")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Product Export")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}
			//			if(check.getText().equals("Order Export")) {
			//
			//				check.click();
			//				Thread.sleep(1000);
			//
			//			}







		}

		cust_enq.click();
		Thread.sleep(1000);

		quotes.click();
		Thread.sleep(1000);

		feedback.click();
		Thread.sleep(1000);

		chatconfig.click();
		Thread.sleep(1000);

		paygate.click();
		Thread.sleep(1000);

		submit1.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

	}

	public void adduser() throws InterruptedException, IOException {

		adduser.click();
		Thread.sleep(1000);

		name.sendKeys("Test User");
		Thread.sleep(1000);

		Select s1= new Select(designation);

		s1.selectByVisibleText("-- Select --");
		Thread.sleep(1000);

		email.sendKeys("rps@gmail.com");
		Thread.sleep(1000);

		password.sendKeys("password");
		Thread.sleep(1000);

		submit1.click();
		Thread.sleep(1000);

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:/Users/white/git/Orbit/capturesscreenshot03.png"));
		log.info("Add role in the select drop down");

		//screenshot copied from buffer is saved at the mentioned path.

		System.out.println("The Screenshot is captured.");






	}





}

package page_Objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Website_TC007 extends BaseClass{

	WebDriver driver;
	
	Logger log= Logger.getLogger(this.getClass());

	public  Website_TC007(WebDriver ldriver) {

		driver=ldriver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//span[normalize-space()='Website']")
	WebElement website_Click;

	@FindBy(xpath="//a[normalize-space()='Home Page']")
	WebElement Homepage;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-home-layout/div/div[2]/div/div[2]/button[3]/span")
	WebElement Add_segment;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-store-locator/div/div[2]/div/div[2]/button[3]/span")
	WebElement add_loc;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[1]/select")
	WebElement segment_type;

	@FindBy(xpath="//input[@name='name']")
	WebElement Nametxt;

	@FindBy(xpath="//input[@name='rank']")
	WebElement Rank;

	@FindBy(xpath="//input[@name='heading']")
	WebElement Heading;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[4]/select")
	WebElement link_to_Catalog;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[4]/select")
	WebElement slide;

	@FindBy(xpath="//textarea[@name='sub_heading']")
	WebElement sub_head;

	@FindBy(xpath="//input[@name='sub_heading']")
	WebElement sub_head1;

	@FindBy(xpath="//span[normalize-space()='Add']")
	WebElement Addbtn;
	//button[normalize-space()='Add']

	@FindBy(xpath="(//*[text()='add'])[1]")
	WebElement addbutton;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-home-layout/div/div[3]/div[1]/div/div[8]/div[2]/div/div/button")
	WebElement editbtn;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-home-layout/div/div[3]/div[1]/div/div[8]/div[2]/div/div/div/button[2]")
	WebElement remove;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/button[2]")
	WebElement clickyesbtn;

	@FindBy(xpath="//a[normalize-space()='Header Navigation']")
	WebElement Header_nav;

	@FindBy(xpath="//button[@type='button']")
	WebElement addmenu_btn;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[2]/input")
	WebElement rank;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[3]/label/span[2]")
	WebElement enable_link;

	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement addbtn;

	@FindBy(xpath="//select[@name='category_id']")
	WebElement linkcatalog;

	@FindBy(xpath="//*[@id=\"collapse6\"]/div/ul[3]/li/div/div/a")
	WebElement announcement_bar;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-announcement-bar/div/div[2]/div/div/form/div/div[1]/label/div")
	WebElement enable;

	@FindBy(xpath="//input[@name='content']")
	WebElement content;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-announcement-bar/div/div[2]/div/div/form/div/div[4]/label/div")
	WebElement enable_time;


	@FindBy(xpath="//input[@name='end_date']")
	WebElement datepick1;

	@FindBy(xpath="//input[@name='end_time']")
	WebElement datepick2;

	@FindBy(css ="button[class='current ng-star-inserted'] span")
	WebElement next_btn;

	@FindBy(css="button[class='current ng-star-inserted'] span")
	WebElement to_btn;

	@FindBy(xpath="//button[normalize-space()='Ok']")
	WebElement okbtn;

	@FindBy(xpath="//span[@class='checkmark']")
	WebElement checkbox;

	@FindBy(xpath="//select[@name='category_id']")
	WebElement catlog;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div/app-announcement-bar/div/div/div/div/form/div/div[15]/button/span[1]")
	WebElement update;

	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement update1;

	@FindBy(xpath="//*[text()=' Update ']")
	WebElement updates;

	@FindBy(xpath="//a[normalize-space()='Chat Configuration']")
	WebElement chatconfig_click;

	@FindBy(xpath="//span[@class='checkmark']")
	WebElement displaycheck;

	@FindBy(xpath="//label[@class='switch']//div")
	WebElement enablechat;

	@FindBy(xpath="//select[@name='host_type']")
	WebElement select_chattype;

	@FindBy(xpath="//input[@name='whatsapp_mob']")
	WebElement Whatsapp_mob;//input[@name='mobile']

	@FindBy(xpath="//input[@name='mobile']")
	WebElement mob;

	@FindBy(name="whatsapp_msg")
	WebElement wassup_msg;

	@FindBy(xpath="//p[normalize-space()='Click to upload image']")
	WebElement upload_img;

	@FindBy(xpath="//a[normalize-space()='Newsletter & Popup']")
	WebElement clickNews;

	@FindBy(name="btn_text")
	WebElement btn_text;

	@FindBy(xpath="//input[@placeholder='Enter options']")
	WebElement Enter_opn;

	@FindBy(xpath="//a[normalize-space()='Search Keywords']")
	WebElement Clicksearch;

	@FindBy(xpath="//a[normalize-space()='Pages']")
	WebElement clickPages;

	@FindBy(xpath="//label[normalize-space()='Contact Page']")
	WebElement contact_page;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-contact-page/div/div[2]/div/div/div/div[2]/span")
	WebElement edit;

	@FindBy(xpath="//span[normalize-space()='pin_drop']")
	WebElement store_loc;

	@FindBy(xpath="//span[normalize-space()='settings']")
	WebElement Pagesetting;

	@FindBy(xpath="//button[@id='closeModal']")
	WebElement close_setting;

	@FindBy(xpath="//textarea[@name='address']")
	WebElement address;

	@FindBy(xpath="//input[@name='map_url']")
	WebElement map_url;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[7]/select")
	WebElement link_catalog;

	@FindBy(xpath="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[1]/div[1]/h4[1]/span[1]")
	WebElement back_arrow;

	@FindBy(xpath="//input[@name='link']")
	WebElement urltext;

	String month="April";
	String Year="2024";
	String date="20";

	String endmonth="May";
	String date2="15";

	public void websiteclick() throws InterruptedException, IOException {

		website_Click.click();
		Thread.sleep(1000);

		Homepage.click();
		Thread.sleep(1000);

		Add_segment.click();
		Thread.sleep(1000);


		Select sc= new Select(segment_type);
		sc.selectByVisibleText("Featured Products");

		Nametxt.sendKeys("Featured Products");
		Thread.sleep(1000);

		Rank.clear();
		Rank.sendKeys("7");
		Thread.sleep(1000);

		Select slider= new Select(slide);
		slider.selectByVisibleText("Slider");


		Heading.sendKeys("Testing");
		Thread.sleep(1000);


		sub_head.sendKeys("Top Picks, Best Sellers, New Arrivals, Staff Favorites, Customer Favorites, Seasonal Selections, Trending Now, Editor's Choices, Limited Editions, Must-Haves, Popular Picks, Exclusive Offers, Hot Deals, Top-Rated Products, Special Selections, Handpicked Selections, Featured Finds, Weekly Specials, Best Value, Customer Spotlight");
		Thread.sleep(1000);

		Select sc1= new Select(link_catalog);

		sc1.selectByVisibleText("Test");



		Addbtn.click(); 
		Thread.sleep(2000);


		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[2]")));

		boolean isModalClosed = driver.findElements(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[2]")).isEmpty();

		if (isModalClosed) {

			System.out.println("Modal is closed.");
			log.info("Add segment added in Website Home Page");

			editbtn.click();
			Thread.sleep(1000);

			remove.click();
			Thread.sleep(1000);

			clickyesbtn.click();
			Thread.sleep(1000);

		} else {

			System.out.println("Modal is still open.");

			TakesScreenshot ts= (TakesScreenshot)driver;

			File f= ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f,new File("C:/Users/white/git/Orbit/capturesscreenshot06.png"));

			log.info("Modal is still open.Check screenshot 6 verify Header Navigation");

			back_arrow.click();
			Thread.sleep(1000);

		}



	}

	public void Header_Navigation() throws InterruptedException, IOException {

		Header_nav.click();
		Thread.sleep(1000);

		addmenu_btn.click();
		Thread.sleep(1000);

		Nametxt.sendKeys("Offers");
		Thread.sleep(1000);

		rank.clear();
		rank.sendKeys("3");
		Thread.sleep(1000);

		enable_link.click();
		Thread.sleep(1000);

		Select lc= new Select(linkcatalog);	
		lc.selectByVisibleText("Test");

		addbtn.click();
		Thread.sleep(3000);

		boolean isModalClosed = driver.findElements(By.xpath("//button[normalize-space()='Add']")).isEmpty();

		if (isModalClosed) {

			System.out.println("Modal is closed in Header Navigation");
			log.info("Add Menu added in Header Navigation");



		} else {

			System.out.println("Modal is still open. Pls check Header Navigation");

			TakesScreenshot ts= (TakesScreenshot)driver;

			File f= ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f,new File("C:/Users/white/git/Orbit/capturesscreenshot07.png"));

			log.info("Modal is still open.Check screenshot 7 verify Header Navigation");

			back_arrow.click();
			Thread.sleep(1000);

		}
	}

	public void Announcement_bar() throws InterruptedException, IOException{

		announcement_bar.click();
		Thread.sleep(1000);

		enable.click();
		Thread.sleep(1000);


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(content));

		content.clear();
		Thread.sleep(1000);

		content.sendKeys("Mega offers for you");
		Thread.sleep(1000);


		enable_time.click();
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

		okbtn.click();
		Thread.sleep(1000);

		if(!displaycheck.isSelected()) {

			displaycheck.click();
			Thread.sleep(1000);
		}
		else {

			System.out.println("Already selected");
		}



		List<WebElement> links= driver.findElements( By.xpath("/html/body/app-root/app-store-layout/div[1]/div[3]/app-announcement-bar/div/div[2]/div/div/form/div/div[11]/label/span[1]"));


		for(WebElement link:links) {

			if(link.getText().equals("Link to Catalog")) {


				link.click();

				break;


			}


		}

		Select cat= new Select(catlog);

		cat.selectByVisibleText("Hello");
		Thread.sleep(1000);

		updates.click();
		Thread.sleep(2000);

		boolean isModalClosed = driver.findElement(By.xpath("//*[text()='Update']")).isSelected();

		if (isModalClosed) {

			System.out.println("Announcement bar updated successfully");

			log.info("Announcement bar updated successfully");



		} else {

			System.out.println("Not upated. Pls check Announcement bar");

			TakesScreenshot ts= (TakesScreenshot)driver;

			File f= ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f,new File("C:/Users/white/git/Orbit/capturesscreenshot08.png"));

			log.info("Not updated.Check screenshot 8 verify Announcement bar");
			
			driver.navigate().refresh();

		}




	}

	public void  chat_config() throws InterruptedException, IOException {
		
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(chatconfig_click));

		//chatconfig_click.click();
		//Thread.sleep(1000);

		displaycheck.click();
		Thread.sleep(1000);

		enablechat.click();
		Thread.sleep(1000);

		Select chat= new Select(select_chattype);


		chat.selectByValue("whatsapp");
		Thread.sleep(1000);

		Whatsapp_mob.clear();
		Thread.sleep(1000);


		Whatsapp_mob.sendKeys("919087888925");
		Thread.sleep(1000);

		wassup_msg.clear();
		Thread.sleep(1000);

		wassup_msg.sendKeys("Your store Automation Testing");
		Thread.sleep(1000);

		updates.click();
		Thread.sleep(1000);

		boolean isModalClosed = driver.findElement(By.xpath("//*[text()=' Update ']")).isSelected();

		if (isModalClosed) {

			System.out.println("chat config updated successfully");

			log.info("Chat config updated successfully");



		} else {

			System.out.println("Not upated. Pls check chat config");

			TakesScreenshot ts= (TakesScreenshot)driver;

			File f= ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f,new File("C:/Users/white/git/Orbit/capturesscreenshot09.png"));

			log.info("Not updated.Check screenshot 9 verify chat config");

		}






	}

	public void newsletter() throws InterruptedException, AWTException, IOException {

		clickNews.click();
		Thread.sleep(1000);

		enablechat.click();
		Thread.sleep(1000);

		upload_img.click();
		Thread.sleep(1000);

		String img="Ride.jpg";


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

		Heading.sendKeys("Testing");
		Thread.sleep(1000);

		sub_head.sendKeys("Top Picks, Best Sellers, New Arrivals, Staff Favorites, Customer Favorites, Seasonal Selections, Trending Now, Editor's Choices, Limited Editions, Must-Haves, Popular Picks, Exclusive Offers, Hot Deals, Top-Rated Products, Special Selections, Handpicked Selections, Featured Finds, Weekly Specials, Best Value, Customer Spotlight");
		Thread.sleep(1000);

		btn_text.sendKeys("Youre Store testing");
		Thread.sleep(1000);

		List<WebElement> ln= driver.findElements(By.xpath("/html/body/app-root/app-store-layout/div[1]/div[3]/app-store-popup/div/div[2]/div/div/form/div/div[7]/div[1]/label/span[1]"));

		for(WebElement link: ln) {

			if(link.getText().equals("Link to Internal Link")) {

				link.click();

			}

		}


		urltext.sendKeys("www.google.com");
		Thread.sleep(2000);;

		updates.click();



		boolean isModalClosed = driver.findElement(By.xpath("//*[text()=' Update ']")).isSelected();

		if (isModalClosed) {

			System.out.println(" Newsletter & Popup  updated successfully");

			log.info(" Newsletter & Popup  updated successfully");



		} else {

			System.out.println("Not upated. Pls check  Newsletter & Popup ");

			TakesScreenshot ts= (TakesScreenshot)driver;

			File f= ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f,new File("C:/Users/white/git/Orbit/capturesscreenshot10.png"));

			log.info("Not updated.Check screenshot 10 verify  Newsletter & Popup ");

		}


	}

	public void search_key() throws InterruptedException, AWTException, IOException {


		Clicksearch.click();
		Thread.sleep(1000);

		//Enter_opn.sendKeys("Test");		
		//Thread.sleep(1000);

		updates.click();
		Thread.sleep(1000);


		boolean isModalClosed = driver.findElement(By.xpath("//*[text()=' Update ']")).isSelected();

		if (isModalClosed) {

			System.out.println(" search key  updated successfully");

			log.info(" search key  updated successfully");



		} else {

			System.out.println("Not upated. Pls check search key ");

			TakesScreenshot ts= (TakesScreenshot)driver;

			File f= ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f,new File("C:/Users/white/git/Orbit/capturesscreenshot11.png"));

			log.info("Not updated.Check screenshot 11 and  verify search key ");

		}



	}

	public void pages() throws InterruptedException {

		clickPages.click();
		Thread.sleep(1000);

		contact_page.click();
		Thread.sleep(1000);

		edit.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		store_loc.click();
		Thread.sleep(1000);

		Pagesetting.click();
		Thread.sleep(1000);

		Heading.sendKeys("Testing");
		Thread.sleep(1000);

		sub_head1.sendKeys("Top Picks, Best Sellers, New Arrivals, Staff Favorites, Customer Favorites, Seasonal Selections, Trending Now, Editor's Choices, Limited Editions, Must-Haves, Popular Picks, Exclusive Offers, Hot Deals, Top-Rated Products, Special Selections, Handpicked Selections, Featured Finds, Weekly Specials, Best Value, Customer Spotlight");
		Thread.sleep(1000);

		update1.click();
		Thread.sleep(1000);

		//close_setting.click();
		//Thread.sleep(1000);

		addbutton.click();
		Thread.sleep(1000);

		Nametxt.sendKeys("White Mastery");
		Thread.sleep(1000);

		mob.sendKeys("9087888925");
		Thread.sleep(1000);

		address.sendKeys("Guindy , Gulmohar avenue");
		Thread.sleep(1000);

		map_url.sendKeys("https://maps.app.goo.gl/4WkNHCWh2fysMpnm7");
		Thread.sleep(1000);

		addbtn.click();
		Thread.sleep(1000);










	}

}


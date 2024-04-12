package page_Objects;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Dashboard2 extends BaseClass {

	WebDriver driver;
	public Dashboard2(WebDriver ldriver) {

		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	WebElement Dashboard;

	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement creataccountview;

	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement Addlogoview;

	@FindBy(xpath="//body[1]/app-root[1]/app-store-layout[1]/div[2]/div[3]/app-dashboard[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[2]/span[1]")
	WebElement SetupB2BConfigurationview;


	@FindBy(xpath="(//span[contains(text(),'View')])[4]")
	WebElement Listyourproductsview;

	@FindBy(xpath="//body/app-root/app-store-layout[@class='ng-star-inserted']/div[@class='app-admin-wrap layout-sidebar-large']/div[@class='main-content-wrap d-flex flex-column sidenav-open mt-115']/app-dashboard[@class='ng-star-inserted']/div[@class='row ml-0 mr-0 mt-4 mb-4 ng-star-inserted']/div[@class='col-md-12 p-0']/div[@class='data-list-card-wrapper']/div[@class='data-list-card-inner']/div[1]/div[2]/div[1]/button[2]")
	WebElement Setupshippingmethodsview;

	@FindBy(xpath="((//span[contains(text(),'Start')])[3]")
	WebElement Configurepaymentcollectionview;

	@FindBy(xpath="(//button[@type='button'])[7]")
	WebElement Chooseplanview;

	@FindBy(name="sub_type")
	WebElement b2btypedropdown;

	@FindBy(xpath="//span[normalize-space()='Update']")
	WebElement Update;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-payment-methods/div/div[2]/div/div[2]/button/span")
	WebElement Addnew;

	@FindBy(name="name")
	WebElement Paymentdropdown;

	@FindBy(name="btn_name")
	WebElement payname;

	@FindBy(xpath="//span[normalize-space()='Add']")
	WebElement Addbtn;

	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement startconfig;

	@FindBy(xpath="//*[text()='I Agree']")
	WebElement Iagree;

	@FindBy(xpath="//input[@name='key']")
	WebElement MerchantKey;

	@FindBy(xpath="//input[@name='token']")
	WebElement MerchantToken;

	@FindBy(xpath="//select[@name='mode']")
	WebElement paymode;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-dashboard/div[2]/div/div/div/div[6]/div[2]/div/button[2]/span")
	WebElement startchoosplan;

	@FindBy(xpath="//div[@class='pricing-col-inner w-100 d-flex justify-content-space-between right-left']//button[@class='btn btn-primary-blue'][normalize-space()='Select Plan']")
	WebElement SelectPlan1;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[1]/div/i")
	WebElement Closeplan1;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-deploy-packages/div/section/div/div/div[5]/div/div[4]/div/button")
	WebElement Selectplan2;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[1]/div/i")
	WebElement Closeplan2;

	@FindBy(xpath="//button[@data-target='#collapseOne']//i[@class='material-icons'][normalize-space()='expand_more']")
	WebElement expandmore;

	@FindBy(xpath="//*[@id=\"collapseOne\"]/div/div/div/div[1]/div[2]/div/button[2]/span")
	WebElement designweb;

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchhomelayout;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-home-layout/div/div[3]/div[1]/div/div[2]/div[2]/div/div/button")
	WebElement editlayout;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[3]/input")
	WebElement layouttitle;

	@FindBy(xpath="//select[@name='featured_category_id']")
	WebElement linkcatalog;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]/span[1]")
	WebElement updatelayout;

	@FindBy(xpath="//select[@name='blogs_type']")
	WebElement layouttype;

	@FindBy(xpath="//*[@id=\"collapseOne\"]/div/div/div/div[2]/div[2]/div/button[2]/span")
	WebElement setupdomain;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-deploy-domain/div/div[2]/div/div/form/div/div[1]/div/div[2]/label/span[2]")
	WebElement radiobtn;

	@FindBy(xpath="//select[@name='provider']")
	WebElement providerdropdown;

	@FindBy(xpath="//input[@placeholder='example.in']")
	WebElement domaintxt;

	@FindBy(xpath="//span[normalize-space()='Connect your domain']")
	WebElement connectdomain;

	@FindBy(xpath="//span[normalize-space()='send']")
	WebElement sendmsg;

	@FindBy(xpath="//div[@class='show-more-data-list-card']//div[3]//div[2]//div[1]//button[2]//span[1]")
	WebElement starttax;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-tax-rates/div/div[2]/div/div[2]/button[3]/span")
	WebElement createtax;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[1]/label/span[2]")
	WebElement markcheckbox;

	@FindBy(xpath="//input[@name='name']")
	WebElement taxname;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[3]/input")
	WebElement IGST;

	@FindBy(xpath="//input[@name='sgst']")
	WebElement SGST;

	@FindBy(xpath="//input[@name='cgst']")
	WebElement CGST;

	@FindBy(xpath="//select[@name='home_state']")
	WebElement state;

	@FindBy(xpath="//span[@class='ladda-label'][normalize-space()='Add']")
	WebElement Addtax;

	@FindBy(xpath="//div[@class='show-more-data-list-card']//div[4]//div[2]//div[1]//button[2]//span[1]")
	WebElement socialmedia;

	@FindBy(xpath="//div[@class='more_icons']//span[@class='material-symbols-rounded'][normalize-space()='edit']")
	WebElement editAddress;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[2]/quill-editor/div[2]/div[1]")
	WebElement Add_Address;

	@FindBy(xpath="//span[normalize-space()='Update']")
	WebElement updateAddress;

	@FindBy(xpath="//div[@class='main-content-wrap d-flex flex-column sidenav-open']//div[3]//div[1]//div[1]//div[2]//div[1]//button[1]//span[1]")
	WebElement editMedia;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[3]/button/span")
	WebElement AddMedia;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[3]/div/div/div[1]/select")
	WebElement MediaType;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[3]/div/div/div[2]/input")
	WebElement Medialink;

	@FindBy(xpath="//div[@class='modal-footer']//button[@type='submit']")
	WebElement update_Media;

	@FindBy(xpath="//div[@class='col-2 d-flex justify-content-end align-items-center']//span[@class='material-symbols-rounded'][normalize-space()='edit']")
	WebElement editpaymethod;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[8]/button")
	WebElement AddPayMethod;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[8]/div/div/div[1]/select")
	WebElement paytype;

	@FindBy(xpath="//span[normalize-space()='Update']")
	WebElement updatepaytype;

	@FindBy(xpath="//body[1]/app-root[1]/app-store-layout[1]/div[1]/div[3]/app-dashboard[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/button[2]/span[1]")
	WebElement StoreSEO;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-store-seo/div/div[2]/div/div/div/span")
	WebElement editSEO;

	@FindBy(xpath="//input[@name='h1_tag']")
	WebElement H1Tag;

	@FindBy(xpath="//input[@name='tile_color']")
	WebElement titlecolor;

	@FindBy(xpath="//div[@class='hue']//div[@class='cursor']")
	WebElement colorside;

	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement savecolor;

	@FindBy(xpath="//input[@name='page_title']")
	WebElement pagetitle;

	@FindBy(name="meta_desc")
	WebElement meta_desc;

	@FindBy(xpath="//span[normalize-space()='Update']")
	WebElement updateSEO;

	@FindBy(xpath="//*[@id=\"collapseOne\"]/div/div/div/div[6]/div[2]/div/button[2]/span")
	WebElement startdiscount;

	@FindBy(xpath="//*[@id=\"collapseOne\"]/div/div/div/div[7]/div[2]/div/button[2]/span")
	WebElement startpolicy;

	@FindBy(xpath="//body[1]/app-root[1]/app-store-layout[1]/div[1]/div[3]/app-policies[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
	WebElement viewprivacy;

	@FindBy(xpath="//span[@class='black-outline-txt']")
	WebElement cancelpolicybtn;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-policies/div[2]/div/div/div[3]/div[2]/div/button")
	WebElement viewshippingpolicy;

	@FindBy(xpath="//span[@class='black-outline-txt']")
	WebElement cancelshipbtn;

	@FindBy(xpath="//body[1]/app-root[1]/app-store-layout[1]/div[1]/div[3]/app-policies[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/button[1]")
	WebElement viewcancepolicy;

	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement updatecancelpolicy;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-policies/div[2]/div/div/div[5]/div[2]/div/button")
	WebElement viewTandC;

	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement updateTandC;


	public void dashboard() throws InterruptedException, AWTException, IOException 
	{

		//Addbtn.click();

		Dashboard.click();
		Thread.sleep(1000);


		creataccountview.click();

		driver.findElement(By.xpath("//span[normalize-space()='edit']")).click();

		WebElement input_CompanyName=driver.findElement(By.name("company_name"));
		input_CompanyName.clear();
		input_CompanyName.sendKeys("TEST WHITEMASTERY");
		Thread.sleep(1000);


		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("Create your account is viewed and edited in dashboard");


		driver.findElement(By.xpath("//body[1]/app-root[1]/app-store-layout[1]/div[1]/div[3]/app-dashboard[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[2]")).click();

		Select b2b =new Select(b2btypedropdown);
		b2b.selectByVisibleText("Quote Based");
		Thread.sleep(2000);

		Update.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("Setup B2B config is viewed and edited in dashboard");


		startconfig.click();
		Thread.sleep(1000);

		Addnew.click();
		Thread.sleep(1000);

		Select paymethod=new Select(Paymentdropdown);
		Thread.sleep(1000);

		paymethod.selectByValue("PayU");
		Thread.sleep(1000);

		payname.sendKeys("PayU");
		Thread.sleep(1000);


		MerchantKey.sendKeys("007");
		Thread.sleep(1000);

		MerchantToken.sendKeys("Hello World");
		Thread.sleep(1000);

		Select paymod=new Select(paymode);
		paymod.selectByVisibleText("Production");


		Addbtn.click();

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("Configure payment collection is viewed and edited in dashboard");

		startchoosplan.click();
		Thread.sleep(1000);

		SelectPlan1.click();
		Thread.sleep(1000);

		Closeplan1.click();
		Thread.sleep(1000);

		Selectplan2.click();
		Thread.sleep(1000);

		Closeplan2.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("choose plan is viewed and edited in dashboard");

		expandmore.click();
		Thread.sleep(2000);
		System.out.println("Entered");

		designweb.click();
		Thread.sleep(1000);
		searchhomelayout.sendKeys("all");

		editlayout.click();
		driver.findElement(By.xpath("/html/body/app-root/app-store-layout/div[1]/div[3]/app-home-layout/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(1000);

		layouttitle.clear();
		Thread.sleep(1000);

		layouttitle.sendKeys("All in All");
		Thread.sleep(1000);

		Select linkcat=new Select(linkcatalog);
		linkcat.selectByValue("all_products");
		Thread.sleep(1000);

		updatelayout.click();
		Thread.sleep(1000);

		Select laytype=new Select(layouttype);
		laytype.selectByVisibleText("Slider");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		log.info("Design website is viewed and edited in dashboard");

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");

		expandmore.click();
		Thread.sleep(2000);

		setupdomain.click();
		Thread.sleep(2000);

		radiobtn.click();
		Thread.sleep(2000);

		Select provider= new Select(providerdropdown);
		provider.selectByVisibleText("GoDaddy");
		Thread.sleep(2000);

		domaintxt.sendKeys("test.in");
		Thread.sleep(2000);

		connectdomain.click();
		Thread.sleep(1000);

		sendmsg.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		log.info("setup domain is viewed and edited in dashboard");


		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500)","");

		expandmore.click();
		Thread.sleep(2000);

		starttax.click();
		Thread.sleep(2000);

		createtax.click();
		Thread.sleep(2000);

		markcheckbox.click();
		Thread.sleep(2000);

		taxname.sendKeys("Tax Nil");
		Thread.sleep(2000);

		IGST.sendKeys("0");
		Thread.sleep(1000);

		SGST.sendKeys("0");
		Thread.sleep(1000);

		CGST.sendKeys("0");
		Thread.sleep(1000);

		Select states=new Select(state);
		states.selectByVisibleText("Tamil Nadu");

		Addtax.click();
		Thread.sleep(1000);


		driver.navigate().back();
		Thread.sleep(1000);
		
		
		log.info("Start Tax is viewed and edited in dashboard");

		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,500)","");

		expandmore.click();
		Thread.sleep(2000);

		socialmedia.click();
		Thread.sleep(1000);

		editAddress.click();
		Thread.sleep(1000);

		Add_Address.clear();
		Thread.sleep(1000);

		Add_Address.sendKeys("Gulmohar avenue,\nChennai,\nTamilNadu");
		Thread.sleep(1000);

		updateAddress.click();
		Thread.sleep(1000);

		editMedia.click();
		Thread.sleep(1000);

		AddMedia.click();
		Thread.sleep(1000);

		Select typemedia=new Select(MediaType);

		typemedia.selectByValue("1: instagram");
		Thread.sleep(1000);

		Medialink.sendKeys("its_me_pradeepramas");
		Thread.sleep(1000);

		update_Media.click();
		Thread.sleep(1000);

		editpaymethod.click();
		Thread.sleep(1000);



		AddPayMethod.click();
		Thread.sleep(1000);

		Select payt=new Select(paytype);
		payt.selectByVisibleText("Upi");

		updatepaytype.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		log.info("Social media is viewed and edited in dashboard");

		JavascriptExecutor js4= (JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,500)","");

		expandmore.click();
		Thread.sleep(2000);

		StoreSEO.click();
		Thread.sleep(2000);

		editSEO.click();
		Thread.sleep(2000);

		H1Tag.clear();

		H1Tag.sendKeys("Excellence in Testing");
		Thread.sleep(2000);

		titlecolor.click();
		Thread.sleep(2000);

		int width=colorside.getSize().getHeight();
		System.out.println(width);

		Thread.sleep(2000);

		Actions action =new Actions(driver);

		action.clickAndHold(colorside).moveByOffset(60, 0).release().build().perform();

		Thread.sleep(2000);

		savecolor.click();
		Thread.sleep(2000);

		pagetitle.clear();
		Thread.sleep(2000);

		pagetitle.sendKeys("BRANDED COSMETICS ONLINE IN CHENNAI, INDIA");
		Thread.sleep(2000);

		meta_desc.clear();

		meta_desc.sendKeys("Enter a realm of timeless elegance with our exquisite range of beauty and cosmetics.\nMeticulously crafted and infused with the finest ingredients, our products are designed to enhance your natural beauty.");
		Thread.sleep(2000);

		updateSEO.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		log.info("StoreSEO is viewed and edited in dashboard");

		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,500)","");

		expandmore.click();
		Thread.sleep(2000);

		startdiscount.click();
		Thread.sleep(2000);

		if(startdiscount.isSelected()) {
			
			log.info("\nDiscount is selected");
		}
		else {
			log.info("Discount button not working -check screenshot 1");
			TakesScreenshot ts1=(TakesScreenshot)driver;
			File f = startdiscount.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:/Users/white/git/Orbit/capturesscreenshot01.png"));

			//screenshot copied from buffer is saved at the mentioned path.

			System.out.println("The Screenshot is captured for discount button.");
			
		}

		

		JavascriptExecutor js6= (JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,400)","");

		startpolicy.click();
		Thread.sleep(2000);

		viewprivacy.click();
		Thread.sleep(2000);

		cancelpolicybtn.click();
		Thread.sleep(2000);

		viewshippingpolicy.click();
		Thread.sleep(2000);

		cancelshipbtn.click();
		Thread.sleep(2000);

		viewcancepolicy.click();
		Thread.sleep(2000);

		updatecancelpolicy.click();
		Thread.sleep(2000);

		viewTandC.click();
		Thread.sleep(2000);

		updateTandC.click();
		Thread.sleep(2000);

		log.info("StoreSEO is viewed and edited in dashboard");
		
		Dashboard.click();
		Thread.sleep(1000);

		

	}
}

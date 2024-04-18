package page_Objects;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import jdk.internal.org.jline.utils.Log;


public class HomePage_TC_001 {

	WebDriver driver;

	Logger log= Logger.getLogger(this.getClass());


	public HomePage_TC_001(WebDriver ldriver) {

		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div[2]/div[1]/ul/li[4]/a")	
	WebElement Login;

	@FindBy(xpath="//input[@placeholder='EMAIL']")
	WebElement emailid;

	@FindBy(name="password")
	WebElement pwd;

	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbtn;

	@FindBy(xpath="//i[@id='closeModal']")
	WebElement ClosePopup;

	@FindBy(xpath="//button[@class='btn btn-wide black-outline-btn']")
	WebElement ClickYesbtn;

	@FindBy(xpath="//span[text()='Products']")
	WebElement ClickProduct;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-products/div/div[3]/div[1]/div/div[1]/div[3]/label/span[2]")
	WebElement selectAll;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-products/div/div[2]/div/div[2]/button[6]/span")
	WebElement Addproductbtn;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-add-product/div/form/div[1]/div/div/label/div/i")
	WebElement AddImage;

	@FindBy(xpath="//input[@name='name']")
	WebElement productname;

	@FindBy(name="unit")
	WebElement unitdropdown;

	@FindBy(name="stock_type")
	WebElement Stockype;

	@FindBy(name="selling_price")
	WebElement sellingprice;

	@FindBy(name="min_qty")
	WebElement min_qty;

	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	WebElement Desc;

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search;

	@FindBy(xpath="//span[normalize-space()='Test']")
	WebElement testbox;

	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement img_save_btn;

	@FindBy(xpath="//span[normalize-space()='Add']")
	WebElement Addbtn;

	@FindBy(xpath="//a[normalize-space()='Catalogs']")
	WebElement catalogs;

	@FindBy(xpath="//span[normalize-space()='sort']")
	WebElement sort;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]")
	WebElement Applysort;

	@FindBy(xpath="//body//app-root//button[3]")
	WebElement filter;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]")
	WebElement Applyfilter;

	@FindBy(xpath="//button[@routerlink='/product-sections/products/import']")
	WebElement importprod;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-import-product/div/div[2]/form/div/div/div/div[1]/div/div/label/div[2]/i")
	WebElement clickimportprod;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-import-product/div/div[2]/form/div/div/div/div[2]/button/span[1]")
	WebElement updateimpprod;

	@FindBy(xpath="//a[normalize-space()='Product Extras']")
	WebElement prodxtra;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-tags/div/div[2]/div/div[2]/button[2]/span")
	WebElement Addprodtagclick;

	@FindBy(xpath="//input[@name='name']")
	WebElement product_tag_title;

	@FindBy(xpath="//input[@name='rank']")
	WebElement rankprod;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div[2]/div/div/div/div/input")
	WebElement Prodtag_option1;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div[3]/div/button/span")
	WebElement AddOption;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div[2]/div[2]/div/div/div/input")
	WebElement Prodtag_option2;

	@FindBy(xpath="//span[normalize-space()='Add']")
	WebElement AddNewTag;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-foot-note/div/div[2]/div/div[2]/button[2]/span")
	WebElement AddFootnote;

	@FindBy(xpath="//input[@name='name']")
	WebElement NameFootnote;

	@FindBy(xpath="//textarea[@aria-label='With textarea']")
	WebElement Footdesc ;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]/span[1]")
	WebElement addfoot;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-size-chart/div/div[2]/div/div[2]/button[2]/span")
	WebElement Add_SizeChart;

	@FindBy(xpath="//input[@name='name']")
	WebElement Create_sizechartName;

	@FindBy(xpath="//input[@name='unit']")
	WebElement Create_SizeUnit;

	@FindBy(xpath="//textarea[@aria-label='With textarea']")
	WebElement SizeChart_desc;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-modify-size-chart/div/form/div[3]/div/button[2]/span[1]")
	WebElement Savesizechart;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-modify-size-chart/div/form/div[2]/div[3]/table/tbody/tr/td/input")
	WebElement columndesc;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-faq/div/div[2]/div/div[2]/button/span")
	WebElement AddFAQ;

	@FindBy(xpath="//input[@name='name']")
	WebElement FAQ1;

	@FindBy(xpath="//textarea[@aria-label='With textarea']")
	WebElement Ans1;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]/span[1]")
	WebElement SaveFAQ;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-image-tags/div/div[2]/div/div[2]/button[2]/span")
	WebElement Addtag;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[2]/div/div/div[1]/input")
	WebElement NameTag;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]")
	WebElement AddImgTag;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-taxonomy/div/div[2]/div/div[2]/button[2]/span")
	WebElement AddNew;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div[1]/div/div/div[2]/input")
	WebElement TaxonomyName;

	@FindBy(xpath="//input[@name='category_id']")
	WebElement category_id;

	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement Add_Taxonomy;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-image-gallery/div/div[2]/div/div[2]/button/span")
	WebElement Click_Folder;

	@FindBy(xpath="//input[@name='name']")
	WebElement ImgName;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/form/div/div[3]/button[2]/span[1]")
	WebElement Addimg;

	@FindBy(xpath="//span[normalize-space()='file_download']")
	WebElement imports;

	@FindBy(xpath="//i[@class='material-icons add-img']")
	WebElement clicksave;

	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement update;

	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	WebElement Dashboard;

	@FindBy(xpath="//*[text()='Click to upload image']")
	WebElement clickimport;

	@FindBy(xpath="//span[normalize-space()='Enquiries']")
	WebElement enquiries;

	@FindBy(xpath="//h4[@id='modal-basic-title']")
	WebElement cancel;

	@FindBy(xpath="/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-tags/div/div[1]/div/div/div/span")
	WebElement arrow_back;


	public void ClickLogin() {

		Login.click();
		log.info("Login link is clicked");
		String parentWindowHandle = driver.getWindowHandle();


		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div[2]/div[1]/ul/li[4]/a")).click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle:allWindowHandles) {
			if(!handle.equals(parentWindowHandle)) 
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


			}
		}
	}

	public void emailid(String email) {

		emailid.sendKeys(email);
		log.info("Email-id is entered");

	}

	public void password(String password ) {


		pwd.sendKeys(password);
		log.info("Password is entered");

	}

	public void submit() throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		submitbtn.click();
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		String current_url="https://yourstore.io/login/session/signin";
		String exp_url=driver.getCurrentUrl();


		if(current_url.equals(exp_url)) {
			Logger log= Logger.getLogger(this.getClass());

			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:/Users/white/git/Orbit/capturesscreenshot04.png"));

			//screenshot copied from buffer is saved at the mentioned path.
			log.info("Login Failed Check the sign page check screenshot 4");
			System.out.println("The Screenshot is captured for login.");

		}

		else {
			Logger log= Logger.getLogger(this.getClass());

			log.info("User is succesfully logged in");

		}

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ClickYesbtn));

	}

	public void ClosePopup() throws InterruptedException {


		//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//		wait.until(ExpectedConditions.elementToBeClickable(ClickYesbtn)).click();
		Set<String> allWindowHandles = driver.getWindowHandles();

		// Print the number of open windows
		System.out.println("Number of open windows: " + allWindowHandles.size());

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", ClickYesbtn);

		log.info("Pop up closed");







	}

	public void ClickProduct() throws InterruptedException {

		ClickProduct.click();
		Thread.sleep(1000);



	}

	public void Checkbox() throws InterruptedException, AWTException, IOException {


		//System.out.println("Entered");

		//selectAll.click();
		//Thread.sleep(1000);

		WebElement num=driver.findElement(By.xpath("/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-products/div/div[1]/div/div[2]"));

		//WebElement num= driver.findElement(By.className("m-0 fw-500 ng-tns-c85-2"));

		String tot= num.getText();

		tot= tot.replaceAll("\\D", "");
		int res= Integer.parseInt(tot);

		System.out.println("\nTotal no of Products before bulk upload :"+res);




		//clicksave.click();
		//Thread.sleep(1000);

		String filepath="C:\\Users\\white\\git\\Orbit\\test-data\\Yourstore-Bulk-Upload-Template-Without-Variant.xlsx";


		FileInputStream f1= new FileInputStream(filepath);

		XSSFWorkbook wb= new XSSFWorkbook(f1);

		XSSFSheet sheet= wb.getSheet("Worksheet");

		int rows = sheet.getLastRowNum();

		System.out.println("\nNo of products in CSV file: "+rows);



		imports.click();
		Thread.sleep(1000);


		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		// Execute JavaScript code using executeScript() method
		// For example, to scroll to the element
		jsExecutor.executeScript("arguments[0].click();", clicksave);

		//clickimport.click();
		//Thread.sleep(1000);

		String img="Yourstore Bulk Upload Template - Without Variant.csv";


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


		update.click();
		Thread.sleep(2000);

		//		Dashboard.click();
		//		Thread.sleep(2000);
		//				
		//		ClickProduct.click();
		//		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.navigate().refresh();

		WebElement trial1= driver.findElement(By.xpath("/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-products/div/div[1]/div/div[2]/p"));

		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		// presenceOfElementLocated condition
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-store-layout/div[1]/div[3]/app-product-sections/app-products/div/div[1]/div/div[2]/p")));


		String tot1= trial1.getText();

		tot1= tot1.replaceAll("\\D", "");
		int res1= Integer.parseInt(tot1);



		System.out.println("\nTotal no of Products After bulk upload :"+res1);


		System.out.println("\nNew no of products added: "+(res1-res));


		if((res1-res)==rows) {

			System.out.println("\nUploaded proucts matched with CSV file");

		}
		else {

			System.out.println("\nUploaded proucts not matched with CSV file");

		}

		SoftAssert soft= new SoftAssert();

		soft.assertEquals((res1-res),rows, "Uploaded proucts matched with CSV file");



	}

	public void AddProduct() throws InterruptedException, AWTException, IOException {

		//
		//				Addproductbtn.click();
		//				Thread.sleep(1000);
		//				
		//		
		//				//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//				//jsExecutor.executeScript("arguments[0].click();", Addproductbtn);
		//		
		//				//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		//				//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[text()='add']")));
		//				//
		//		
		//				AddImage.click();
		//				Thread.sleep(1000);
		//		
		//				String img1="Ride.png";
		//		
		//		
		//				StringSelection selection = new StringSelection(img1);
		//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//		
		//				Robot robot =new Robot();
		//		
		//				robot.delay(2000);
		//		
		//		
		//				robot.keyPress(KeyEvent.VK_CONTROL);
		//				robot.keyPress(KeyEvent.VK_V);
		//				robot.keyRelease(KeyEvent.VK_V);
		//				robot.keyRelease(KeyEvent.VK_CONTROL);
		//				robot.keyPress(KeyEvent.VK_ENTER);
		//				robot.delay(90);
		//				robot.keyRelease(KeyEvent.VK_ENTER);
		//		
		//		
		//				img_save_btn.click();
		//				Thread.sleep(1000);
		//		
		//		
		//		
		//				//AddImage.sendKeys("‪C:\\Users\\white\\OneDrive\\Pictures\\Ride.png");
		//				//System.out.println("File is Uploaded Successfully");
		//		
		//				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//		
		//				productname.sendKeys("White Mastery");
		//				Thread.sleep(2000);		
		//		
		//				Select  unit=new Select(unitdropdown);
		//				unit.selectByValue("Mts");
		//				Thread.sleep(2000);	
		//		
		//		
		//		
		//				Select limit= new Select(Stockype);
		//				limit.selectByValue("unlim");
		//				Thread.sleep(2000);	
		//		
		//				min_qty.sendKeys("100");
		//				Thread.sleep(2000);	
		//				sellingprice.sendKeys("50000");
		//				Thread.sleep(2000);	
		//		
		//				JavascriptExecutor js= (JavascriptExecutor) driver;
		//				js.executeScript("window.scrollBy(0,500)","");
		//		
		//				Desc.sendKeys("HELLO WORLD");
		//				Thread.sleep(2000);	
		//		
		//				search.sendKeys("test");
		//				Thread.sleep(2000);	
		//		
		//				testbox.click();
		//				Thread.sleep(2000);	
		//		
		//		
		//				JavascriptExecutor js1 = (JavascriptExecutor) driver;	
		//				js1.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		//		
		//				WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(20));
		//				wait1.until(ExpectedConditions.elementToBeClickable(Addbtn)).click();
		//		
		//		
		//				String exp_url="https://yourstore.io/login/product-sections/products/add/14";
		//		
		//				String act_url=driver.getCurrentUrl();
		//				Thread.sleep(2000);	
		//		
		//				//SoftAssert softAssert = new SoftAssert();
		//		
		//				//softAssert.assertEquals(act_url, exp_url, "Add product failed","yes");
		//		
		//		
		//				if(exp_url.equals(act_url)) {
		//		
		//					System.out.println("Product not added - Pls check screenshot 5");
		//		
		//					//screenshot copied from buffer is saved at the mentioned path.
		//					//log.info("Login Failed Check the sign page");
		//		
		//					File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//		
		//					FileUtils.copyFile(f, new File("C:/Users/white/git/Orbit/capturesscreenshot05.png"));
		//		
		//					log.info("Add product Failed - Check screenshot 5");
		//		
		//		
		//				}
		//		
		//				else {
		//		
		//					System.out.println("Product is addedd successfully");
		//					log.info("Product is addedd successfully");
		//		
		//				}
		//		
		//				Thread.sleep(1000);
		//		
		//				driver.navigate().back();
		//				
		//		
		//				catalogs.click();
		//				Thread.sleep(1000);
		//		
		//				driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		//		
		//		
		//				sort.click();
		//				Thread.sleep(1000);
		//		
		//				JavascriptExecutor js2=(JavascriptExecutor)driver;
		//		
		//				js2.executeScript("window,scrollBy(0,500)", "");
		//		
		//		
		//				List<WebElement> radio= driver.findElements(By.tagName("input"));
		//		
		//				for(WebElement radios:radio) {
		//		
		//		
		//		
		//					String id= radios.getAttribute("id");
		//		
		//		
		//					if(!id.isEmpty()) {
		//		
		//						//System.out.println("ID:" + id);
		//		
		//						radios.click();
		//						Thread.sleep(1000);
		//		
		//		
		//						if(id.equals("created_desc")) {
		//		
		//							break;
		//						}			
		//		
		//		
		//		
		//					}
		//		
		//		
		//		
		//				}
		//		
		//				Applysort.click();
		//				Thread.sleep(1000);
		//		
		//		
		//				JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		//				jsExecutor1.executeScript("arguments[0].click();", filter);
		//				Thread.sleep(1000);
		//		
		//				List<WebElement> filterbtn= driver.findElements(By.name("product_type"));
		//		
		//				for(WebElement filterradiobtn:filterbtn) {
		//		
		//					String prod_type= filterradiobtn.getAttribute("id");
		//		
		//					System.out.println("Product_Type:" + prod_type	);
		//		
		//					filterradiobtn.click();
		//					Thread.sleep(1000);
		//		
		//		
		//				}
		//		
		//				Applyfilter.click();
		//				Thread.sleep(1000);
		//		
		//				importprod.click();
		//				Thread.sleep(1000);
		//		
		//				clickimportprod.click();
		//		
		//				String img2="bulk.csv";
		//		
		//		
		//				StringSelection selection1 = new StringSelection(img2);
		//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
		//		
		//				//Robot robot =new Robot();
		//		
		//				robot.delay(2000);
		//		
		//		
		//				robot.keyPress(KeyEvent.VK_CONTROL);
		//				robot.keyPress(KeyEvent.VK_V);
		//				robot.keyRelease(KeyEvent.VK_V);
		//				robot.keyRelease(KeyEvent.VK_CONTROL);
		//				robot.keyPress(KeyEvent.VK_ENTER);
		//				robot.delay(90);
		//				robot.keyRelease(KeyEvent.VK_ENTER);
		//				Thread.sleep(1000);
		//		
		//		
		//				JavascriptExecutor js3= (JavascriptExecutor)driver;
		//				js3.executeScript("arguments[0].click();", updateimpprod);
		//				Thread.sleep(1000);




		prodxtra.click();
		Thread.sleep(1000);


		List<WebElement> extras= driver.findElements(By.tagName("label"));


		//System.out.println(extra);

		//driver.navigate().refresh();

		extras.get(0).click(); 

		//prodex.getin.click();
		//Thread.sleep(1000);

		Addprodtagclick.click();
		Thread.sleep(1000);

		product_tag_title.sendKeys("Test");
		Thread.sleep(1000);

		rankprod.clear();
		rankprod.sendKeys("1");
		Thread.sleep(1000);

		Prodtag_option1.sendKeys("Testing");
		Thread.sleep(1000);

		AddOption.click();
		Thread.sleep(1000);

		Prodtag_option2.sendKeys("Automation");
		Thread.sleep(1000);

		if(cancel.isSelected()) {

			System.out.println("yes");
		}
		else {

			System.out.println("No");
		}

		AddNewTag.click();
		Thread.sleep(2000);

		try {
			// Create a Robot instance
			Robot robot = new Robot();

			// Simulate pressing the "Alt + Left" keys combination to go back
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_LEFT);
			robot.keyRelease(KeyEvent.VK_LEFT);
			robot.keyRelease(KeyEvent.VK_ALT);

		} catch (AWTException e) {
			e.printStackTrace();
		}


		//driver.navigate().refresh();

		String exp_url= "https://yourstore.io/login/product-extras/product-tags";

		String act_url=driver.getCurrentUrl();

		if(!exp_url.equals(act_url)) {
			Logger log= Logger.getLogger(this.getClass());

			log.info("Product tag is successfully added");

		}
		else {
			Logger log= Logger.getLogger(this.getClass());

			log.info("Product tag addition is failed");
		}



		//log.info("Product tags added");

		List<WebElement> extras1= driver.findElements(By.tagName("label"));

		extras1.get(1).click(); 
		Thread.sleep(1000);

		AddFootnote.click();
		Thread.sleep(1000);

		NameFootnote.sendKeys("Test Footnote");
		Thread.sleep(1000);

		Footdesc.sendKeys("Testing footnote with automation using testNG framework");
		Thread.sleep(1000);

		addfoot.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);


		List<WebElement> extras2= driver.findElements(By.tagName("label"));

		extras2.get(2).click(); 
		Thread.sleep(1000);

		Add_SizeChart.click();
		Thread.sleep(1000);

		Create_sizechartName.sendKeys("Testing Automation");
		Thread.sleep(1000);

		Create_SizeUnit.sendKeys("10");
		Thread.sleep(1000);

		SizeChart_desc.sendKeys("A size chart is a visual or written guide that provides measurements and corresponding sizes for clothing, shoes, or other wearable items. \nIt helps consumers determine the appropriate size to choose when purchasing apparel or accessories online or in stores.");
		Thread.sleep(1000);

		columndesc.sendKeys("C1");
		Thread.sleep(1000);

		Savesizechart.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		Logger log= Logger.getLogger(this.getClass());

		log.info("Size Chart Added");


		List<WebElement> extras3= driver.findElements(By.tagName("label"));

		extras3.get(3).click(); 
		Thread.sleep(1000);

		AddFAQ.click();
		Thread.sleep(1000);

		FAQ1.sendKeys("How can I create an account?");
		Thread.sleep(1000);

		Ans1.sendKeys("To create an account, simply navigate to the sign-up page on our application and provide the required information such as your name, email address, and password. Once you submit the form, your account will be created, and you can start shopping immediately.");
		Thread.sleep(1000);

		SaveFAQ.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("FAQ Added");

		List<WebElement> extras4= driver.findElements(By.tagName("label"));

		extras4.get(4).click(); 
		Thread.sleep(1000);

		Addtag.click();
		Thread.sleep(1000);

		NameTag.sendKeys("Only one stock available");
		Thread.sleep(1000);

		AddImgTag.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("Image Tags addded");

		List<WebElement> extras5= driver.findElements(By.tagName("label"));

		extras5.get(5).click(); 
		Thread.sleep(1000);

		AddNew.click();
		Thread.sleep(1000);

		TaxonomyName.sendKeys("Bright and White");
		Thread.sleep(1000);

		category_id.sendKeys("6400");
		Thread.sleep(1000);

		Add_Taxonomy.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("Product taxonomy added");

		List<WebElement> extras6= driver.findElements(By.tagName("label"));

		extras6.get(6).click(); 
		Thread.sleep(1000);


		Click_Folder.click();
		Thread.sleep(1000);

		ImgName.sendKeys("Image 1:");
		Thread.sleep(1000);

		Addimg.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		log.info("Image uploader added");


	}



}














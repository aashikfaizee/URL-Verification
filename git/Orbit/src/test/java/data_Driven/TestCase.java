package data_Driven;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import jdk.internal.org.jline.utils.Log;
import page_Objects.ExcelUtils;


public class TestCase {

	WebDriver driver;
	@BeforeClass
	void setup() {
		driver= new ChromeDriver();
		driver.get("https://yourstore.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentWindowHandle = driver.getWindowHandle();


	}
	@Test
	void login() throws IOException, InterruptedException {

		String File= System.getProperty("user.dir")+("\\test-data\\LoginData.xlsx");
		int rows= ExcelUtils.getRowCount(File, "Sheet1");
		for(int r=1;r<=rows;r++) {
			
			String emailid= ExcelUtils.getCellData(File, "Sheet1", r, 0);
			String pwd= ExcelUtils.getCellData(File, "Sheet1", r, 1);
			String parentWindowHandle = driver.getWindowHandle();


			driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div[2]/div[1]/ul/li[4]/a")).click();

			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String handle:allWindowHandles) {
				if(!handle.equals(parentWindowHandle)) 
				{
					driver.switchTo().window(handle);

				}
			}
			driver.findElement(By.xpath("//input[@placeholder='EMAIL']")).sendKeys(emailid);
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);

			


			//validation
			String exp_title="Yourstore";
			String act_title=driver.getTitle();
			if (act_title.equals(exp_title)) 
			{
				
				System.out.println("Test is Passed");
				ExcelUtils.setCellData(File, "Sheet1", r,2, "pass");
				ExcelUtils.fillGreenColor(File, "Sheet1", r,2);
				//driver.findElement(By.xpath("//button[normalize-space()='Select Plan']")).click();
				driver.switchTo().window(parentWindowHandle);



			}
			else {
				System.out.println("Test is failed");
				ExcelUtils.setCellData(File, "Sheet1", r, 2, "fail");
				ExcelUtils.fillRedColor(File, "Sheet1", r, 2);
			}


		}


	}
	//	@AfterTest
	//	void close() {
	//		driver.quit();
	//	}

}

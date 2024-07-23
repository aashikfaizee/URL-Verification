package com.tutorialninja.qa.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Chennai_Adayar2  {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tnreginet.gov.in");

		driver.manage().window().maximize();

		driver.findElement(By.id("fontSelection")).click();

		driver.findElement(By.xpath("//a[@title='Guideline Value']")).click();

		driver.findElement(By.xpath("//u[normalize-space()='Click here to search the Draft Guideline revision']"))
				.click();

		driver.findElement(By.id("composite")).click();

		WebElement Zone = driver.findElement(By.id("cmb_zone"));

		Select dropdown1 = new Select(Zone);

		List<WebElement> options = dropdown1.getOptions();

		for (WebElement option : options) {
			
		
			if (option.getText().equals("Chennai")) {

				dropdown1.selectByVisibleText("Chennai");

			}

		}
		WebElement Sub_Registrar_Office = driver.findElement(By.id("cmb_sub_registrar_office"));
		Select dropdown2 = new Select(Sub_Registrar_Office);
		List<WebElement> options1 = dropdown2.getOptions();
		for (WebElement option1 : options1) {

			if (option1.getText().equals("Alandur")) {

				dropdown2.selectByVisibleText("Alandur");

			}

		}

	}

	@Test(priority=1)
	public void verifyAdayar_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Adayar")) {

				dropdown3.selectByVisibleText("Adayar");

				getdata();
			}

		}
	}
	
	@Test(priority=2)
	public void Kanagam_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Kanagam")) {

				dropdown3.selectByVisibleText("Kanagam");
				getdata();

			}

		}
	}
	@Test(priority=3)
	public void Kazhikundram_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Kazhikundram")) {

				dropdown3.selectByVisibleText("Kazhikundram");
				getdata();

			}

		}
		
	}
	@Test(priority=4)
	public void Kottivakkam_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Kottivakkam")) {

				dropdown3.selectByVisibleText("Kottivakkam");
				getdata();

			}

		}
		
	}	
	
	@Test(priority=5)
	public void Kottur_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Kottur")) {

				dropdown3.selectByVisibleText("Kottur");
				getdata();

			}

		}
		
	}	
	
	@Test(priority=6)
	public void Pallipattu_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Pallipattu")) {

				dropdown3.selectByVisibleText("Pallipattu");
				getdata();

			}

		}
		
	}	
	
	@Test(priority=7)
	public void Tharamani_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Tharamani")) {

				dropdown3.selectByVisibleText("Tharamani");
				getdata();

			}

		}
		
	}	
	@Test(priority=8)
	public void Urur_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Urur")) {

				dropdown3.selectByVisibleText("Urur");
				getdata();

			}

		}
		
	}	
	@Test(priority=9)
	public void Venkatapuram_Registeration() {
		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		for (WebElement option3 : options3) {

			if (option3.getText().equals("Venkatapuram")) {

				dropdown3.selectByVisibleText("Venkatapuram");
				getdata();

			}

		}
		
	}	
	
	public void processTable() {
		// Find all rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='surveyTable']/tbody/tr")); // Replace with
																										// your actual
																										// table ID

		// Process each row in the current page of the table
		for (WebElement row : rows) {
			// Extract and process data from each column in the row
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement column : columns) {
				System.out.print(column.getText() + "\t"); // Example: Print each cell's text
			}
			System.out.println(); // Move to the next line for the next row
		}

	}

	public void getdata() {

		driver.findElement(By.id("search")).click();

		String text = driver.findElement(By.xpath("//span[@class='pagebanner']")).getText();
		System.out.println(text);
		boolean hasNextPage = true;
		while (hasNextPage) {
			processTable();

			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Next")));
				if (nextButton.isEnabled()) {
					nextButton.click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				} else {
					hasNextPage = false;
				}
			} catch (org.openqa.selenium.StaleElementReferenceException e) {
				hasNextPage = false;
				System.out.println("Next button is stale. Ending pagination.");
			}
		}
		
		
	}

	@AfterMethod
	public void Close() {
		
		driver.quit();
	}
}


package com.tutorialninja.qa.testcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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

public class Chennai_Adayar4 {

	public static WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://tnreginet.gov.in");

		driver.manage().window().maximize();

		driver.findElement(By.id("fontSelection")).click();

		driver.findElement(By.xpath("//a[@title='Guideline Value']")).click();

	}

	public static void ZoneChennai()

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//td[normalize-space()='From 1-7-2024']")).click();

		driver.findElement(By.id("CompositeValue")).click();

		WebElement Zone = driver.findElement(By.id("cmb_zone"));

		Select dropdown1 = new Select(Zone);

		List<WebElement> options = dropdown1.getOptions();

		for (WebElement option : options) {

			if (option.getText().equals("Chennai")) {

				dropdown1.selectByVisibleText("Chennai");

			}

		}
	}

	public static void sub_register() {

		WebElement Sub_Registrar_Office = driver.findElement(By.id("cmb_sub_registrar_office"));
		Select dropdown2 = new Select(Sub_Registrar_Office);
		List<WebElement> options1 = dropdown2.getOptions();
		for (WebElement option1 : options1) {

			if (option1.getText().equals("Chennai South Joint II")) {

				dropdown2.selectByVisibleText("Chennai South Joint II");

			}

		}

	}

	@Test(priority = 1)
	public void verifyAdayar_Registeration() throws InterruptedException, IOException {

		ZoneChennai();
		sub_register();

		WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
		Select dropdown3 = new Select(Reg_Village);
		List<WebElement> options3 = dropdown3.getOptions();
		int no = options3.size();

		for (int i = 1; i < 10; i++) {

			if (i != 1) {

				System.out.println("Entered:" + i + "");

				ZoneChennai();
				sub_register();

				WebElement Reg_Village1 = driver.findElement(By.id("cmb_reg_village"));
				Select dropdown31 = new Select(Reg_Village1);
				List<WebElement> options31 = dropdown31.getOptions();
				int numberOfOptions = options31.size();

				for (WebElement option : options31) {

					System.out.println(option.getText());
				}
				//System.out.println(numberOfOptions);
				// String value = options31.get(i).getAttribute("value");
				dropdown31.selectByIndex(i);
				// Optionally, you can print the selected value to the console
				// System.out.println("Selected value: " + value);

				// driver.findElement(By.id("search")).click();

//				try {
//
//					Alert alert = driver.switchTo().alert();
//					alert.accept();
//					
//				} catch (Exception e) {
//					// System.out.println("No Pop up");
//				}
//
//				// Accept the alert (click OK)
//
//				try {
//					String text = driver.findElement(By.xpath("//span[@class='pagebanner']")).getText();
//					System.out.println(text);
//				} catch (Exception e) {
//					System.out.println("No Data");
//				}
				getdata();
				Thread.sleep(1000);

			} else {
				WebElement Reg_Village1 = driver.findElement(By.id("cmb_reg_village"));
				Select dropdown31 = new Select(Reg_Village1);
				List<WebElement> options31 = dropdown31.getOptions();
				dropdown31.selectByIndex(i);
				// Optionally, you can print the selected value to the console
				// System.out.println("Selected value: " + value);

				getdata();

				Thread.sleep(1000);
			}

		}

//		for (WebElement option3 : options3) {
//			ZoneChennai();
//			sub_register();
//			String optionText = option3.getText();
//			System.out.println("Selecting option: " + optionText);
//			if (!option3.getText().contains("Adayar")) {
//				if (option3.getText().contains("- Select -")) {
//					continue;
//				} else {
//
//					try {
//						// Select the option by visible text
//						dropdown3.selectByVisibleText(optionText);
//
//						// Call your methods
//						getdata();
//
//						Thread.sleep(1000);
//						// Introduce a delay before the next iteration
//
//					} catch (InterruptedException e) {
//						// Handle the InterruptedException
//						e.printStackTrace();
//						Thread.currentThread().interrupt(); // Restore the interrupted status
//					} catch (Exception e) {
//						// Handle other potential exceptions
//						System.err.println("An error occurred: " + e.getMessage());
//					}
//				}
//
//			}
//
//			if (optionText.contains("Adayar")) {
//				try {
//					// Select the option by visible text
//					dropdown3.selectByVisibleText(optionText);
//
//					// Call your methods
//					getdata();
//
//					Thread.sleep(1000);
//					// Introduce a delay before the next iteration
//
//				} catch (InterruptedException e) {
//					// Handle the InterruptedException
//					e.printStackTrace();
//					Thread.currentThread().interrupt(); // Restore the interrupted status
//				} catch (Exception e) {
//					// Handle other potential exceptions
//					System.err.println("An error occurred: " + e.getMessage());
//				}
//			}

	}

	public void processTable() throws IOException {
		// Find all rows in the table

	}

	public void getdata() throws IOException {

		
		driver.findElement(By.id("search")).click();

		String text = driver.findElement(By.xpath("//span[@class='pagebanner']")).getText();
		System.out.println(text);
		boolean hasNextPage = true;
		int rowCount = 0;
		int sheetIndex = 0;
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet[] sheets = { workbook.createSheet("Adayalampattu"), workbook.createSheet("Koladi"),
				workbook.createSheet("Parangimalai"), workbook.createSheet("Perumalagaram"),
				workbook.createSheet("Ramapuram"), workbook.createSheet("Saidapet") };

		while (hasNextPage) {

			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='searchTable']/tbody/tr")); // Replace
																											// with your
																											// actual
																											// table ID

			// Process each row in the current page of the table
			for (int i = 0; i < rows.size(); i++) {
				WebElement row = rows.get(i);
				List<WebElement> cells = row.findElements(By.tagName("td"));

				// Create a new row in the Excel sheet
				XSSFRow excelRow = sheets[sheetIndex].createRow(rowCount++);

				for (int j = 0; j < cells.size(); j++) {
					WebElement cell = cells.get(j);

					// Set the cell value in the Excel sheet
					excelRow.createCell(j).setCellValue(cell.getText());
				}
			}

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			try {
				WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Next")));
				if (nextButton.isEnabled()) {
					nextButton.click();
					rowCount = 0; // Reset row count for new page
					sheetIndex++; // Move to the next sheet
					Thread.sleep(3000); // Replace with a better wait strategy if needed
				} else {
					hasNextPage = false;
				}
			} catch (TimeoutException e) {
				hasNextPage = false; // End loop if no next button found
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		FileOutputStream fileOut = new FileOutputStream("data.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();

		driver.findElement(By.xpath("//input[@type='button' and @value='Go Back To Main Menu']")).click();
		System.out.println("Clicked");

	}

	@AfterMethod
	public void Close() {

		// driver.quit();
	}
}

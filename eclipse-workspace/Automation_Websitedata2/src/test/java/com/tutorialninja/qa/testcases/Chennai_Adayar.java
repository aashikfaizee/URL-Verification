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
import org.openqa.selenium.NoSuchElementException;
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

public class Chennai_Adayar {

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

			if (option.getText().equals("Chengalpattu")) {

				dropdown1.selectByVisibleText("Chengalpattu");

			}

		}
	}

	public static void sub_register() throws InterruptedException, IOException {

		WebElement Sub_Registrar_Office = driver.findElement(By.id("cmb_sub_registrar_office"));
		Select dropdown2 = new Select(Sub_Registrar_Office);
		List<WebElement> options1 = dropdown2.getOptions();
		for (WebElement option1 : options1) {

			if (option1.getText().equals("Sriperumpudur")) {

				dropdown2.selectByVisibleText("Sriperumpudur");
				//verifyAdayar_Registeration();
				

			}

		}

	}

	@Test(priority = 1)
	public static void verifyAdayar_Registeration() throws InterruptedException, IOException {
		int sheetNumber = 1;

		// Create workbook only once
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create sheets for each dropdown option once
		XSSFSheet[] sheets = null;

		for (int i = 1; i<=67;i++) {
		    try {
		        ZoneChennai();
		        sub_register();

		        System.out.println("Entered: " + i);

		        WebElement Reg_Village1 = driver.findElement(By.id("cmb_reg_village"));
		        Select dropdown31 = new Select(Reg_Village1);
		        List<WebElement> options31 = dropdown31.getOptions();

		        // Create sheets only once
		        if (sheets == null) {
		            sheets = new XSSFSheet[options31.size()];
		            System.out.println(options31.size());
		            for (int j = 0; j < options31.size(); j++) {
		                WebElement option = options31.get(j);
		                System.out.println(option.getText());
		                sheets[j] = workbook.createSheet(option.getText());
		            }
		        }

		        dropdown31.selectByIndex(i);

		        driver.findElement(By.id("search")).click();

		        try {
		            String text = driver.findElement(By.xpath("//span[@class='pagebanner']")).getText();
		            System.out.println(text);
		        } catch (NoSuchElementException e) {
		            System.out.println("Element not found: " + e.getMessage());
		        } catch (Exception e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        }

		        boolean hasNextPage = true;
		        int rowCount = 0;
		        int sheetIndex = i; // Adjusted to select the correct sheet

		        while (hasNextPage) {
		            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='searchTable']/tbody/tr"));

		            for (int j = 0; j < rows.size(); j++) {
		                WebElement row = rows.get(j);
		                List<WebElement> cells = row.findElements(By.tagName("td"));

		                XSSFRow excelRow = sheets[sheetIndex].createRow(rowCount++);

		                for (int k = 0; k < cells.size(); k++) {
		                    WebElement cell = cells.get(k);
		                    excelRow.createCell(k).setCellValue(cell.getText());
		                }
		            }

		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		            try {
		                WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Next")));
		                if (nextButton.isEnabled()) {
		                    nextButton.click();
		                    Thread.sleep(2000);
		                } else {
		                    hasNextPage = false;
		                }
		            } catch (TimeoutException e) {
		                hasNextPage = false;
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }

		        driver.findElement(By.xpath("//input[@type='button' and @value='Go Back To Main Menu']")).click();
		        System.out.println("Clicked");
		        

		    } catch (Exception e) {
		        System.out.println("An error occurred in iteration " + i + ": " + e.getMessage());
		    }
		}

		// Save workbook to a single file at the end
		try (FileOutputStream fileOut = new FileOutputStream("Chengalpattu_Sriperumpudur_composite.xlsx")) {
		    workbook.write(fileOut);
		    workbook.close();
		} catch (IOException e) {
		    System.out.println("An error occurred while saving the workbook: " + e.getMessage());
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

//	public void processTable() throws IOException {
//		// Find all rows in the table
//
//	}
//
//	public void getdata() throws IOException {
//
//		
//		
//
//	}

	@AfterMethod
	public void Close() {

		// driver.quit();
	}
}

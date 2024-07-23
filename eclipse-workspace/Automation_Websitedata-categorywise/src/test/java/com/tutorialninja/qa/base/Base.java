package com.tutorialninja.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
				WebElement Sub_Registrar_Office = driver.findElement(By.id("cmb_sub_registrar_office"));
				Select dropdown2 = new Select(Sub_Registrar_Office);
				List<WebElement> options1 = dropdown2.getOptions();
				for (WebElement option1 : options1) {

					if (option1.getText().equals("Adayar")) {

						dropdown2.selectByVisibleText("Adayar");
						WebElement Reg_Village = driver.findElement(By.id("cmb_reg_village"));
						Select dropdown3 = new Select(Reg_Village);
						List<WebElement> options3 = dropdown3.getOptions();

						for (WebElement option3 : options3) {

							if (option3.getText().equals("Adayar")) {

								dropdown3.selectByVisibleText("Adayar");
								driver.findElement(By.id("search")).click();

								String text = driver.findElement(By.xpath("//span[@class='pagebanner']")).getText();
								System.out.println(text);
								boolean hasNextPage = true;
								while (hasNextPage) {
									processTable(driver);

									try {
										WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
										WebElement nextButton = wait
												.until(ExpectedConditions.elementToBeClickable(By.linkText("Next")));
										if (nextButton.isEnabled()) {
											nextButton.click();
											Thread.sleep(2000);
										} else {
											hasNextPage = false;
										}
									} catch (org.openqa.selenium.StaleElementReferenceException e) {
										hasNextPage = false;
										System.out.println("Next button is stale. Ending pagination.");
									}
//								processTable(driver);
//								
//								WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(10));
//
//								WebElement nextButton= wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(13) > div:nth-child(2) > div:nth-child(3) > form:nth-child(10) > div:nth-child(32) > div:nth-child(1) > div:nth-child(1) > strong:nth-child(4) > strong:nth-child(1) > div:nth-child(17) > div:nth-child(11) > span:nth-child(2) > a:nth-child(5)")));
//								
//								nextButton.click();
//								Thread.sleep(1000);
//
//								processTable(driver);

								}
							}
						}
					}
				}
			}
		}
	}

	public static void processTable(WebDriver driver) {
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
}

/*
 * // find the rows in webtable List<WebElement> all =
 * driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
 * 
 * int rows = all.size(); System.out.println(all.size()); // find the columns
 * 
 * List<WebElement> all1 =
 * driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")); int
 * col = all1.size(); System.out.println(all1.size());
 * 
 * // find specific data String value =
 * driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[3]")).
 * getText(); System.out.println(value);
 * 
 * // print whole data for (int i = 2; i < rows; i++) { for (int j = 1; j < col;
 * j++) {
 * 
 * String val = driver
 * .findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + i + "]/td[" +
 * j + "]")) .getText(); System.out.println(val);
 * 
 * } }
 */

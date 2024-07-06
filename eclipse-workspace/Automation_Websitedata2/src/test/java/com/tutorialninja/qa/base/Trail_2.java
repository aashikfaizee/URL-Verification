package com.tutorialninja.qa.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trail_2 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Set the path to the WebDriver executable
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://tnreginet.gov.in");

		try {
			driver.get("https://tnreginet.gov.in");

			boolean hasNextPage = true;
			while (hasNextPage) {
				processTable(driver);

				try {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Next")));
					if (nextButton.isEnabled()) {
						nextButton.click();
						Thread.sleep(1000);
					} else {
						hasNextPage = false;
					}
				} catch (org.openqa.selenium.StaleElementReferenceException e) {
					hasNextPage = false;
					System.out.println("Next button is stale. Ending pagination.");
				}
			}

		} finally {
			// Close the browser
			driver.quit();
		}
	}

	public static void processTable(WebDriver driver) {

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

								// Find all rows in the table
								List<WebElement> rows = driver
										.findElements(By.xpath("//table[@id='surveyTable']/tbody/tr")); // Replace with
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

					}
				}
			}
		}
	}
}

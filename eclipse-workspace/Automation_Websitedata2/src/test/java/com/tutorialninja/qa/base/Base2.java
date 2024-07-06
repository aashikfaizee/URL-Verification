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

public class Base2 {

	WebDriver driver;
	
	public  Base2() {
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

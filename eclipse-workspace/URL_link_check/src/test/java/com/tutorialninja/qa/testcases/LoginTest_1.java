package com.tutorialninja.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest_1 {

	public  WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		// HomePage homepage= new HomePage(driver);

		// driver.findElement(By.linkText("Login")).click();

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

	@Test(priority = 1)
	public void Verify_Orbit_Webiste() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://orbit.pripod.com/");
		driver.manage().window().maximize();
		
		// String Exp_Title="https://orbit.pripod.com/";
		Assert.assertTrue(driver.findElement(By.linkText("Reset password")).isDisplayed());

	}

	@Test(priority = 2)
	public void verfiy_TringAI_Website() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tringai.netlify.app/");
		driver.manage().window().maximize();
		// String Exp_Title="https://orbit.pripod.com/";
		String exp_title = driver.getTitle();
		String act_title = "Tring AI Voice Bot Intelligence for Empowering Your Business";
		Assert.assertTrue(exp_title.contains(act_title));

	}

	@Test(priority = 3)
	public void verify_CarbonLoops_Website() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.carbonloops.com/");
		driver.manage().window().maximize();
		String exp_title = driver.getTitle();
		String act_title = "Carbon Loops";
		Assert.assertTrue(exp_title.contains(act_title));

	}

	@Test(priority = 4)
	public void verfiy_EllaFoods_Wesbite() {

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ellafoods.in/");
		driver.manage().window().maximize();
		String exp_title = driver.getTitle();
		String act_title = "Ella Foods | Food Made Healthier | Low Sodium Pickles | Quality Rice";
		Assert.assertTrue(exp_title.contains(act_title));

	}

	@Test(priority = 5)
	public void verfiy_stoneandacres_Website() {

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.stoneandacres.com/");
		driver.manage().window().maximize();

		// WebElement ele1= driver.findElement(By.xpath("//img[@class='logo-default lazy
		// loading']"));

		// String Exp_Title="https://orbit.pripod.com/";
		Assert.assertTrue(driver.findElement(By.xpath("//h4[normalize-space()='ParkHills']")).isDisplayed());

	}

}

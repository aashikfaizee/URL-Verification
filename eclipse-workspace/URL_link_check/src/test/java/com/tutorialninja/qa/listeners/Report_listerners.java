package com.tutorialninja.qa.listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tutorilaninja.qa.test.utils.ExtentReporter;

public class Report_listerners implements ITestListener {

	ExtentReports reporter;
	ExtentTest extenttest;
	WebDriver driver;

	@Override
	public void onStart(ITestContext context) {

		try {
			reporter = ExtentReporter.generateExtentReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestStart(ITestResult result) {

		String testname = result.getName();
		extenttest = reporter.createTest(testname);
		extenttest.log(Status.INFO, testname + "started executing");
		System.out.println(testname + " started exceuting ");

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String testname = result.getName();
		extenttest.log(Status.PASS, testname + "got successfully executed");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		String testname = result.getName();

		System.out.println("Screenshot Taken");

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\Screenshots\\"+testname+".png";
		try {

			FileHandler.copy(screenshot, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extenttest.addScreenCaptureFromPath(destination);
		extenttest.log(Status.INFO, result.getThrowable());
		extenttest.log(Status.FAIL, "got failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		String testname = result.getName();
		extenttest.log(Status.INFO, result.getThrowable());
		extenttest.log(Status.SKIP, testname + "got skipped");

	}

	@Override
	public void onFinish(ITestContext context) {

		reporter.flush();

	}

}

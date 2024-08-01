package com.tutorilaninja.qa.test.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	public static ExtentReports generateExtentReport() throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File extentfile = new File(System.getProperty("user.dir") + "\\test-output\\ExtentReports\\extentreport.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(extentfile);

		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Automation URL");
		spark.config().setDocumentTitle("AUTOMATION URL REPORT");
		spark.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");

		extentreport.attachReporter(spark);
		//Properties configprop = new Properties();
		//File configpropfile = new File(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\tutorialninja\\qa\\config\\config.properties");	
	   // FileInputStream fisconfig= new FileInputStream(configpropfile);
	  //  configprop.load(fisconfig);
	    
		//extentreport.setSystemInfo("Application URL", configprop.getProperty("url"));
		//extentreport.setSystemInfo("Application browser", configprop.getProperty("browser"));
		extentreport.setSystemInfo("USER", "Aashik");
		extentreport.setSystemInfo("DESIGNATION", "Senior Manager");
		extentreport.setSystemInfo("QA", "Pradeep Srinivasan R");
		return extentreport;
		
	}

}

package page_Objects;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;


public class BaseClass {

	public static WebDriver driver;
	public static Logger log;
	ReadConfig rc= new ReadConfig();
	
	public String url= rc.getApplicationURL();
	public String emailid=rc.getemailid();
	public String password=rc.getPassword();
	
	@BeforeClass
	@Parameters("browser")
	public void openApplicationurl(String br) {
		if(br.equals("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		else if(br.equals("edge")){
			driver=new EdgeDriver();
			
			
		}
		else if (br.equals("firefox")) {
			driver=new  FirefoxDriver();
			
		}
	     log=Logger.getLogger(this.getClass());
		 PropertyConfigurator.configure("./log4j.properties");
	     driver.get(url);
	     log.info("URL is Entered in Chrome");
	
	}
//	@AfterClass
//	   public void closeApplication() {
//	       driver.close();
//	   }

	
	}

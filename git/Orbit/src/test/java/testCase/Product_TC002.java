package testCase;

import java.awt.AWTException;

import page_Objects.BaseClass;
import page_Objects.Dashboard2;
import page_Objects.Home_page;

public class Product_TC002 extends BaseClass{
	
	public void produt_test() throws InterruptedException, AWTException {
		Home_page hp= new Home_page(driver);
		
		
		log.info("MouseHover Action to close the Tab");
		hp.ClickProduct();
		log.info("Product is clicked");
		hp.Checkbox();
		log.info("Select all check box is enabled");
		hp.AddProduct();
		log.info("Add product is selected:");
	}

}

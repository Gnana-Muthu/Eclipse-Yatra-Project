package Academey.demo;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

//Adding logs
//Generating html reports
//Screenshots on failure
//Jenkins integration
public class validateNavigationBar extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=intializerDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	
	public void basePageNavigation() throws IOException {
		driver=intializerDriver();
		driver.get(prop.getProperty("url"));
		//one is inheritance
		//creating object to that class and invoke methods of it
		LandingPage l= new LandingPage(driver);
		//compare the text from the browser with actual text -Error...
		Assert.assertTrue(l.getNavBar().isDisplayed());
		log.info("Navigationbar is display");
		//Assert.assertFalse(false);
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}

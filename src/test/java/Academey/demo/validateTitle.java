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

public class validateTitle extends base {
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	

	@BeforeTest
	public void initialize() throws IOException {
		driver=intializerDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
	}
	@Test
	
	public void basePageNavigation() throws IOException {
		driver=intializerDriver();
		driver.get(prop.getProperty("url"));
		//one is inheritance
		//creating object to that class and invoke methods of it
		LandingPage l= new LandingPage(driver);
		//compare the text from the browser with actual text -Error...
        Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
		log.info("Successfully validated Text message");
		//Assert.assertTrue(false)
		//System.out.println(l.getTitle().getText());
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

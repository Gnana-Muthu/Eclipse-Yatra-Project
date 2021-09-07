package Academey.demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver=intializerDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password, String Text) throws IOException {
		
		driver.get(prop.getProperty("url"));
		//one is inheritance
		//creating object to that class and invoke methods of it
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
	//System.out.println(Text);
	log.info(Text);
		lp.getLogin().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		
		//Array size is 5
		//0,1,2,3,4
		
		
		Object[][] data =new Object[2][3];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="12345";
		data[0][2]="restricted user";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]="Non restricted user";
		
		return data;
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

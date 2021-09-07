package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePage {

	public WebDriver driver;
	By searchBox=By.xpath("//*[@id='search-courses']");
	
	

	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement getSearchBox() {
		// TODO Auto-generated method stub
		return driver.findElement(searchBox);
	}
	
	
}

package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By sigin= By.cssSelector("a[href*='sign_in']");
	By title= By.cssSelector(".text-center>h2");
	By NavBar= By.xpath("//*[@id='homepage']/header/div[2]");
	By popup=By.xpath("//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(sigin);
	}
	
	public WebElement getNavBar() {
		// TODO Auto-generated method stub
		return driver.findElement(NavBar);
	}
	public List<WebElement> getPopUpSize() {
		// TODO Auto-generated method stub
		return driver.findElements(popup);
	}

public List<WebElement> getPopUp() {
	// TODO Auto-generated method stub
	return driver.findElements(popup);
}
public WebElement getTitle() {
	// TODO Auto-generated method stub
	return driver.findElement(title);
}
}

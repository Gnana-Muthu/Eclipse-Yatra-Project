package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By Email= By.cssSelector("[id='user_email']");
	By password= By.cssSelector("[type='password']");
	By login= By.cssSelector("[value='Log In']");
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(Email);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}
	
}

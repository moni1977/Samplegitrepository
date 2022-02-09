package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sauceDemoPage {
WebDriver driver;
public sauceDemoPage (WebDriver driver) {
		this.driver =driver;
}	
	public WebElement getUserName() {
		
	WebElement UserName = driver.findElement(By.id("user-name"));	
	return UserName;	
		
	}		
	
	public WebElement getPassWord() {
		
		WebElement PassWord = driver.findElement(By.id("password"));	
		return PassWord;
	}
	
		public WebElement getLogin() {
			
			WebElement Login= driver.findElement(By.id("login-button"));	
			return Login;
		}
}	


	
	
	
	
	
	


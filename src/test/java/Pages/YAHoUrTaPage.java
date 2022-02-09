package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YAHoUrTaPage {

	WebDriver driver;
	
	public YAHoUrTaPage(WebDriver driver) {
		
		this.driver  =driver;
	}
		
	public WebElement getHelpLink() {
	WebElement 	HelpLink =driver.findElement(By.linkText("Help"));
	return HelpLink;}	
	
	public WebElement getHelpUrltext () {
		WebElement 	HelpUrl =driver.findElement(By.xpath("//*[@id=\"Stencil\"]/body/header/div/div[3]/h1"));
			
		return 	HelpUrl;
	}		


		public WebElement getBBT() {
	WebElement BBT= driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/h2"));
	    return  BBT;
		}
	public WebElement getPassWordAndSingin() {
	WebElement PassWordAndSingin = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[2]/a"));	
		
	return 	PassWordAndSingin;
	}
	
	public WebElement getAccountKey() {
		WebElement AccountKey = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[3]/a"));	
			
		return 	AccountKey;
		}
	public WebElement getAccountSecurity() {
		WebElement AccountSecurity = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[4]/a"));	
			
		return 	AccountSecurity;
		}

	public WebElement getCreateOrDeleteAccount() {
		WebElement CreateOrDeleteAccount = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[5]/a"));	
			
		return 	CreateOrDeleteAccount;
		}
	
	public WebElement getManageAccountSetting() {
		WebElement ManageAccountSetting= driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[6]/a"));	
			
		return 	ManageAccountSetting;
		}
	
	public WebElement getAccessibility() {
		WebElement Accessibility = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[7]/a"));	
			
		return Accessibility;
		}
	public WebElement getYahooPolicy() {
		WebElement YahooPolicy = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[8]/a"));	
			
		return 	YahooPolicy;
		}


	
}	
	
	
	


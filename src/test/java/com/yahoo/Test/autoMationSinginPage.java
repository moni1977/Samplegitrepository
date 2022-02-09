package com.yahoo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autoMationSinginPage {
	
	WebDriver driver;
	
	public autoMationSinginPage(WebDriver driver) {
		this.driver =driver;
	}
     public WebElement getCreateEmail() {
	WebElement CreateEmail = driver.findElement(By.name("email_create"));
	return CreateEmail;
     } 
    public WebElement getCreateAnAccount() { 
     WebElement CreateAnAccount =driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
    return CreateAnAccount;
    }
	public WebElement getEmailAddress() {
		WebElement EmailAddress = driver.findElement(By.name("email"));	
		return EmailAddress;	
		}		
			

		public WebElement getPassWord() {
		WebElement PassWord = driver.findElement(By.id("passwd"));	
		return PassWord;	
		}	

		public WebElement getSingin() {
		WebElement Singin= driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));	
		return Singin;	
		}	
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	




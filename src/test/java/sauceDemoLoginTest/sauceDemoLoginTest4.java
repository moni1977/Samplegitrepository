package sauceDemoLoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.sauceDemoPage;

public class sauceDemoLoginTest4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\TestLibery\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		

		String UserName1 = "standard_user";
		String UserName2 = "locked_out_user";
		String UserName3 = "problem_user";
		String UserName4 = "performance_glitch_user";
		String Password = "secret_sauce";
		
		sauceDemoPage  sdp4  = new sauceDemoPage(driver);
		 
		sdp4.getUserName().sendKeys(UserName4);
		sdp4.getPassWord().sendKeys(Password);
	    sdp4.getLogin().click();
	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();	
	
		
		

	}

}

package sauceDemoLoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.sauceDemoPage;

public class sauceDemoLoingTest1 {

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
				
     sauceDemoPage  sdp1  = new sauceDemoPage(driver);
		
		sdp1.getUserName().sendKeys(UserName1);
		sdp1.getPassWord().sendKeys(Password);
	    sdp1.getLogin().click();
	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.quit();
	}}


		




		
	



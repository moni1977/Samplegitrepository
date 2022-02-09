package dataDriven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.sauceDemoPage;

public class SauceDamoData {
	WebDriver driver;
    sauceDemoPage sdp1;
    sauceDemoPage sdp2;
    sauceDemoPage sdp3;
    sauceDemoPage sdp4;
	@BeforeTest
	public void TestSetUp() {
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		 
		 
		driver.get("https://www.saucedemo.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);			
		String UserName1 = "standard_user";
		String UserName2 = "locked_out_user";
		String UserName3 = "problem_user";
		String UserName4 = "performance_glitch_user";
		String Password = "secret_sauce";

		
		 sdp1 = new sauceDemoPage(driver);
		 sdp2 = new sauceDemoPage(driver);
		 sdp3 = new sauceDemoPage(driver);
	     sdp4 = new sauceDemoPage(driver);
	}
@Parameters({"UserName","PassWord","expectedUrl"})
@Test(priority = 0)
	public void SaucedemoLogin1(String UserName,String PassWord, String expectedUrl) {
		sdp1.getUserName().sendKeys(UserName);
		sdp1.getPassWord().sendKeys(PassWord);
	    sdp1.getLogin().click();

	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl );	}

@Parameters({"UserName","PassWord","expectedUrl"})

@Test(priority = 1)
public void SaucedemoLogin2(String UserName,String PassWord, String expectedUrl) {
sauceDemoPage  sdp2  = new sauceDemoPage(driver);
	 driver.navigate().back();
		sdp2.getUserName().sendKeys(UserName);
		sdp2.getPassWord().sendKeys(PassWord);
	    sdp2.getLogin().click();
	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		String actualUrl   = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl );
	}
		
@Parameters({"UserName","PassWord","expectedUrl"})

@Test(priority = 2)	
public void SaucedemoLogin3(String UserName,String PassWord, String expectedUrl) {	
	driver.navigate().refresh();
	sdp3.getUserName().sendKeys(UserName);
	sdp3.getPassWord().sendKeys(PassWord);
    sdp3.getLogin().click();
   System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	
	String actualUrl  = driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl );
}	
	
@Parameters({"UserName","PassWord","expectedUrl"})

@Test(priority = 3)	
public void SaucedemoLogin4(String UserName,String PassWord, String expectedUrl) {	
	driver.navigate().back();
	sdp3.getUserName().sendKeys(UserName);
	sdp3.getPassWord().sendKeys(PassWord);
   sdp3.getLogin().click();
   System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	String actualUrl   = driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl );
}
	
		
	@AfterTest
	 public void endTest()	{
	 	driver.quit();
	 }}
	
	
	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	


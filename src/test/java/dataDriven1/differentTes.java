package dataDriven1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.sauceDemoPage;

public class differentTes {


	WebDriver driver;
    sauceDemoPage sdp1;
//    sauceDemoPage sdp2;
//    sauceDemoPage sdp3;
//    sauceDemoPage sdp4;
	@BeforeGroups
	public void TestSetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\TestLibery\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		driver.get("https://www.saucedemo.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);			
		String UserName1 = "standard_user";
		String UserName2 = "locked_out_user";
		String UserName3 = "problem_user";
		String UserName4 = "performance_glitch_user";
		String Password = "secret_sauce";

		
		 sdp1 = new sauceDemoPage(driver);
//		 sdp2 = new sauceDemoPage(driver);
//		 sdp3 = new sauceDemoPage(driver);
//	     sdp4 = new sauceDemoPage(driver);
	}

@Test(groups = {"regression","sanity"})
	public void SaucedemoLogin1() {
		sdp1.getUserName().sendKeys("standard_user");
		sdp1.getPassWord().sendKeys("secret_sauce");
	    sdp1.getLogin().click();

	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	
		
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl   = "https://www.saucedemo.com/inventory.html";
		AssertJUnit.assertEquals(expectedUrl,actualUrl );	}


@Test(groups = {"regression","smoke"})
public void SaucedemoLogin2() {
//sauceDemoPage  sdp2  = new sauceDemoPage(driver);
//	 driver.navigate().back();
		sdp1.getUserName().sendKeys("locked_out_user");
		sdp1.getPassWord().sendKeys("secret_sauce");
	    sdp1.getLogin().click();
	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl   = "https://www.saucedemo.com/";
		AssertJUnit.assertEquals(expectedUrl,actualUrl );
	}
		
	
//@Test(groups = { "somke","sanity"})	
//public void SaucedemoLogin3() {	
//	driver.navigate().refresh();
//	sdp3.getUserName().sendKeys("problem_user");
//	sdp3.getPassWord().sendKeys("secret_sauce");
//   sdp3.getLogin().click();
//   System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle());
//	
//	String expectedUrl = driver.getCurrentUrl();
//	String actualUrl   = "https://www.saucedemo.com/inventory.html";
//	AssertJUnit.assertEquals(expectedUrl,actualUrl );
//}	
//	
//
//@Test(groups = {"regression","somke"})	
//public void SaucedemoLogin4() {	
//	driver.navigate().back();
//	sdp3.getUserName().sendKeys("performance_glitch_user");
//	sdp3.getPassWord().sendKeys("secret_sauce");
//   sdp3.getLogin().click();
//   System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle());
//	
//	String expectedUrl = driver.getCurrentUrl();
//	String actualUrl   = "https://www.saucedemo.com/inventory.html";
//	AssertJUnit.assertEquals(expectedUrl,actualUrl );
//}
	
		
	@AfterTest
	 public void endTest()	{
	 	driver.quit();
	 }}
	
	
	

	
	
	
	
	

	
	
	
	
	
	


package TestApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.autoMationSinginPage;
import Pages.autoMationSingupPage;

public class AutoMationLogin {
	WebDriver driver;
	Select select;
	autoMationSinginPage  ast;
	autoMationSingupPage msp; 
	
@BeforeTest
public void TestSetUp() {
	System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	
	 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
	    ast = new autoMationSinginPage(driver);
		msp = new autoMationSingupPage(driver);  
	
}
@Test(priority = 1)
public void AutoMationSingiIn() {
	 ast.getCreateEmail().sendKeys("Moniislam77@gmail.com");
	 ast.getCreateAnAccount().click();
	  
	  String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		String actualUrl   = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl );
	}
	  
	  

	  @Test(priority = 2)
	  public void AutoMationSingUp() throws InterruptedException {	
		  Thread.sleep(2000);
		Select DOB  = new Select(msp.getdropdowenDOB());
	    Select DDM  = new Select(msp.getdropdowenMonth());
	    Select DDY = new  Select(msp.getdropdowenYear());
	    Select DDS = new  Select(msp.getState());
	    Select DDC  = new Select(msp.getCountryCode());
	    
	    msp.getSelectGender2().click();  
		msp.getFristName().sendKeys("Moni");
		msp.getLastName().sendKeys("Islam");
		msp.getEmailAddress().sendKeys("Moniislam77@gmail.com");
		msp.getPassWord().sendKeys("Mouny4532");
		msp.getdropdowenDOB().sendKeys("23");
        msp.getdropdowenMonth().sendKeys("April");
	    msp.getdropdowenYear().sendKeys("1877");
       
       

       msp.getNewsLetterCheekBox().click();
       msp.getSpecialOffers().click();
       msp.getCompany().sendKeys("This is my company");
       msp.getAddress1().sendKeys("1321 south dinwiddie");
       msp.getAddress2().sendKeys("4947 Marlboro Pike");
       msp.getCity().sendKeys("Arlington");
       msp.getState().sendKeys("Virginia");
       msp.getZipCode().sendKeys("22206");
       msp.getCountryCode().sendKeys("USA");
       msp.getOther().sendKeys("My home work");
       msp.getHomePhone().sendKeys("2028654312");
       msp.getMobilePhone().sendKeys("2029257945");
       msp.getAssingAddress().click(); 
       msp.getRegister().click();
      
      String expectedUrl = "http://automationpractice.com/index.php?controller=authentication";
		String actualUrl   = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl );
	}
	
	
@AfterTest
public void EndTest() {
	driver.close();
}}

	
	
	
	
	
	
	
	
	


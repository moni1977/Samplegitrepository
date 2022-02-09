package TestApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.autoMationSinginPage;

public class AutoMationSingUp {

	WebDriver driver;
	autoMationSinginPage  ast;
	@BeforeTest
	public void TestSetUp() {
System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		ast = new autoMationSinginPage(driver);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}	  
	@Test
	public void AutoMationSingIn() {
		ast.getEmailAddress().sendKeys("monowara87@gmail.com");
		ast.getPassWord().sendKeys("kjoiuuy8890");
		ast.getSingin().click();
		ast.getCreateEmail().sendKeys("monowara87@gmail.com");
		ast.getCreateAnAccount().click();
		
		 String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=authentication";
			Assert.assertEquals(expectedUrl,actualUrl );
		}
				
		@AfterTest
	public void EndTest() {
		driver.quit();
		}}	
	


	
	
	
	
	
	
	

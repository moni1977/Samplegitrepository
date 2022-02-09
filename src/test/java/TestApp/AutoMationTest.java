package TestApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AutoMationPage;

public class AutoMationTest {

	  WebDriver driver;
	  AutoMationPage amt;
		
	  @BeforeTest
		public void TestSetUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\TestLibery\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			amt = new AutoMationPage(driver); 
			driver.navigate().back();
		}	
		
		@Test
		public void AutoMation1() {
		amt.getSpecials().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
			driver.navigate();	
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=prices-drop";
			Assert.assertEquals(expectedUrl,actualUrl );
			
			
		}
		@Test
			public void AutoMation2() {	
			amt.getNewProducts().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=new-products";
			Assert.assertEquals(expectedUrl,actualUrl );
		}
			@Test
			public void AutoMation3() {
			amt.getBestSellers().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=best-sales";
			Assert.assertEquals(expectedUrl,actualUrl );
		}
			
			@Test
			public void AutoMation4() {	
			amt.getOurStores().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=stores";
			Assert.assertEquals(expectedUrl,actualUrl );
			}
			@Test
			public void AutoMation5() {	
			amt.getContactUs().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=contact";
			Assert.assertEquals(expectedUrl,actualUrl );
			
			}
			@Test
			public void AutoMation6() {
			amt.getTermsAndConditionsOfUse().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?id_cms=3&controller=cms";
			Assert.assertEquals(expectedUrl,actualUrl );
			
			}
			@Test
			public void AutoMation7() {
			amt.getAboutUs().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?id_cms=4&controller=cms";
			Assert.assertEquals(expectedUrl,actualUrl );
			
			}
			@Test
			public void AutoMation8() {	
			amt.getSitemap().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		    driver.navigate();
			
			
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl   = "http://automationpractice.com/index.php?controller=sitemap";
			Assert.assertEquals(expectedUrl,actualUrl );
			}
		
			
			
			@AfterTest
		public void endTest() {
		driver.quit();
			
		}}

	
	
	
	
	
	
	
	
	


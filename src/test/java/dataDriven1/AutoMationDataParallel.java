package dataDriven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.AutoMationPage;

public class AutoMationDataParallel {

	 WebDriver driver;
	  AutoMationPage amt;
		@BeforeTest
		public void TestSetUp() {
	System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			amt = new AutoMationPage(driver);
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  
		}	
		@Parameters({"abc","expectedUrl"})
		@Test
		public void AutoMation1(String Specials,String expectedUrl ) {
		amt.getSpecials().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
			driver.navigate();	
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
		}
			
		@Parameters({"NewProducts","expectedUrl"})
		@Test
			public void AutoMation2(String NewProducts, String expectedUrl) {	
			amt.getNewProducts().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
			
		}
			
		@Parameters({"BestSellers","expectedUrl"})
		@Test
			public void AutoMation3(String BestSellers, String expectedUrl) {
			amt.getBestSellers().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
		
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
		}
		@Parameters({"OurStores","expectedUrl"})
			@Test
			public void AutoMation4(String OurStores, String expectedUrl) {	
			amt.getOurStores().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
		
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
			}
		@Parameters({"ContactUs","expectedUrl"})
		
			@Test
			public void AutoMation5(String ContactUs, String expectedUrl) {	
			amt.getContactUs().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
		     String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
			
			}
		
		@Parameters({"TermsAndConditionsOfUse","expectedUrl"})
			@Test
			public void AutoMation6(String TermsAndConditionsOfUse, String expectedUrl) {
			amt.getTermsAndConditionsOfUse().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
			
			}
		
		@Parameters({"AboutUs","expectedUrl"})
			@Test
			public void AutoMation7(String AboutUs, String expectedUrl) {
			amt.getAboutUs().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate();
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
			
		}		
		
		@Parameters({"Sitemap","expectedUrl"})
			@Test
			public void AutoMation8(String Sitemap, String expectedUrl) {	
			amt.getSitemap().click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		    driver.navigate();
			
			String actualUrl   = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl );
		}
		@AfterTest
		public void endTest() {
		driver.close();	
			
		}}

	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	


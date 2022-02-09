package TestApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.autoMationSinginPage;

public class sampleRun {
	
	
	WebDriver driver;
	autoMationSinginPage  ast;
	@BeforeTest
	public void TestSetUp() {
System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		ast = new autoMationSinginPage(driver);
		driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
	}
	
	@Test
	
	public void abcTest() {
		
		
	}

}

package homeWork4Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AutoMationPage;



public class autoMationTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		AutoMationPage amt = new AutoMationPage(driver);
		
		amt.getSpecials().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();	
		
		amt.getNewProducts().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		
		amt.getBestSellers().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		
		amt.getOurStores().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		
		amt.getContactUs().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		
		amt.getTermsAndConditionsOfUse().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		
		amt.getAboutUs().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		
		amt.getSitemap().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate();
		driver.quit();
	}}
		
		
	
	



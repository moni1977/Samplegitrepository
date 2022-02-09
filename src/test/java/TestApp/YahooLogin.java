package TestApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.YAHoUrTaPage;
import Pages.YSingUpPage;

public class YahooLogin{
	
	
	WebDriver driver;
	YSingUpPage yup;
	
	Select ddcountryCode;
	Select ddbirthmonth;
	
@BeforeTest	
	public void testSetup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moni\\eclipse-workspace\\TestLibery\\Driver\\chromedriver.exe");
	
	    driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/account/create");
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.manage().deleteAllCookies();
	yup = new YSingUpPage(driver);

	Select ddcountryCode = new Select(yup.getcCode());
	Select birthmonth = new Select (yup.getbirthmonth());
}
	
@Test()
public void YahooSingUp(){
	
	System.out.println("user successfully singup");
	yup.getFName().sendKeys("Moni");
	yup.getlastname().sendKeys("Islam");
	yup.getEmail().sendKeys("tazu.45@gmail.com");
	yup.getPassWord().sendKeys("mouyt4567");
	yup.getcCode().isSelected();
	yup.getPhoneNumber().sendKeys("2029675678");
	yup.getbirthmonth().sendKeys("March");
	yup.getEnterDate().sendKeys("23");
	yup.getEnterYear().sendKeys("1987");
	yup.getTypeGender().sendKeys("F");
	

	String expectedUrl = "https://login.yahoo.com/account/create";
	String actualUrl   = driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl );	
}

@AfterTest
public void endTest() {
	driver.quit();

}}
	
	
	
	
	



package dataDriven1;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.YSingUpPage;

public class YahooSingUpData {

	WebDriver driver;

	YSingUpPage yup;

	Select ddcountry;

	Select ddmonth;

	@BeforeTest

	public void TestSetup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\TestLibery\\Driver\\chromedriver.exe");

		driver =new ChromeDriver();

		driver.get("https://login.yahoo.com/account/create");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		yup = new YSingUpPage(driver);
       
		ddcountry = new Select(yup.getcCode());
		ddmonth = new Select(yup.getbirthmonth());

	}

	@Parameters({"FName","lastname","Email","PassWord","cCode","PhoneNumber","brithmonth","EnterDate", "EnterYear", "TypeGender" ,"expectedUrl"})

	@Test

	public void YahooSingUp(String FName, String lastname, String Email, String PassWord,String cCode,String PhoneNumber,String birthmonth,
			String EnterDate, String EnterYear, String TypeGender,String expectedUrl) {

		yup.getFName().sendKeys(FName);
		yup.getlastname().sendKeys(lastname);
		yup.getEmail().sendKeys(Email);
		yup.getPassWord().sendKeys(PassWord);
        yup.getcCode().sendKeys(cCode);
       
		yup.getPhoneNumber().sendKeys(PhoneNumber);
       
       yup.getbirthmonth().sendKeys(birthmonth);
		yup.getEnterDate().sendKeys(EnterDate);
		yup.getEnterYear().sendKeys(EnterYear);
		yup.getTypeGender().sendKeys(TypeGender);

		
		String actualUrl = "https://login.yahoo.com/account/create";
	Assert.assertEquals(expectedUrl, actualUrl);
	}

	@AfterTest
	public void EndTest() {
		driver.quit();

	}
}

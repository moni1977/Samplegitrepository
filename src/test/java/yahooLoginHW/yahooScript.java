package yahooLoginHW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yahooScript {
	 WebDriver driver;

     YahooSignUp yup;

    

     Select ddcountry;

     Select ddmonth;

    

     @BeforeTest

    

     public void TestSetup() {

    

System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\TestLibery\\Driver\\chromedriver.exe");
		

     driver = new ChromeDriver();          

    

     driver.get("https://login.yahoo.com/account/create");

     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

     driver.manage().deleteAllCookies();

    

     yup  = new YahooSignUp (driver);

     ddcountry = new Select (yup.getcCode());

     ddmonth = new Select (yup.getbirthMonth());

     }

    

    

    

     @Parameters ({"firstName","lastName","Email","PassWord","PhoneNumber","EnterDate","EnterYear","TypeGender"})

    

     @Test

     public void YahooSingUP(String firstName,String lastName,String Email,String PassWord,String PhoneNumber,String EnterDate,String EnterYear, String TypeGender) {

 
     yup.getfirstname().sendKeys(firstName);
     yup.getlastname().sendKeys(lastName);
     yup.getemail().sendKeys(Email);
     yup.getpassword().sendKeys(PassWord);
    
     ddcountry.selectByValue("US");
    
     yup.getmobile().sendKeys(PhoneNumber);
     ddmonth.selectByValue("10");
     yup.getbirthday().sendKeys(EnterDate);
     yup.getyear().sendKeys(EnterYear);
     yup.getgender().sendKeys(TypeGender);

}

	@AfterTest	
	public void endTest() {
		
		driver.quit();
	}}

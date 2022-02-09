package homeWork4Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.AutoMationPage;
import Pages.autoMationSinginPage;
import Pages.autoMationSingupPage;

public class autoMationSingupTest {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		autoMationSinginPage  ast  = new autoMationSinginPage(driver);
      ast.getCreateEmail().sendKeys("mjkioytrreh89@gmail.com");
	  ast.getCreateAnAccount().click();	
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	
	autoMationSingupPage msp = new autoMationSingupPage(driver);
	
		Select DOB  = new Select(msp.getdropdowenDOB());
	    Select DDM  = new Select(msp.getdropdowenMonth());
	    Select DDY = new  Select(msp.getdropdowenYear());
	    Select DDS = new  Select(msp.getState());
	    Select DDC  = new Select(msp.getCountryCode());
	    
	    msp.getSelectGender2().click();   
		msp.getFristName().sendKeys("Moni");
		msp.getLastName().sendKeys("Islam");
		msp.getEmailAddress().sendKeys("monowara87@gmail.com");
		msp.getPassWord().sendKeys("Mouny4532");
		DOB.selectByValue("12");
        DDM.selectByValue("4");
	    DDY.selectByValue("1988");
        
        

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
       driver.quit();
	}
}

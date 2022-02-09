package StepDefCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import Pages.YAHoUrTaPage;
import Pages.YSingUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefCucu1 {
WebDriver driver;
YSingUpPage yup;
YAHoUrTaPage ytp;
Select ddcountry;
Select ddbirthmonth;


@Given("^user is login page$")
public void user_is_login_page_page_page() throws Throwable {

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moni\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		    
		driver.get("https://login.yahoo.com/account/create");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
		yup = new YSingUpPage(driver);
        ytp = new YAHoUrTaPage(driver);
		Select ddcountry= new Select(yup.getcCode());
      Select ddbirthmonth = new Select(yup.getbirthmonth());
}

@When("^user  enter first name$")
public void user_enter_first_name() throws Throwable {
  yup.getFName().sendKeys("Moni");

}

@When("^user  enter last name$")
public void user_enter_last_name() throws Throwable {

yup.getlastname().sendKeys("Islam");
}

@When("^user enter email address$")
public void user_enter_email_address() throws Throwable {
yup.getEmail().sendKeys("monotrye77");

}

@When("^user enter password$")
public void user_enter_password() throws Throwable {
yup.getPassWord().sendKeys("njkjjhbp678755");

}


	@When("^user select country code$")
	public void user_select_country_code() throws Throwable {	
    yup.getcCode().sendKeys("Autralia");
}

@When("^user enter phone number$")
public void user_enter_phone_number() throws Throwable {
yup.getPhoneNumber().sendKeys("01017654909");

}

@When("^user click date of birthmonth$")
public void user_click_date_of_birthmonth() throws Throwable {
	yup.getbirthmonth().sendKeys("April");
}

@When("^user enter date$")
public void user_enter_date() throws Throwable {
yup.getEnterDate().sendKeys("12");

}

@When("^user enter year$")
public void user_enter_year() throws Throwable {
yup.getEnterYear().sendKeys("2008");

    
}

@When("^user enter gender$")
public void user_enter_gender() throws Throwable {
yup.getTypeGender().sendKeys("F");
}	

@Then("^user should able fillup singup page$")
public void user_should_able_fillup_singup_page() throws Throwable {
	String CurrentUrl = driver.getCurrentUrl();
	//String expectedUrl =  expectedUrl;
	//Assert.assertEquals(Url,CurrentUrl);
driver.quit();
}
//@AfterTest
//public void EndTest(){
	
	//driver.quit();
}














	
	
	
	
	
	
	
	


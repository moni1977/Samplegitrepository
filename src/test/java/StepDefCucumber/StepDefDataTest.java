package StepDefCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.YAHoUrTaPage;
import Pages.YSingUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefDataTest {
WebDriver driver;
YSingUpPage yup;
Select ddcountry;
Select ddbirthmonth;

@Given("^user is on click login page$")
public void user_is_on_click_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moni\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	    
	driver.get("https://login.yahoo.com/account/create");
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.manage().deleteAllCookies();
	yup = new YSingUpPage(driver);
	Select ddcountry= new Select(yup.getcCode());
  Select ddbirthmonth = new Select(yup.getbirthmonth());

}

@When("^user  is enters firstname\"([^\"]*)\"$")
public void user_is_enters_firstname(String firstname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
yup.getFName().sendKeys(firstname);

}

@When("^user is enters lastname\"([^\"]*)\"$")
public void user_is_enters_lastname(String lastname) throws Throwable {
yup.getlastname().sendKeys(lastname);

}

@When("^user is enters emailaddress\"([^\"]*)\"$")
public void user_is_enters_emailaddress(String emailaddress) throws Throwable {
yup.getEmail().sendKeys(emailaddress);

}

@When("^user is enters password\"([^\"]*)\"$")
public void user_is_enters_password(String password) throws Throwable {
yup.getPassWord().sendKeys(password);

}

@When("^user select country code\"([^\"]*)\"$")
public void user_select_country_code(String countrycode) throws Throwable {

yup.getcCode().sendKeys(countrycode);
}

@When("^user enter phone number\"([^\"]*)\"$")
public void user_enter_phone_number(String phonenumber) throws Throwable {
yup.getPhoneNumber().sendKeys(phonenumber);

}

@When("^user click date of birthmonth\"([^\"]*)\"$")
public void user_click_date_of_birthmonth(String birthmonth) throws Throwable {
yup.getbirthmonth().sendKeys(birthmonth);

}

@When("^user enter date\"([^\"]*)\"$")
public void user_enter_date(String date) throws Throwable {
yup.getEnterDate().sendKeys(date);

}

@When("^user enter year\"([^\"]*)\"$")
public void user_enter_year(String year) throws Throwable {

yup.getEnterYear().sendKeys(year);
}

@When("^user enter gender\"([^\"]*)\"$")
public void user_enter_gender(String gender) throws Throwable {
yup.getTypeGender().sendKeys(gender);

}



@Then("^user should able based on \"([^\"]*)\"$")
public void user_should_able_based_on(String expectedUrl) throws Throwable {
String CurrentUrl = driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,CurrentUrl);
driver.quit();
	
}}

package StepDefCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.sauceDemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SauceDamoDataStepDef {

	WebDriver driver;
	sauceDemoPage sdp1;
@Given("^User is a demo singup page$")
public void user_is_a_demo_singup_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
    driver = new ChromeDriver(); 
	driver.get("https://www.saucedemo.com");	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	 sdp1 = new sauceDemoPage(driver);
}
@When("^user enter valid username\"([^\"]*)\"$")
public void user_enter_valid_username(String username) throws Throwable {
sdp1.getUserName().sendKeys(username);

}

@When("^user enter vaild password \"([^\"]*)\"$")
public void user_enter_vaild_password(String password) throws Throwable {
sdp1.getPassWord().sendKeys(password);
}

@When("^user is able to login button$")
public void user_is_able_to_login_button() throws Throwable {
sdp1.getLogin().click();

}

@Then("^user should be able to login based \"([^\"]*)\"$")
public void user_should_be_able_to_login_based(String expectedUrl) throws Throwable {
	String CurrentUrl = driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,CurrentUrl);
driver.quit();
}}
//@After 
 // public void endTest() {
	//driver.quit();
	

   
     
     
     
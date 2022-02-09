package StepDefCucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.sauceDemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SauceDemoStepDef {
	WebDriver driver;
    sauceDemoPage sdp1;
    sauceDemoPage sdp2;
    sauceDemoPage sdp3;
    sauceDemoPage sdp4;
    


@Given("^User is a vaild home page$")
public void user_is_a_vaild_home_page() throws Throwable {


			System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
		    driver = new ChromeDriver(); 
			driver.get("https://www.saucedemo.com");
			
			 sdp1 = new sauceDemoPage(driver);
			 sdp2 = new sauceDemoPage(driver);
			 sdp3 = new sauceDemoPage(driver);
		     sdp4 = new sauceDemoPage(driver);
   }
@When("^user enter valid username standard_user$")
public void user_enter_valid_username_standard_user() throws Throwable {   
sdp1.getUserName().sendKeys("standard_user");
}
@When("^user enter vaild password secret_sauce$")
public void user_enter_vaild_password_secret_sauce() throws Throwable {
sdp1.getPassWord().sendKeys("secret_sauce");
}
@When("^user is click login button$")
public void user_is_click_login_button() throws Throwable {
 sdp1.getLogin().click();
}
@Then("^user abel read the title and URL of the page$")
public void user_abel_read_the_title_and_URL_of_the_page() throws Throwable {
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
}
@When("^user enter valid username locked_out_user$")
public void user_enter_valid_username_locked_out_user() throws Throwable {
	driver.navigate().back();
	sdp2.getUserName().sendKeys("locked_out_user");
}
@When("^user put a password$")
public void user_put_a_password() throws Throwable {
sdp2.getPassWord().sendKeys("secret_sauce");
}
@When("^user should click on login button$")
public void user_should_click_on_login_button() throws Throwable {
sdp2.getLogin().click();
}
@Then("^user can read the title and URL onthe page$")
public void user_can_read_the_title_and_URL_onthe_page() throws Throwable {
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
@When("^user enter valid username problem_user$")
public void user_enter_valid_username_problem_user() throws Throwable {
    driver.navigate().refresh();
	sdp3.getUserName().sendKeys("problem_user");
}

@When("^user enter password secret_sauce$")
public void user_enter_password_secret_sauce() throws Throwable {
	sdp3.getPassWord().sendKeys("secret_sauce");
}
@When("^user click on the login button$")
public void user_click_on_the_login_button() throws Throwable {
	sdp3.getLogin().click();
}
@Then("^user read the title and URL of the page$")
public void user_read_the_title_and_URL_of_the_page() throws Throwable {
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
@When("^user enter valid username performance_glitch_user$")
public void user_enter_valid_username_performance_glitch_user() throws Throwable {
	driver.navigate().refresh();
    driver.navigate().back();
	sdp4.getUserName().sendKeys("performance_glitch_user");
}

@When("^user write valid password secret_sauce$")
public void user_write_valid_password_secret_sauce() throws Throwable {
	sdp4.getPassWord().sendKeys("secret_sauce");
}

@When("^user should  click on the login$")
public void user_should_click_on_the_login() throws Throwable {
	sdp4.getLogin().click();
}

@Then("^user get the title and URL on the page$")
public void user_get_the_title_and_URL_on_the_page() throws Throwable {
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
  driver.quit();
}}

	






	
	


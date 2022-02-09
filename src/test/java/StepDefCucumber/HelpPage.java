package StepDefCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.YAHoUrTaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpPage {
	WebDriver driver;
	YAHoUrTaPage ytp;
	
	
	@Given("^User is in create login page$")
	public void user_is_in_create_login_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moni\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/account/create");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies(); 
	 ytp  = new YAHoUrTaPage(driver);
	}

	@When("^user is click on help page$")
	public void user_is_click_on_help_page() throws Throwable {
		//WebElement Help = driver.findElement(By.xpath("//*[@id=\"login-body\"]/div[1]/span[2]/a"));
		ytp.getHelpLink().click();
		
		

	}

	@When("^user  is validate  display under Browese BY TOPIc$")
	public void user_is_validate_display_under_Browese_BY_TOPIc() throws Throwable {
		
		
		System.out.println(ytp.getBBT().isDisplayed());
		System.out.println(ytp.getBBT().getText());
		
}
	@Then("^user is able to read the text$")
	public void user_is_able_to_read_the_text() throws Throwable {
	}	
	
		//System.out.println(ytp.getBBT().getText());
		
	

	@Then("^user  is validate  display Passwordand sing in$")
	public void user_is_validate_display_Passwordand_sing_in() throws Throwable {
    System .out.println(ytp.getPassWordAndSingin().isDisplayed());
    System.out.println(ytp.getPassWordAndSingin().getText());
	}

	@Then("^user  is validate  display Account key$")
	public void user_is_validate_display_Account_key() throws Throwable {
		 System .out.println(ytp.getAccountKey().isDisplayed());
		    System.out.println(ytp.getAccountKey().getText());

	}

	@Then("^user  is validate  display Account security$")
	public void user_is_validate_display_Account_security() throws Throwable {
		 System .out.println(ytp.getAccountSecurity().isDisplayed());
		    System.out.println(ytp.getAccountSecurity().getText());

	}

	@Then("^user  is validate  display Create or delete account$")
	public void user_is_validate_display_Create_or_delete_account() throws Throwable {

		 System .out.println(ytp.getCreateOrDeleteAccount().isDisplayed());
		    System.out.println(ytp.getCreateOrDeleteAccount().getText());
	}

	@Then("^user  is validate  display Manage account setting$")
	public void user_is_validate_display_Manage_account_setting() throws Throwable {
		 System .out.println(ytp.getManageAccountSetting().isDisplayed());
		    System.out.println(ytp.getPassWordAndSingin().getText());
	}

	@Then("^user  is validate  display Accessibility$")
	public void user_is_validate_display_Accessibility() throws Throwable {
		 System .out.println(ytp.getAccessibility().isDisplayed());
		    System.out.println(ytp.getAccessibility().getText());
	}

	@Then("^user  is validate  display Yahoo policy$")
	public void user_is_validate_display_Yahoo_policy() throws Throwable {
		 System .out.println(ytp.getYahooPolicy().isDisplayed());
		    System.out.println(ytp.getYahooPolicy().getText());
		driver.quit();

	}}



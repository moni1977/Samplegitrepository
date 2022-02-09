package yahooLoginHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YahooSignUp {
	
	 WebDriver driver;

     public YahooSignUp (WebDriver driver) {

     this.driver = driver;

     }

    

     Select Select;

     public YahooSignUp (Select Select) {

           this.Select = Select;

           }

    

     public WebElement getfirstname() {

           WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));

           return firstname;

     }

    

     public WebElement getlastname() {

           WebElement lastname = driver.findElement(By.id("usernamereg-lastName"));

           return lastname;

     }

    

     public WebElement getemail() {

           WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));

           return email;

     }

    

     public WebElement getpassword() {

           WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));

           return password;

     }

    

     public WebElement getcCode() {

           WebElement countryCode = driver.findElement(By.xpath("//*[@name=\"shortCountryCode\"]"));

           Select ddcountryCode = new Select (countryCode);

           return countryCode;

     }

    

     public WebElement getmobile() {

           WebElement mobile = driver.findElement(By.xpath("//input[@id=\"usernamereg-phone\"]"));

           return mobile;

     }

    

     public WebElement getbirthMonth() {

           WebElement birthMonth = driver.findElement(By.xpath("//select[@id=\"usernamereg-month\"]"));

           Select ddbirthMonth = new Select (birthMonth);

           return birthMonth;

     }

     public WebElement getbirthday() {

           WebElement day = driver.findElement(By.xpath("//input[@id=\"usernamereg-day\"]"));

           return day;

     }

    

     public WebElement getyear() {

           WebElement year = driver.findElement(By.xpath("//input[@id=\"usernamereg-year\"]"));

           return year;

     }

    

     public WebElement getgender() {

           WebElement gender = driver.findElement(By.xpath("//input[@id=\"usernamereg-freeformGender\"]"));

           return gender;

     }

    

     public WebElement getContinueButton() {

           WebElement continueButton = driver.findElement(By.id("reg-submit-button"));

           return continueButton;

     }

}

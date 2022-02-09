package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YSingUpPage {
	
	WebDriver driver;
	
	public YSingUpPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
		
	Select Select;

	       public  YSingUpPage(Select select){

	             this.Select = select;

	             }
	
	
	       public WebElement getFName() {

	           WebElement FName = driver.findElement(By.name("firstName"));

	           return FName;

	     }

	public WebElement getlastname(){	
		WebElement lastname = driver.findElement(By.name("lastName"));
		return lastname;
	}
	public WebElement getEmail(){	

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		return Email;
	}

	public WebElement getPassWord(){	
		WebElement PassWord = driver.findElement(By.name("password"));
   return PassWord;
	}	

	

	  public WebElement getcCode() {

          WebElement countryCode = driver.findElement(By.name("shortCountryCode"));

         Select ddcountryCode = new Select (countryCode);

          return countryCode;


	}

	public WebElement getPhoneNumber(){	
		WebElement PhoneNumber = driver.findElement(By.name("phone"));		
		return PhoneNumber;
	}

	public WebElement getbirthmonth() {

        WebElement birthmonth = driver.findElement(By.name("mm"));

        Select ddbirthmonth = new Select (birthmonth);

        return birthmonth;
	}


	public WebElement getEnterDate(){	
		WebElement EnterDate = driver.findElement(By.name("dd"));		
		return EnterDate;
	}

	public WebElement getEnterYear(){	
		WebElement EnterYear = driver.findElement(By.name("yyyy"));		
		return EnterYear;
	}
	public WebElement getTypeGender() {
	
	WebElement TypeGender = driver.findElement(By.id("usernamereg-freeformGender"));
	return TypeGender;
	}

}



	
	



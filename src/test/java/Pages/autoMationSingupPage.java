package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.commands.SelectOption;

public class autoMationSingupPage {
	
	WebDriver driver;
	
	public autoMationSingupPage(WebDriver driver) {
		
		this.driver =driver;
	}	
	
	 Select  select;
	public autoMationSingupPage( Select select) {
	this.select = select;
	}
	
  public WebElement getSelectGender2() {
	WebElement  SelectGender2 = driver.findElement(By.id("id_gender2"));
	return  SelectGender2;
	 
 }
 public WebElement getFristName() {
		WebElement  FristName = driver.findElement(By.id("customer_firstname"));
		return  FristName;
 }		
 public WebElement getLastName() {
		WebElement  LastName= driver.findElement(By.id("customer_lastname"));
		return  LastName;		
 }		
 
 public WebElement getEmailAddress() {
		WebElement  EmailAddress = driver.findElement(By.id("email"));
		return  EmailAddress;
 }	
 public WebElement getPassWord() {
		WebElement  PassWord = driver.findElement(By.id("passwd"));
		return  PassWord;	
 }
    
	public WebElement getdropdowenDOB() {
   WebElement dropdowenDOB = driver.findElement(By.name("days"));
   Select DOB = new Select(dropdowenDOB);
    return  dropdowenDOB;
    }
 
    public WebElement getdropdowenMonth() {
    	   WebElement dropdowenMonth = driver.findElement(By.name("months")); 
    	   Select Month =  new Select ( dropdowenMonth);
    	  return  dropdowenMonth;
    	    }
    public WebElement getdropdowenYear() {
    	   WebElement dropdowenYear = driver.findElement(By.name("years"));
    	   Select Year  =new Select (dropdowenYear);
    	    return  dropdowenYear;
    	    }
 
    public WebElement getNewsLetterCheekBox() {
    	   WebElement  NewsLetterCheekBox= driver.findElement(By.id("newsletter"));
    	    return  NewsLetterCheekBox;
    	    }
 
    public WebElement getSpecialOffers() {
    	   WebElement SpecialOffers = driver.findElement(By.name("optin"));
    	    return  SpecialOffers;
    	    }
 
    public WebElement getFirstName() {
    	   WebElement FirstName = driver.findElement(By.id("firstname"));
    	    return  FirstName;
    	    }
 
    public WebElement geLastName() {
 	   WebElement LastName = driver.findElement(By.id("lastname"));
 	    return  LastName;
 	    }
 
    public WebElement getCompany() {
  	   WebElement Company = driver.findElement(By.id("company"));
	    return  Company;
	    }
    
     public	 WebElement getAddress1() { 
     WebElement Address1 = driver.findElement(By.id("address1"));
 	    return  Address1;
 	    }
    public WebElement getAddress2() {
  	   WebElement Address2 = driver.findElement(By.id("address2"));
  	    return  Address2;
  	    }
    public WebElement getCity() {
  	   WebElement City= driver.findElement(By.id("city"));
  	    return  City;
  	    }  
    public WebElement getState() {
  	   WebElement ddState = driver.findElement(By.name("id_state"));
  	   Select ddct = new Select(ddState);
  	    return  ddState;
  	    }
    
    public WebElement getZipCode() {
  	   WebElement ZipCode = driver.findElement(By.id("postcode"));
  	    return  ZipCode;
  	    }
    
    public WebElement getCountryCode() {
    WebElement ddCountryCode = driver.findElement(By.name("id_country"));
    Select ddct = new Select(ddCountryCode);
  	    return  ddCountryCode;
    }
    
    public WebElement getOther() {
   	   WebElement Other = driver.findElement(By.id("other"));
   	    return  Other;
   	    } 
    public WebElement getHomePhone() {
   	   WebElement HomePhone = driver.findElement(By.id("phone"));
   	    return  HomePhone;
   	    } 
    
    public WebElement getMobilePhone() {
   	   WebElement MobilePhone= driver.findElement(By.id("phone_mobile"));
   	    return  MobilePhone ;
   	    }
    
    public WebElement getAssingAddress() {
   	   WebElement AssingAddress = driver.findElement(By.id("alias"));
   	    return  AssingAddress;
   	    }
    public WebElement getRegister() {
    	   WebElement Register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
    	    return  Register;
    
    }} 
    
    
    

    
    
    
    
    
    
    

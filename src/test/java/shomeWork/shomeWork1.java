package shomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shomeWork1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\OneDrive\\Desktop\\WorkSpece\\seleniumCode\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://login.yahoo.com/account/create");
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
		WebElement enterNumber = driver.findElement(By.name("phone"));
		WebElement brithmonth = driver.findElement(By.name("mm"));
		WebElement enterdate = driver.findElement(By.name("dd"));
		WebElement enterday = driver.findElement(By.name("dd"));
		WebElement enteryear = driver.findElement(By.name("yyyy"));
	    WebElement typeGender = driver.findElement(By.id("usernamereg-freeformGender"));
	    
	    WebElement buttonText = driver.findElement(By.xpath("//*[@id=\"regform\"]/p[1]"));
		WebElement buttontext = driver.findElement(By.id("reg-submit-button"));
		WebElement Button= driver.findElement(By.xpath("//*[@id=\"regform\"]/p[2]"));
		 
		Select cc = new Select(countryCode);
		Select bm = new Select (brithmonth);
		cc.selectByIndex(6);
		bm.selectByIndex(4);
		firstName.sendKeys("Moni");
		lastName.sendKeys("islam");
		email.sendKeys("mohwayt99");
		password.sendKeys("isla3425");
		enterNumber.sendKeys("2028897623");
		enterday.sendKeys("23");
        enteryear.sendKeys("1978");
		typeGender.sendKeys("M");
	   String button = buttontext.getText();
	   System.out.println("CONTINUE");
		
		String rbutton = buttontext.getText();
		System.out.println("By clicking Continue,you agree to the terms and Privacy Policy");
		
		Button.getText();
		System.out.println("already have an account?Sing in");
		driver.quit();
		
	}		
}
		
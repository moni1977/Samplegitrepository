package shomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shomeWork2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Moni\\OneDrive\\Desktop\\eclipse-workspace\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://login.yahoo.com/account/create");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement helplink = driver.findElement(By.linkText("Help"));
		helplink.click();

    
		String helpurl;
		helpurl = driver.getCurrentUrl();
		System.out.println(helpurl);
		String helptitle;
		helptitle = driver.getTitle();
		System.out.println(helptitle);
		
		WebElement bbt = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[2]/a"));
       boolean BrowseBYTOPIC = bbt.isDisplayed();
       System.out.println(BrowseBYTOPIC);
       String bbttext =  bbt.getText();
       System.out.println(bbttext);
       driver.quit();
	}}


	
       
       
 


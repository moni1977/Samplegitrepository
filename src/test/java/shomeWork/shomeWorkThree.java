package shomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shomeWorkThree {

	public static void main(String[] args) {
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moni\\OneDrive\\Desktop\\eclipse-workspace\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
        driver.navigate().back();
        WebElement userName1 = driver.findElement(By.id("user-name"));
		WebElement password1 = driver.findElement(By.name("password"));
		WebElement login1= driver.findElement(By.id("login-button"));
		
		
		userName1.sendKeys("locked_out_user");
		password1.sendKeys("secret_sauce");
		login1.click();
		userName1.clear();
		password1.clear();
		
		
		userName1.sendKeys("problem_user");
		password1.sendKeys("secret_sauce");
		login1.click();
		userName1.clear();
		password1.clear();
		
		
		userName1.sendKeys("performance_glitch_user");
		password1.sendKeys("secret_sauce");
		login1.click();
		userName1.clear();
		password1.clear();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());


		
		
		
		
		
		
		
		
		
		
		
		
		
}}
package homeWork4Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.autoMationSinginPage;

public class autoSinginTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
      driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		autoMationSinginPage  ast  = new autoMationSinginPage(driver);
		ast.getEmailAddress().sendKeys("monowara87@gmail.com");
		ast.getPassWord().sendKeys("kjoiuuy8890");
		ast.getSingin().click();
		ast.getCreateEmail().sendKeys("monowara87@gmail.com");
		ast.getCreateAnAccount().click();
	}}	
		
		
		
		

	



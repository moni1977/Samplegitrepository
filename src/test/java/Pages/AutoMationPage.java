package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoMationPage {
      WebDriver driver;
	
	public AutoMationPage(WebDriver driver) {
		
		this.driver  =driver;
	}
	public WebElement getSpecials() {
		WebElement Specials = driver.findElement(By.linkText("Specials"));	
		return Specials;
	}
	
	public WebElement getNewProducts() {
		WebElement NewProducts = driver.findElement(By.linkText("New products"));	
		return NewProducts;
	}
	public WebElement getBestSellers() {
		WebElement BestSellers = driver.findElement(By.linkText("Best sellers"));	
		return BestSellers;
	}
	public WebElement getOurStores() {
		WebElement OurStores = driver.findElement(By.linkText("Our stores"));	
		return OurStores;
	}
	public WebElement getContactUs() {
		WebElement ContactUs= driver.findElement(By.linkText("Contact us"));	
		return ContactUs;
	}
	public WebElement getTermsAndConditionsOfUse() {
		WebElement TermsAndConditionsOfUse = driver.findElement(By.linkText("Terms and conditions of use"));	
		return TermsAndConditionsOfUse;
	}	
	
	public WebElement getAboutUs() {
		WebElement AboutUs = driver.findElement(By.linkText("About us"));	
		return AboutUs;
	}
	public WebElement getSitemap() {
		WebElement Sitemap = driver.findElement(By.linkText("Sitemap"));	
		return Sitemap;
	}
}
	
	
	
	


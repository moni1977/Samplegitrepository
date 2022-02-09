package shomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shomeWork4 {

	private static final char[] TermsandconditionsofuseTitle = null;

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moni\\OneDrive\\Desktop\\WorkSpece\\seleniumCode\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get(" http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement specials = driver.findElement(By.linkText("Specials"));
	specials.click();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate();	
	
	WebElement newProducts = driver.findElement(By.linkText("New products"));
	newProducts.click();
	String newProductsURL = driver.getCurrentUrl();
	System.out.println(newProductsURL);
	String newProductTitle = driver.getTitle();
	System.out.println(newProductTitle);
	driver.navigate();	
	
	WebElement BestSellers= driver.findElement(By.linkText("Best sellers"));
	BestSellers.click();
	String BestSellersURL = driver.getCurrentUrl();
	System.out.println(BestSellersURL);
	String BestSellersTitle = driver.getTitle();
	System.out.println(BestSellersTitle);
	driver.navigate();	
	
		
	WebElement OurStores = driver.findElement(By.linkText("Our stores"));
	OurStores.click();
	String OurStoresURL = driver.getCurrentUrl();
	System.out.println(OurStoresURL);
	String OurStoresTitle = driver.getTitle();
	System.out.println(OurStoresTitle);
	driver.navigate();	
	
	WebElement Contactus = driver.findElement(By.linkText("Contact us"));
	Contactus.click();
	String ContactusURL = driver.getCurrentUrl();
	System.out.println(ContactusURL);
	String ContactusTitle = driver.getTitle();
	System.out.println(ContactusTitle);
	driver.navigate();	
	
	WebElement Termsandconditionsofuse = driver.findElement(By.linkText("Terms and conditions of use"));
	Termsandconditionsofuse.click();
	String TermsandconditionsofuseURL = driver.getCurrentUrl();
	System.out.println(TermsandconditionsofuseURL);
	String TermsandconditionsuseofTitle = driver.getTitle();
	System.out.println(Termsandconditionsofuse);
	driver.navigate();	
	
	WebElement Aboutus = driver.findElement(By.linkText("About us"));
	Aboutus.click();
	String AboutusURL = driver.getCurrentUrl();
	System.out.println(AboutusURL);
	String AboutusTitle = driver.getTitle();
	System.out.println(AboutusTitle);
	driver.navigate();	
	
	WebElement Sitemap = driver.findElement(By.linkText("Sitemap"));
	Sitemap.click();
	String SitemapURL = driver.getCurrentUrl();
	System.out.println(SitemapURL);
	String SitemapTitle = driver.getTitle();
	System.out.println(SitemapTitle);
	driver.navigate();	
    driver.close();

	
	}
}


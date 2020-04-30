package practicemarch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Forwdndbckwrd {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com/");
		 
		 driver.navigate().to("https:/amazon.com");
		 driver.navigate().to("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
	      //Thread.sleep(3000);
	
		driver.navigate().back();
	    //Thread.sleep(8000);

		driver.navigate().back();
	    //Thread.sleep(10000);
	
		driver.navigate().forward();
	   //Thread.sleep(9000);
	
   
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	    Thread.sleep(8000);
	
	    driver.findElement(By.xpath("//ul[contains(@class,'hmenu-visible')]//li[21]//a[1]")).click();
	    Thread.sleep(7000);
	
	    driver.findElement(By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[7]//a[1]")).click();
		
	//File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
	
    //FilesUtils.copyFile(src, new File("C:\\Users\hp\\MavenProject2020\\src\\test\\java\\com\\selenium\\amazon.jpg"));
    
    
    
    
	}
	
	
	
}

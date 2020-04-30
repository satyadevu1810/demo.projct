package practicemarch1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\webdrivers\\firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	
	    driver.get("https://www.google.com/search?sxsrf=ALeKk01k8Kt1-LMKl7xSwDptH9sgGEskUQ%3A1585835959288&source=hp&ei=t--FXrTWD4j39QO6ob6oCg&q=gmail&oq=gmail&gs_lcp=CgZwc3ktYWIQAzIECAAQQzIFCAAQgwEyBQgAEIMBMgQIABBDMgQIABBDMgIIADICCAAyBAgAEEMyAggAMgIIADoHCCMQ6gIQJzoECCMQJzoHCAAQgwEQQ1D5wAVYx8sFYNDSBWgDcAB4AIAB-AOIAcAJkgEJMC4zLjEuNS0xmAEAoAEBqgEHZ3dzLXdperABCQ&sclient=psy-ab&ved=0ahUKEwj0jZio88noAhWIe30KHbqQD6UQ4dUDCAY&uact=5");
		
    	driver.findElement(By.xpath("//a[@class='gb_4 gb_5 gb_ee gb_Xc']")).click();
			
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("satya.devu789@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
		
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("Jio8099916707@");
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
		
		
		
		
		
		
	}
	
}

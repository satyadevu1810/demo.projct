package practicemarch1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkhandle {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
	
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8099916707");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click(); 
		
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9866593279");
        
        //driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	
	
}

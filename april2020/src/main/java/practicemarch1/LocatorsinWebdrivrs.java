package practicemarch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsinWebdrivrs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		select.selectByVisibleText("31");
		
     Select select1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
   	  select1.selectByVisibleText("Jan");  
		
	        	Select select2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
                select2.selectByVisibleText("1996");
	
	}

}

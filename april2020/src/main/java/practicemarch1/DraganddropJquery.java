package practicemarch1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddropJquery { 
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
	
	driver.switchTo().frame(0);
	Actions action = new Actions(driver);
	
	action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
	.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
	.release()
	.build()
	.perform();
	
	
	 
}
	
}

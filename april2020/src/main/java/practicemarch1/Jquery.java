package practicemarch1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\satyadevu\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("https://jqueryui.com/");
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
	driver.findElement(By.xpath("//div[@class='g']//div//div[@class='rc']//h3[@class='LC20lb DKV0Md'][contains(text(),'jQuery UI')]")).click();
	Thread.sleep(3000);
//	driver.findElement(By.linkText("jQuery UI")).click();
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
	Thread.sleep(4000);
	driver.findElement(By.linkText("Web Sites")).click();
	
	
}
	
	
}

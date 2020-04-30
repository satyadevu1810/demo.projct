package practicemarch1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemoment {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.icicibank.com/");
	Thread.sleep(5000);
	//Alert alert = driver.switchTo().alert();
	
//	System.out.println(alert.getText());
	//alert.dismiss();
  // driver.findElement(By.xpath()).click();
   driver.findElement(By.xpath("//a[@style='text-decoration: none; color: #fff; background: #f5821f; padding: 5px 10px; margin-left: 87px; font-weight: bold;']")).click();
   Actions action = new Actions(driver);
	
   action.moveToElement(driver.findElement(By.linkText("Apply Online"))).build().perform();
	
	
	
	
}

}

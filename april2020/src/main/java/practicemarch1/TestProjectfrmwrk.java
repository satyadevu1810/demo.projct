package practicemarch1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProjectfrmwrk {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/search?q=testproject&oq=test&aqs=chrome.0.69i59j69i57j0l6.1713j0j8&sourceid=chrome&ie=UTF-8");
	
	driver.findElement(By.xpath("//h3[contains(text(),'TestProject: Free Test Automation For All')]")).click();
	
	driver.findElement(By.xpath("//a[@class='button button-orange button-sm button-material']")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	
	Thread.sleep(8000);     
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("satya.devu789@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jio8099916707@");
	
	driver.findElement(By.xpath("//input[@id='tp-sign-in']")).click();
	
	
}

}

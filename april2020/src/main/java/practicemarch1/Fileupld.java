package practicemarch1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupld {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");	
		
		driver.findElement(By.xpath("//input[@class='input-file']")).sendKeys("D:\\drivers\\demopic.jpg");
		//driver.findElement(By.xpath("//body[@class='item-view version-1-3-0 variant-indie_light collapsed-header']")).sendKeys("D:\\drivers\\demopic.jpg");
		
		
		
	}
	
	
}

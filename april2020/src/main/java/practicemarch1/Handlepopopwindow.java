package practicemarch1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepopopwindow {
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='black']")).click();
		Set<String>handler=driver.getWindowHandles();
	
		Iterator<String> it = handler.iterator();
		String parentWindowid=it.next();
		System.out.println("parentWindowid:"+ parentWindowid);
		String childWindowid = it.next(); 
		System.out.println("childWindowid:"+childWindowid);
		
		driver.switchTo().window("childWindowid");
		Thread.sleep(2000);
		System.out.println("child window popup title"+driver.getTitle());
		driver.close();
		 driver.switchTo().window(parentWindowid);
		 Thread.sleep(2000);
		 System.out.println("parentWindow title"+driver.getTitle());
		
		 
		
}
	
}
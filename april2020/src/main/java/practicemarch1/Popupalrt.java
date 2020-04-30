package practicemarch1;


import java.net.StandardSocketOptions;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupalrt {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	 driver.get("http://www.popuptest.com/goodpopups.html");
	 
	driver.findElement(By.xpath("//a[@class='black']")).click();
	Thread.sleep(4000);
	Set<String> handler = driver.getWindowHandles();
		
	Iterator<String> it = handler.iterator();
	String parentWindowId= it.next();
    System.out.println("parent window id:" + parentWindowId);
    String childWindowId = it.next();
    System.out.println("child WindowId:"+ childWindowId );
    driver.switchTo().window(childWindowId);
    Thread.sleep(4000);
    System.out.println("child window pop up title"+driver.getTitle());
    driver.close();
    
    driver.switchTo().window("parentWindowId");
    Thread.sleep(3000);
    System.out.println("parent window title"+driver.getTitle());
    
    
    
}
}
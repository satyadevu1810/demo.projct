package practicemarch1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExectn {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\satyadevu\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.com/");
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8341971775");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Nalanda");
	//driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	//driver.findElement(By.xpath("//div[@id='ariaAssertiveAlert']")).click();
	//driver.findElement(By.name("Log Out")).click();
	WebElement loginBtn =driver.findElement(By.xpath("//input[@value='Log In']"));
	flash(loginBtn, driver);
	
}
	
public static void flash(WebElement element,WebDriver driver){
JavascriptExecutor js = ((JavascriptExecutor)driver);
String bgcolor=element.getCssValue("backgroundcolor");
for(int i = 0; i < 100; i++){
	changeColor("rbg(0,200,0)",element,driver);
	changeColor(bgcolor,element,driver);
}
}
public static void changeColor(String color,WebElement element,WebDriver driver){
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	try{
		Thread.sleep(20);
	} catch (InterruptedException e){
	}		
}
}	
	





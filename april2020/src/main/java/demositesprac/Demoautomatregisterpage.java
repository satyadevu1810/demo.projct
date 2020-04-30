package demositesprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demoautomatregisterpage {
@Test
	public void registerpageTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SATYA");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("devu");
	driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("satyadevu,6-142, kothhapeta,chinnayagudem,westgodavari,andhrapradesh,india");
	driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("satya.devu789@gmail.com");
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8099916707");
	driver.findElement(By.name("radiooptions")).click();
	driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
	
	driver.findElement(By.xpath("//div[@id='msdd']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'English')]")).click(); //how to click more languages
	
	
	
	
	/*Select select = new Select (driver.findElement(By.xpath("//div[@id='msdd']")));
    select.selectByVisibleText("English");  */
	
	Select select = new Select (driver.findElement(By.id("Skills")));
	select.selectByVisibleText("Java");
	
/*	driver.findElement(By.id("countries")).click();
	driver.findElement(By.xpath("//option[contains(text(),'Turkey')]")).click();  */
	

	Select select1 = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
    select1.selectByVisibleText("Algeria");
    
    driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
    driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
    
   // Select select2=new Select(driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")));
    //select2.selectByVisibleText("India");
    Select select3 =new Select (driver.findElement(By.id("yearbox")));
    select3.selectByVisibleText("1996");
    Select select4 =new Select (driver.findElement(By.xpath("//select[@placeholder='Month']")));
    select4.selectByVisibleText("January");
	
    Select select5 =new Select (driver.findElement(By.id("daybox")));
    select5.selectByVisibleText("31");
    driver.findElement(By.id("firstpassword")).sendKeys("Jio8099916707");
    driver.findElement(By.id("secondpassword")).sendKeys("Jio8099916707");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("D:\\drivers\\demopic.jpeg");
    
	driver.findElement(By.id("submitbtn")).click();
	Thread.sleep(9000);
	driver.quit();
	}

}

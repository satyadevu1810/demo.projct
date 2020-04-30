package demositesprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class EMIcaliculatorchrm {
	
	@Test
	
	public void calculateLoanEMI() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    driver.get("https://emicalculator.net/");	
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    Actions actions =new Actions(driver);
    
    WebElement LoanSliderCircle =driver.findElement(By.xpath("//div[@id='loanamountslider']//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
    
    WebElement intrestLoanSliderCircle =driver.findElement(By.xpath("//div[@id='loaninterestslider']//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
    
    WebElement tenureLoanSliderCircle =driver.findElement(By.xpath("//div[@id='loantermslider']//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
    
   actions.dragAndDropBy(LoanSliderCircle, 80,0).build().perform(); 
   Thread.sleep(2000);
    
    actions.dragAndDropBy(intrestLoanSliderCircle, 88,0).build().perform();
    Thread.sleep(3000);
   
    actions.dragAndDropBy(tenureLoanSliderCircle, -110,0 ).build().perform();
    Thread.sleep(2000);
    
    WebElement LoanEMIElement=driver.findElement(By.xpath("//div[@id='emiamount']"));
    
    String LoanEMIText = LoanEMIElement.getText();
   
    Assert.assertEquals("93,539",LoanEMIText);
    Thread.sleep(6000);
    
    driver.quit();
    
	}

}




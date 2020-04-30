package com.tstng;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GogleTest {
 
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void GooglTitleTest(){
		String title = driver.getTitle();
	System.out.println(title);
	}
	@Test
	
	public void googlelogoTest(){
	throw new SkipException("skipping testcase");
		//boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}
	@Test
	public void linkTest(){
		boolean b = driver.findElement(By.linkText("GMail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown(){
   driver.quit();
		
	}	
	}
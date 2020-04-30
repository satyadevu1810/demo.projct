package com.tstng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navinautomationsgogl {
WebDriver driver;

@BeforeMethod
public void setup(){
	System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
}
@Test
public void GoogleTitleTe3st(){
	String title=driver.getTitle();
	System.out.println("title");
}

public void googlelogoTest(){
	throw new SkipException("skipping testcase");
	//boolean b= driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
}
@Test
public void tearDown(){
	driver.quit();
	
}


}

package com.tstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TstngBasics {
	
	@BeforeSuite //1
   public void setup(){
		System.out.println("setup system properties for chrome");
	}
	
	@BeforeClass //2
	public void launchBrowser(){ 
	System.out.println("launch chrome Browser");
	}
 
	@BeforeMethod //3
 public void enterURl(){
	 System.out.println("enter URl");
 }
	@BeforeTest //4
	public void login(){
		System.out.println("login method");
	}
	@Test //5
	public void googleTitleTest(){
		System.out.println("Google Title Test");
		
	}
	@AfterMethod //6
	public void logOut(){
		System.out.println("logout from app");
	}
	
	@AfterClass //7
	public void closeBrowser(){
		System.out.println("close Browser");
	}
	@AfterTest //8
	public void deleteAllCookies(){
		System.out.println("deleteAllCookies");
	}
	@AfterSuite //9
	public void generateTestReport(){
		System.out.println("generateTestReport");
	}
	
	
}

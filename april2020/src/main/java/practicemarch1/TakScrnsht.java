package practicemarch1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.mongodb.MapReduceCommand.OutputType;
import com.sun.jna.platform.FileUtils;

public class TakScrnsht {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");
/*		File scr =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File.utils.copyFile(scr,new File("\\Users\\hp\\Downloads\\MyAutoFrame\\src\\main\\java\\google.png"));
	*/	
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scr, new File("C:\\Users\\hp\\Downloads\\MyAutoFrame\\src\\main\\java\\screenshot.png"));
		
	}

}

package practicemarch1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readpropertiesfile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\hp\\workspace\\april2020\\src\\main\\java\\practicemarch1\\config.properties");
			
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age")); 
	    String url = prop.getProperty("URL");
		
	    System.out.println(url);
	    String browserName = prop.getProperty("browser"); 
	    System.out.println(browserName);
	    
	    if(browserName.equals("chrome")) { 
	    
	    System.setProperty("webdriver.chrome.driver", "D:\\satyadevu\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	    } else if(browserName.equals("FF")){
	     
	     
	    }
	}

}

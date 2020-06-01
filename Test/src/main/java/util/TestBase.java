package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/raja/Documents/CreativeTechnologyTechTest/Test/src/main/java/config/config.properties");
			prop.load(fis);	
		}catch (IOException e){
			e.getMessage();
		}
	}
	
	public static void initialization(){
		
		/*Specified the path for the Chrome browser, Launch the Chrome browser or FF browser
	    Maximize the window, Specified the page load timeout & implicit wait*/
		
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "//Users//raja//Downloads//chromedriver//");		
		driver = new ChromeDriver();																	
		System.err.println("User launched the chrome browser!!!");
		}
		else if (browserName.equalsIgnoreCase("FF")){
		System.setProperty("webdriver.gecko.driver", "//Users//raja//Downloads//geckodriver//");
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}

}

package Rajesh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    
	    
	   TakesScreenshot scnshot = (TakesScreenshot) driver;
	    
	   File sourcsFile = scnshot.getScreenshotAs(OutputType.FILE);
	   
	   File destinationfile = new File(".\\Snap\\first.png");
	    
	   FileHandler.copy(sourcsFile, destinationfile);
	   
	   
	   
	    
	    
	   
	}
	
	
}

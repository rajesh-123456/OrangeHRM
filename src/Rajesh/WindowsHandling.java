package Rajesh;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
    
		String parentWindow = driver.getWindowHandle();
		
		WebElement openHomePage = driver.findElement(By.id("home"));
		openHomePage.click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String newwindow : handles) {
		driver.switchTo().window(newwindow);
		}
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		WebElement openMultWinds = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openMultWinds.click();
		
		int noOffWindows = driver.getWindowHandles().size();
		System.out.println(noOffWindows);
		
		WebElement cloeWindow = driver.findElement(By.id("color"));
		cloeWindow.click();
		
		Set<String> newWindwHandle = driver.getWindowHandles();
		for (String allwindows : newWindwHandle) {
			if (!allwindows.equals(parentWindow)) {
				driver.switchTo().window(allwindows);
				driver.close();                               
				
			}
			
		}
	}
}
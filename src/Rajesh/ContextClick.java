package Rajesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement rightClick = driver.findElement(By.className("mTxt"));
		
		Actions builders = new Actions(driver);
		builders.contextClick(rightClick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
									.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
	
		
	}
}
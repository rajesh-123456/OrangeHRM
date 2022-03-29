package Rajesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingOne {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mobileClick = driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[2]"));
		
		Actions builders = new Actions(driver);
		
		builders.contextClick(mobileClick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	}
}
package Rajesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("usernameField"));
		username.sendKeys("Rajesh");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("1234");
		
		WebElement login = driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']"));
		login.click();
	}

}

package Rajesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement Simplealerts = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Simplealerts.click();	
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		WebElement OknotokAleart = driver.findElement(By.xpath("((//a[@class='analystic']))[2]"));
		OknotokAleart.click();
		Thread.sleep(2000);	
		WebElement Acpt = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Acpt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); 
		
		WebElement Promtaleart = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		Promtaleart.click();
		Thread.sleep(2000);
		WebElement Promtbox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		Promtbox.click();
		driver.switchTo().alert().sendKeys("higuys");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	}	

}

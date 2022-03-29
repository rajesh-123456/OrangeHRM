package Rajesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement SingleFrame = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		SingleFrame.click();
		
		driver.switchTo().frame(0);
		WebElement ValuePass = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		ValuePass.sendKeys("Rajesh");

		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement IframeClick = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		IframeClick.click();
		
		WebElement parantframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(parantframe);
		
		WebElement Childframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(Childframe);
		
	
		
		
		
	}

}

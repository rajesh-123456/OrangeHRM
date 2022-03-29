package Rajesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement job = driver.findElement(By.className("mTxt"));
		Actions builder = new Actions(driver);
		builder.moveToElement(job).perform();
		
		WebElement It = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/ul/li[1]/div/ul[1]/li[2]/a"));
		It.click();
		
		
		
	}
}
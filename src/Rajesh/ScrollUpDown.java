package Rajesh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jsf = (JavascriptExecutor) driver;
		
	//	jsf.executeScript("window.scroll(0,1000)");
		
	//	Thread.sleep(2000);
		
	//	jsf.executeScript("window.scrollTo(0.document.body.scrollHeight");   //for bottom
		
		WebElement scrl = driver.findElement(By.xpath("(//a[text()='See all offers'])[7]"));
		jsf.executeScript("arguments[0].scrollIntoView(true)", scrl);
	}
		
		
	}



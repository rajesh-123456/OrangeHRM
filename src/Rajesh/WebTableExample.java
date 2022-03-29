package Rajesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class WebTableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumProject\\\\Drivers\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		
		// find headers
		
		WebElement firstTable = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = firstTable.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);		
		}
		
	List<WebElement> allRows = firstTable.findElements(By.cssSelector("tbody tr"));
	int rowsize = allRows.size();
	System.out.println(rowsize);
	if (rowsize == 3) {
		System.out.println("pass");
	} else {System.out.println("fail");
	for (WebElement row : allRows) {
		List<WebElement> clum = row.findElements(By.tagName("td"));
		WebElement firstClum = clum.get(0);
		System.out.println(firstClum.getText());
		
	}

	}
	}
	
}

package Rajesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		List<WebElement> dayList2 = driver.findElements(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]//option"));
		for (int i = 0; i < dayList2.size(); i++) {
			System.out.println(dayList2.get(i).getText());
			if (dayList2.get(i).getText().equals("20")) {
				dayList2.get(i).click();
				break;
				
			}
		}
		
	}
}

package Rajesh;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

// Using Select class
		
		WebElement daylist = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]"));
		Select day = new Select(daylist);
		
	//	day.selectByIndex(15);     //using intex value
	//	day.selectByValue("08");   //using value
		day.selectByVisibleText("14");
		
		WebElement selectedDay = day.getFirstSelectedOption();
		System.out.println(selectedDay.getText());
		
		List<WebElement> allDays = day.getOptions();
		System.out.println(allDays.size());
		for (int i = 0; i<allDays.size(); i++) {
			System.out.println(allDays.get(i).getText());			
		}                                                                   
		Thread.sleep(3000);
		
		daylist.sendKeys("5");
		
// Using without select class
		
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



package Rajesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeleniumProject\\\\Drivers\\\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multipleDropDown = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select mltiple = new Select(multipleDropDown);
		
		mltiple.selectByIndex(1);
		mltiple.selectByIndex(2);

		
	}

}

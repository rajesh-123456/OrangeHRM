package Rajesh;

import java.io.File;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver; 
	 //-----------------------driver launch----------------------------- 
	 public static WebDriver launch(String browser) { 
	   
	  if(browser.equalsIgnoreCase("Chrome")) { 
	    
	   System.setProperty("webdriver.chrome.driver", 
	     "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe"); 
		  
		  
	   driver=new ChromeDriver(); 
	  } 
	  else if(browser.equalsIgnoreCase("Firefox")) { 
	   System.setProperty("webdriver.gecko.driver", 
	     "F:\\JAVA PROGRAMS\\Java_Selenium\\driver\\geckodriver.exe"); 
	   driver=new FirefoxDriver(); 
	  } 
	  else if (browser.equalsIgnoreCase("EdgeDriver")) { 
	   System.setProperty("webdriver.edge.driver", 
	     "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\IEDriverServer.exe"); 
	    
	  } 
	  else { 
	   System.out.println("Invalid browser"); 
	  }
	return driver; 
	  
	 } 
	 //------------------------get url------------------------------------ 
	 public static void urlget(String url) { 
	  driver.get(url);  
	 } 
	 //------------------------window maximize---------------------------- 
	 public static void max() { 
	  driver.manage().window().maximize(); 
	 } 
	 //------------------------window minimize---------------------------- 
		/*
		 * public static void min() { driver.manage().window().minimize(); }
		 */
	 //-------------------------get current url--------------------------- 
	 public static String currenUrl() { 
	  return driver.getCurrentUrl(); 
	   
	 } 
	 //------------------------get title---------------------------------- 
	 public static String gettitle() { 
	  return driver.getTitle(); 
	 } 
	 //------------------------navigate forward--------------------------- 
	 public static void forward() { 
	  driver.navigate().forward(); 
	 } 
	 //------------------------navigate backward-------------------------- 
	 public static void backward() { 
	  driver.navigate().back(); 
	 } 
	 //------------------------navigate refresh--------------------------- 
	 public static void refresh() { 
	  driver.navigate().refresh(); 
	 } 
	 //------------------------navigate to-------------------------------- 
	 public static void navto(String url) { 
	  driver.navigate().to(url); 
	 } 
	 //---------------------------quit------------------------------------ 
	 public static void qt() { 
	  driver.quit(); 
	 } 
	 //---------------------------close----------------------------------- 
	 public static void cls() { 
	  driver.close(); 
	 } 
	 //------------------------send keys---------------------------------- 
	 public static void sendvalues(WebElement element,String values) { 
	  element.sendKeys(values); 
	 } 
	 //------------------------click element------------------------------ 
	 public static void clickelement(WebElement elementTwo) { 
	  elementTwo.click(); 
	 } 
	 //------------------------clear element------------------------------ 
	 public static void clearelement(WebElement elementThree) { 
	  elementThree.clear(); 
	 } 
	 //---------------------------is multiple----------------------------- 
	 public static boolean multi(WebElement elementFour) { 
	  Select obj=new Select(elementFour); 
	  return obj.isMultiple(); 
	 } 
	 //--------------------------is selected------------------------------- 
	 public static boolean slct(WebElement elementFive) { 
	  return elementFive.isSelected(); 
	 } 
	 //--------------------------is enabled-------------------------------- 
	 public static boolean end(WebElement elementSix) { 
	  return elementSix.isEnabled(); 
	 } 
	 //--------------------------is displayed------------------------------ 
	 public static boolean dis(WebElement elementSeven) { 
	  return elementSeven.isDisplayed(); 
	 } 
	 //----------------------select options-------------------------------- 
	 public static void selection(WebElement elementNine,String option,String value) { 
	  Select sc=new Select(elementNine); 
	  if(option.equalsIgnoreCase("byIndex")) { 
	   int parse=Integer.parseInt(value); 
	   sc.selectByIndex(parse); 
	 
	  } 
	  else if(option.equalsIgnoreCase("byValue")){ 
	   sc.selectByValue(value); 
	  } 
	  else if(option.equalsIgnoreCase("")) { 
	   sc.deselectByVisibleText(value); 
	  } 
	  else { 
	   System.out.println("Invalid options"); 
	  } 
	 } 
	 //------------------------findelement xpath--------------------------- 
	 
	 public static WebElement find(String path) { 
	  return driver.findElement(By.xpath(path)); 
	 } 
	 //-----------------------Alerts--------------------------------------- 
	 public static void simpleAlert() { 
	  driver.switchTo().alert().accept(); 
	 } 
	 public static void confirmAlert(String ok,String cancel) { 
	  if(ok.equalsIgnoreCase("ok")) { 
	  driver.switchTo().alert().accept(); 
	 } 
	  else if(cancel.equalsIgnoreCase("cancel")) { 
	  driver.switchTo().alert().dismiss(); 
	     } 
	    } 
	 public static void promptAlert(String ok,String value,String cancel) { 
	  if(ok.equalsIgnoreCase("ok")){ 
	   driver.switchTo().alert().sendKeys(value); 
	   driver.switchTo().alert().accept(); 
	  } 
	  else if(cancel.equalsIgnoreCase("cancel")) { 
	   driver.switchTo().alert().sendKeys(value); 
	   driver.switchTo().alert().dismiss(); 
	  } 
	 } 
	 //-------------------------Screen shot-------------------------------- 
	 public static void srcst(String path) throws IOException { 
	  TakesScreenshot ts=(TakesScreenshot)driver; 
	  File src=ts.getScreenshotAs(OutputType.FILE); 
	  File des=new File(path); 
	  FileUtils.copyFile(src, des); 
	 } 
	 //--------------------------scroll down------------------------------- 
	 public static void pageDown(WebElement element) { 
	  JavascriptExecutor js=(JavascriptExecutor)driver; 
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
	 } 
	 public static void pageUp(WebElement element) { 
	  JavascriptExecutor js=(JavascriptExecutor)driver; 
	  js.executeScript("window.scrollTo(0,document.body.scrollTop)"); 
	 } 
	  
	 //------------------mouse over actions------------------------------------- 
	 public static void actionMethod(WebElement element) { 
	  Actions ac=new Actions(driver); 
	  ac.moveToElement(element).build().perform(); 
	 } 
	 public static void actionMethodTwo(WebElement element) { 
	  Actions as=new Actions(driver); 
	  as.contextClick(element).build().perform(); 
	 } 
	 //------------------Robot class--------------------------------------------- 
		/*
		 * public static void robot() throws AccessException { Robot r=new Robot();
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER); }
		 */
	 //-------------------Windows handles----------------------------------------- 
	 
	 public static void windowHandles() { 
	  Set<String> element=driver.getWindowHandles(); 
	  for(String st:element) { 
	   String title=driver.switchTo().window(st).getTitle(); 
	  } 
	 } 
	 //---------------------------Frames------------------------------------------- 
	 public static void frameMethod(String option,String value,WebElement element) { 
	  if(option.equalsIgnoreCase("byIndex")) { 
	   int index=Integer.parseInt(value); 
	   driver.switchTo().frame(index); 
	  } 
	  else if (option.equalsIgnoreCase("byElement")) { 
	   driver.switchTo().frame(element); 
	  } 
	  else if (option.equalsIgnoreCase("byvalue")) { 
	   driver.switchTo().frame(value); 
	  } 
	  else { 
	   System.out.println("Invalid framr selection"); 
	  } 
	 } 
	 
	} 
	   
	 


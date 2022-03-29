package Rajesh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class OrgangeHRM_Testing {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("txtUsername"));
		Username.sendKeys("Admin");
		
		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		
		WebElement Myinfo = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b"));
		Myinfo.click();
		
		WebElement PersonalDetails = driver.findElement(By.xpath("//a[text()='Personal Details']"));
		PersonalDetails.click();
		
		WebElement Edit = driver.findElement(By.id("btnSave"));
		Edit.click();
		

		WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
		firstName.sendKeys("Rajesh");		
		
		WebElement MiddleName = driver.findElement(By.id("personal_txtEmpMiddleName"));
		MiddleName.sendKeys("Kumar");
		
		WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
		lastName.sendKeys("R");
		
		WebElement empId = driver.findElement(By.id("personal_txtEmployeeId"));
		empId.sendKeys("EI007");
		
		WebElement driverNumber = driver.findElement(By.id("personal_txtLicenNo"));
		driverNumber.sendKeys("1234567");
		
		WebElement SSNNumber = driver.findElement(By.id("personal_txtNICNo"));
		SSNNumber.sendKeys("1234567");
		
		WebElement gender = driver.findElement(By.id("personal_optGender_1"));
		gender.click();
		
		WebElement Nationality = driver.findElement(By.id("personal_cmbNation"));
		Select country = new Select(Nationality);
		country.selectByIndex(20);
		
		WebElement nickName = driver.findElement(By.id("personal_txtEmpNickName"));
		nickName.sendKeys("fghjyiuoi");
		
		WebElement MilitaryService = driver.findElement(By.id("personal_txtMilitarySer"));
		MilitaryService.sendKeys("gun");
		
		WebElement ortherId = driver.findElement(By.id("personal_txtOtherID"));
		ortherId.sendKeys("12589");
		
		WebElement SINNumber = driver.findElement(By.id("personal_txtSINNo"));
		SINNumber.sendKeys("09876");
		
		WebElement MaritalStatus = driver.findElement(By.id("personal_cmbNation"));
		Select ty = new Select(MaritalStatus);
		ty.selectByIndex(1);
		
		WebElement dateOfBirth = driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]"));
		dateOfBirth.click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select yy = new Select(month);
		yy.selectByIndex(4);
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select kk = new Select(year);
		kk.selectByVisibleText("1995");
		WebElement day = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
		day.click();
		
		WebElement Smoker = driver.findElement(By.id("personal_chkSmokeFlag"));
		Smoker.click();
		
		WebElement Save = driver.findElement(By.id("btnSave"));
		Save.click();
				
		TakesScreenshot sd = (TakesScreenshot) driver;
		File screenshotAs = sd.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File(".\\Snap\\save.png");
		FileHandler.copy(screenshotAs, destinationfile);
		
		
	}

}

package com.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBook {
	public WebDriver driver;
	public DataFormatter df;//=new DataFormatter();
	public String url="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
	@BeforeTest
	
	public void LuanchApp() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("-incognito");
		ops.setBrowserVersion("116");
		driver=new ChromeDriver(ops);
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority = 0)
	public void click() {
		WebElement btn=driver.findElement(By.xpath("//a[.='Create new account']"));
		btn.click();
	}
	@Test(dataProvider ="fb",priority = 1)
	public void RegisterTest(String name, String lastname, String email, String password, String day, String month, String year) throws InterruptedException {
		WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
        
        WebElement birthdayDay = driver.findElement(By.name("birthday_day"));
        Select select=new Select(birthdayDay);
        select.selectByVisibleText(day);
        WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));
        Select m=new Select(birthdayMonth);
        m.selectByValue(month);
        WebElement birthdayYear = driver.findElement(By.name("birthday_year"));
        Select y=new Select(birthdayYear);
        y.selectByValue(year);
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));	
        
        firstName.clear();
        firstName.sendKeys(name);
        lastName.clear();
        lastName.sendKeys(lastname);
        mobileOrEmail.clear();
        mobileOrEmail.sendKeys(email);
        newPassword.clear();
        newPassword.sendKeys(password);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
       
        birthdayDay.sendKeys(day);
       
        birthdayMonth.sendKeys(month);
       
        birthdayYear.sendKeys(year);
        
        gender.click();
        
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@DataProvider(name="fb")
	public Object[][] getData() throws IOException {
		df=new DataFormatter();
		FileInputStream fis=new FileInputStream(url);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("FaceBook");
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object [][] data=new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell=row.getCell(j);
				df.formatCellValue(cell);
				data[i][j]=df.formatCellValue(cell);
			}
			wb.close();
		}
		return data;
	}
	@Test(dataProvider="fb")
	public void test(String name, String lastname, String email, String password, String day, String month, String year){
		System.out.println(name+" : "+lastname+" : "+email+" : "+password+" : "+day+" : "+month+" : "+year);
	}
}

package com.upload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadFiles {

	public static void main(String[] args) throws InterruptedException {
		String url="https://rahulshettyacademy.com/upload-download-test/index.html";
		String fileName="C:\\Users\\Ganesh\\Downloads\\download.xlsx";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		//Click for the download button
		WebElement download=driver.findElement(By.cssSelector("button[id='downloadButton']"));
		
	//	download.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		//edit excel sheet
		int col=getColumnNumber(fileName,"price");
		int row=getRowNumber(fileName,"Apple");
		updatedCell(fileName,row,col,"566");
		
		//Thread.sleep(10000);
		WebElement upLoad=driver.findElement(By.cssSelector("input[type='file']"));
		
		By toastLocator=By.cssSelector(".Toastify__toast-body div:nth-child(2");
		//By toastLocator=By.cssSelector(".Toastify_toast-body div div");
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		
		String toastText=driver.findElement(toastLocator).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully.",toastText);//Updated Excel Data Successfully.
		w.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		String productName="Mango";
		String priceColumn=driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		WebElement productPrice=driver.findElement(By.xpath("//div[text()='"+productName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']"));
		System.out.println(productPrice.getText());
		
		driver.quit();
	}

	private static int getRowNumber(String fileName, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void updatedCell(String fileName, int row, int col, String string) {
		// TODO Auto-generated method stub
		
	}

	private static int getColumnNumber(String fileName, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}

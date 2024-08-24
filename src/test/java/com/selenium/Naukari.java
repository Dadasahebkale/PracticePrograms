package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("-incognito");
		ops.setBrowserVersion("116");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.cssSelector("a[id='login_Layer']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("dadasahebkale@yahoo.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Ganesh@01");
		driver.findElement(By.cssSelector("button[class='btn-primary loginButton']")).click();
		driver.findElement(By.partialLinkText("profile")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(5000);
		WebElement upload=driver.findElement(By.xpath("//input[@type='file'][@id='attachCV']"));
		upload.sendKeys("D:\\Resume\\Oct\\Dadasaheb Kale_SQA.docx");
		System.out.println("Resume uploaded successfully....");
		driver.quit();
	}

}

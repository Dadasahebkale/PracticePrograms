package com.dktech;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FileDownLoaded {
@Test
	public void downloadTest() {
		FirefoxOptions ops=new FirefoxOptions();
		ops.setBrowserVersion("121.0.1");
		WebDriver driver=new FirefoxDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://get.jenkins.io/windows-stable/2.426.1/jenkins.msi");
		String downloadPath="C:\\Users\\Ganesh\\Downloads";
		String FileName="jenkins.msi";
		
		File file=new File(downloadPath,FileName);
		FluentWait<File> wait=new FluentWait<File>(file)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class).withMessage("File is not downloaded");
		
		try {
			boolean isDownloaded=wait.until(f ->f.exists()&& f.canRead());
			if(isDownloaded) {
				System.out.println("File is completed 100% downloaded");
			}
			
		} 
		catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("File is not downloaded");	
		}
		
				
	
	}
@AfterTest
	public void tearDown(WebDriver driver) {
		driver.quit();
	}
}

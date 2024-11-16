package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScreenShot {
	static WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}
	public static void getScreenShot() {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("src\\test\\resources\\screenShots\\snap.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void SearchGoogleTest() {
		driver.findElement(By.name("q")).sendKeys("Searching for screenshot method");
		getScreenShot();
		takeSnap();
		getscreenShot();
		getsShot();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	public static void takeSnap() {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("src\\test\\resources\\screenShots\\newScree.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getscreenShot(){
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try{
	    FileUtils.copyFile(src,new File("src//test//resources//screenShots//screenshot.png"));
	    }catch(IOException e){
	      e.printStackTrace();
	    }
	  }
	public static void getsShot(){
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try{
	    FileUtils.copyFile(src,new File("src//test//resources//screenShots//shot.png"));
	    }catch(IOException e){
	      e.printStackTrace();
	    }
	  }
}

package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotDemo {
	public static WebDriver driver;
	@BeforeTest
	public void lanuchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
	}
@Test
public void getScreenShotTest() throws IOException {
	String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new java.util.Date());
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String screenShotPath = System.getProperty("user.dir") +"\\src\\test\\resources\\screenShots\\screenshot_"+timeStamp+".png";
	
}
@AfterTest
public void tearDown() {
	driver.quit();
}
}

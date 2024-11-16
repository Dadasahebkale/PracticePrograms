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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotTest {
	static WebDriver driver;

	@BeforeTest
	public void setUp() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		ops.addArguments("--incognito");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	public static void takesSnap() {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("src\\test\\resources\\screenShots\\pic.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Test
	public void amazonSearch() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Phone");
		takesSnap();
	}
}

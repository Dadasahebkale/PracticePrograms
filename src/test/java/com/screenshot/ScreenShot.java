package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takesScreenShot();
	}
	public static void takesScreenShot() {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\CucumberLatest\\automation\\src\\test\\resources\\screenShots"
				+System.currentTimeMillis()+".png");
		try {
			Files.copy(scrFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

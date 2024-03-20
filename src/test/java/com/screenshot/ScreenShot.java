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
	public static void getScreenShot() {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File ff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	public static void ScreenShot1() throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C://ScreenShot"+System.currentTimeMillis()+".png");
		Files.copy(srcFile, dest);
	}
	public static void shot() throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest=new File("D://Screenshot"+System.currentTimeMillis()+".png");
		Files.copy(f,dest);
	}

}

package com.scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YouTubeScrllDown {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		try {
		String url="https://www.youtube.com/watch?v=exzJoArl0h0&list=PLFGoYjJG_fqr84PKCp88iPkQDWJSfzaqz";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		System.out.println("Scrolled down");
		}
		catch(Exception e) {
			System.out.println("Some Exception occuring......");
			e.printStackTrace();
		}
		finally {
			Thread.sleep(5000);
			//driver.quit();
		}
	}

}

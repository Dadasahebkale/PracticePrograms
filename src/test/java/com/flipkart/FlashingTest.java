package com.flipkart;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlashingTest {

	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("116");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> list=driver.findElements(By.xpath("//img[@alt='Image']"));
		System.out.println(list.size());
		Iterator<WebElement> itr=list.iterator();
		while(itr.hasNext()) {
			WebElement s=itr.next();
			System.out.println(s.getAttribute("src"));
		}
		mergeArr();
		printcharnum();

	}
	public static void printcharnum() {
		String s="Attitude";
		char ch[]=s.toLowerCase().toCharArray();
		for(char c: ch) {
		int temp=(int)c;
		int t=96;
		if(temp<=122 && temp>=97) {
			System.out.println(temp-t);
		}
		}
		
	}
	public static void mergeArr() {
		int [] a= {1,2,3};
		int [] b= {4,5,6};
		int [] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}
	public static void snap(WebDriver driver) throws IOException {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://screenshot"));
	}
}

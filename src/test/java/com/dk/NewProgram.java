package com.dk;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewProgram {
public static WebDriver driver;
	public static void main(String[] args) {
		String url="https://www.way2automation.com/way2auto_jquery/index.php";
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Dada");
		System.out.println("Dada");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123979879");
		System.out.println("797987979");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("Ganesh@1234");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']")).click();
		//div[@id='load_box']//input[@type='submit']
		driver.quit();
		System.out.println("Driver instance has been closed");
		
	}
}

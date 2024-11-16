package com.webtable;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewProgram {
public static WebDriver driver;
	public static void main(String[] args) {
		String url="https://www.way2automation.com/way2auto_jquery/index.php";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		//ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector('#alert');");
		//js.executeScript("alert('enter correct login credentials to continue');");
		String text=driver.findElement(By.xpath("(//p[@id='alert'])[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Dada");
		System.out.println("Dada");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123979879");
		System.out.println("797987979");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		System.out.println("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		System.out.println("Pune");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("Ganesh");
		System.out.println("Ganesh");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("Ganesh@1234");
		System.out.println("Ganesh@1234");
		driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']")).click();
		//div[@id='load_box']//input[@type='submit']
		
		driver.quit();
		System.out.println("Driver instance has been closed");
		
	}
}

package com.mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		String url="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		ChromeOptions ops=new ChromeOptions();
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act=new Actions(driver);//class will be used to perform mouse actions
		act.dragAndDrop(source, destination).perform();
		
		
	}

}

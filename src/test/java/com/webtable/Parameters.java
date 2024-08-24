package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parameters {
	WebDriver driver=null;

@Test
@org.testng.annotations.Parameters({"url","countryName"})
public void parameterTest(String url, String countryName) {
	ChromeOptions ops=new ChromeOptions();
	ops.setBrowserVersion("119");
	driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.xpath("//*[text()='"+countryName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"));
	
}
@org.testng.annotations.Parameters
@Test
public void googleTest() {
	
}

}

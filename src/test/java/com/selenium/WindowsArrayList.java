package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class WindowsArrayList {
    public static WebDriver driver = null;
    public static WebDriverWait w = null;
    public static String parentWindow=null;
    @BeforeTest
    public void setUp() {
        FirefoxOptions ops = new FirefoxOptions();
        ops.setBrowserVersion("116");
        ops.addArguments("-incognito");
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        w = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test(priority = 1)
    public void linkTest(){
        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
    }
    @Test(priority = 2)
    public void window() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();

        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println("User switched on child window");
        WebElement text= driver.findElement(By.xpath("//p[@class='im-para red']"));
        String password=text.getText().split(" ")[4];
        System.out.println(password);
        //driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(password);
        System.out.println("User entered password");
    }
@AfterTest
    public void tearDown(){
      driver.quit();
}
}

package com.exception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Navigate to a sample page
            driver.get("https://www.flipkart.com/");

            // Locate an element
            WebElement element = driver.findElement(By.xpath("a[title='Login'] span"));
            driver.findElement(By.xpath("Enter Email/Mobile number")).sendKeys("121312345");
        	driver.findElement(By.name("login")).click();
            // Simulate a DOM change (refresh, dynamic content load, etc.)
            driver.navigate().refresh();

            // Try interacting with the same element
            try {
                element.click();
            } catch (StaleElementReferenceException e) {
                System.out.println("Caught StaleElementReferenceException. Re-locating the element...");
                
                // Re-locate the element after the DOM change
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("a[title='Login'] span")));
                element.click(); // Retry the action
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }

	}

}

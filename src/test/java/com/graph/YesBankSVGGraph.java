package com.graph;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YesBankSVGGraph {
	
	public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Search for Yes Bank share SVG graph
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Yes Bank share SVG graph");
        searchBox.submit();
        
        // Click on the first result
        WebElement firstResult = driver.findElement(By.cssSelector("div.g a h3"));
        firstResult.click();
        
        // Find the SVG graph element
        WebElement svgGraph = driver.findElement(By.cssSelector("svg"));
        
        // Print the source of the SVG graph
        System.out.println("SVG Graph Source:");
        System.out.println(svgGraph.getAttribute("outerHTML"));
        
        // Close the browser
       // driver.quit();
    }

}

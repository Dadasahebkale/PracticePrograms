package com.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSearch {

	public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open YouTube
        driver.get("https://www.youtube.com/");
        
        // Locate the search box and enter the search query
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='search_query']"));
        searchBox.sendKeys("Movies");
        searchBox.sendKeys(Keys.SPACE);
        // Locate the search button and click
        WebElement searchButton = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
        searchButton.click();
        
        // Wait for search results to load
        // You can use explicit or implicit waits here
        
        // Locate and click the first search result
        WebElement firstSearchResult = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        firstSearchResult.click();
        
        // Close the browser
        driver.quit();
    }
}

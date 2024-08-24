package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ecommerce {
	public static WebDriver driver=null;
    public static String productName="QWERTY";
    @BeforeTest
    public void setUp() {
        ChromeOptions ops = new ChromeOptions();
        ops.setBrowserVersion("116");
        ops.addArguments("-incognito");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://rahulshettyacademy.com/client");
       // w = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @Test
    public void product() throws InterruptedException {
    	driver.findElement(By.id("userEmail")).sendKeys("dk@abc.com");
    	driver.findElement(By.id("userPassword")).sendKeys("Ganesh@01");
    	driver.findElement(By.id("login")).click();
    	
    	
    	
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
    	
    	List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
    	
    	
    	WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
    	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
    	
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
    	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
    	driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
    	Thread.sleep(3000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;    	
    	js.executeScript("window.scrollBy(0,150)");
    	List<WebElement> cartproducts=driver.findElements(By.cssSelector(".cartSection h3"));
    	boolean match=cartproducts.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(productName));
    	Assert.assertTrue(match);
    	WebElement element=driver.findElement(By.cssSelector(".totalRow button"));
    	js.executeScript("arguments[0].click();", element);
    	
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("[placeholder='Select Country']")).sendKeys("India");
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".ta-results")));
    	List<WebElement> options=   driver.findElements(By.xpath("//button[contains(@class,'ta-item')][2]"));
    	
    	for(WebElement opt: options) {
    		
    		if(opt.getText().equalsIgnoreCase("India")) {
    			
    			opt.click();
    			break;
    			
    		}
    	
    	}
    	Thread.sleep(2000);
    WebElement ele=   driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted"));
    JavascriptExecutor j = (JavascriptExecutor) driver;

    j.executeScript("window.scrollBy(0,200)");
     j.executeScript("arguments[0].click();", ele);
     String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();	
   	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
    	
    }
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
}

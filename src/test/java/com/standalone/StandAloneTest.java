/**
 * 
 */
package com.standalone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * 
 */
public class StandAloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String productName="ADIDAS ORIGINAL";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
	WebDriver driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/client");
	
	WebElement email=driver.findElement(By.id("userEmail"));
	WebElement password=driver.findElement(By.id("userPassword"));
	WebElement loginButton=driver.findElement(By.id("login"));
	
	email.sendKeys("automation@dk.com");
	password.sendKeys("Software@24");
	loginButton.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
	List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
	
	WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText()
			.equals(productName)).findFirst().orElse(null);
	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	
	List<WebElement> cartProducts=driver.findElements(By.cssSelector(".cartSection h3"));
	boolean match=cartProducts.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(productName));
	Assert.assertTrue(match);
	
	WebElement checkOut=driver.findElement(By.cssSelector(".totalRow button"));
	checkOut.click();
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.scrollBy(0,150)");
	WebElement countryName=driver.findElement(By.cssSelector("[placeholder='Select Country']"));
	countryName.sendKeys("india");
//	Actions a=new Actions(driver);
//	
//	a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"india").build().perform();
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	
	driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
	
	String confirmationMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
	Assert.assertTrue(confirmationMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	driver.quit();

	}

}

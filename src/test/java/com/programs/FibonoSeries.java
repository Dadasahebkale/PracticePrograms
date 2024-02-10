package com.programs;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FibonoSeries {

	public static void main(String[] args) {
		
		febo(10);
	
	}
	public static void febo(int count) {
		int a=0;
		int b=1;
		int c=1;
		for(int i=0;i<=count;i++) {
			System.out.print(a+" ,");
			
			a=b;
			b=c;
			c=a+b;
		}
	}
	public static void myWait(WebDriver element, int t) {
		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(element)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				
	}

}

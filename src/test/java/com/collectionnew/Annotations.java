package com.collectionnew;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@AfterSuite
	public void getAfterSuite() {
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void getBeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void getBeforeClass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void getTest() {
		System.out.println("Test");
	}
	@AfterMethod
	public void getMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void getAfterClass() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void getAfterTest() {
		System.out.println("AfterTest");
	}
	
}

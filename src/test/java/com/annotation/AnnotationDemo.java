package com.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {

	@Test
	public void test1() {
	System.out.println("Test Case 1");
	}// Test Case 2
	@Test
	public void test2() {
	System.out.println("Test Case 2");
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("BeforeMethod: This will be executed before every @test annotated method");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("AfterMethod: This will be executed after every @test annotated method");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("BeforeClass: This will be executed before first @Test method execution. It will be executed one only time throughout the test case");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("AfterClass: This will be executed after all test methods in the current class have been run");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("BeforeTest This will be executed before the first @Test annotated method. It can be executed multiple times before the test case");
	}
	@AfterTest
	public void afterTest() {
	System.out.println("AfterTest method with this annotation will be executed when all @Test annotated methods complete the execution of those classes inside the <test> tag in the TestNG.xml file");
	}
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("BeforeSuite It will run only once, before all tests in the suite are executed");
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("AfterSuite method with this annotation will run once after the execution of all tests in the suite is complete.");
	}
}

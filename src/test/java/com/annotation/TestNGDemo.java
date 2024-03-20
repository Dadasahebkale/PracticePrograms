package com.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeSuite
	public void BeforeSuiteTest() {
		System.out.println("I am running first in test case execution");
	}
	@AfterSuite
	public void AfterSuiteTest() {
		System.out.println("I am running last in test case execution");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am running before Every in test Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am running after Every in test Method");
	}
	@Test(priority=1)
	public void testDemo() {
		System.out.println("I'm real 1 st Test");
	}
	@Test(priority = 2)
	public void SecondDemo() {
		System.out.println("Second Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

}

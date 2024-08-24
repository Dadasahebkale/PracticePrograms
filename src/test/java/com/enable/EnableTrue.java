package com.enable;

import org.testng.annotations.Test;

public class EnableTrue {
	@Test
	public void addToCartTest() {
		System.out.println("addToCartTest");
		int i=9/0;
	}
	@Test(enabled =true, alwaysRun =true,dependsOnMethods = "addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");
	}

}

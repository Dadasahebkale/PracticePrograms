package com.overloading;

public class B extends A{

	void testB() {
		System.out.println("B2");
	}
	void testC() {
		System.out.println("C2");
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.testA();
		b1.testB();
		b1.testC();
		
		//A b2=new A();
		A a1=b1;
		a1.testA();
		a1.testB();
	
	}
}


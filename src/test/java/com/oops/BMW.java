package com.oops;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW.....Start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW.....Stop");
		
	}

	@Override
	public void reful() {
		System.out.println("BMW..........reful");
		
	}
	//non overriden method
	public void thefSafty() {
		System.out.println("BMW..............thefSafty");
	}

	

}

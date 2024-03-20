package com.abstraction;

public class ChildAbstractAirCraft extends ParentAbstractAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstractAirCraft c=new ChildAbstractAirCraft();
		c.bodyColor();
		c.saftyGuideLines();
		c.engine();
	}

	@Override
	public void bodyColor() {
		System.out.println("Red Color");
		
	}

}

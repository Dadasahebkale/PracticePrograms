package com.programs;

public class ArmStrongNumber {

	public static void isArmStrongNumber(int num) {
		System.out.println("Given number is "+num);
		int cube=0;
		int r=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("Armstrong number ");
		}else {
			System.out.println("Not Armstrong number ");
		}
	}
	
	public static void main(String[] args) {
		
		isArmStrongNumber(113);
		isArmStrongNumber(153);
		isArmStrongNumber(370);
		isArmStrongNumber(371);
		isArmStrongNumber(0);
		isArmStrongNumber(11);
		isArmStrongNumber(1);
		//isArmStrongNumber(1634);==>cube=cube+(r*r*r*r)
	}

}

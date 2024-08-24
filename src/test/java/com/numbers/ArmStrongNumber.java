package com.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArmStrongNumber {
	//check number is armstrong/narcassistic/pluperfect number
	public static boolean isArmStrongNumber(int num) {
		if(num<0) {
			return false;
		}
		if(num>0 && num<=9) {
			return true;
		}
		int power =power(num);
		int copyNum=num;
		int sum=0;
		while(copyNum !=0) {
			int lastDigit=copyNum%10;
			int factor=1;
			for(int i=0;i<power;i++) {
				factor=factor*lastDigit;
			}
			sum=sum+factor;
			copyNum=copyNum/10;
		}
		if(sum==num) {
			return true;
		}
		return false;
	}
	public static int power(int num) {
		int n=0;
		while(num !=0) {
			n++;
			num=num/10;
		}
		return n;
	}

	public static void main(String[] args) {
	//	Stream.of(isArmStrongNumber(100000000)).forEach(s->System.out.println(s));
		int num=1000000000;
		for(int i=0;i<num;i++) {
			if(isArmStrongNumber(i)) {
				System.out.println(i);
			}
		}
//		System.out.println(isArmStrongNumber(153));//1*3=1+5*3=125+3*3=27=126+27=153
//		System.out.println(isArmStrongNumber(1));
//		System.out.println(isArmStrongNumber(9));
//		System.out.println(isArmStrongNumber(10));
//		System.out.println(isArmStrongNumber(9474));
//		System.out.println(isArmStrongNumber(1634));
//		System.out.println(isArmStrongNumber(54748));
	}

}

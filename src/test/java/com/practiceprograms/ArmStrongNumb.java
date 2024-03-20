package com.practiceprograms;

public class ArmStrongNumb {

	public static void main(String[] args) {
		int num,limit=4000,rem=0,sum=0;
		
		for(int i=0;i<limit;i++) {
			num=i;
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
			sum=0;
		}

	}

}

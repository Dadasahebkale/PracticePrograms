package com.numbers;

public class LeaderElement {

	public static void findLeaders(int num[]) {
		if(num.length==0) {
			return;
		}
		if(num.length==1) {
			System.out.print(num[0]);
			return ;
		}
		int max=num[num.length-1];
		System.out.print(max+" ");
		for(int i=num.length-2;i>=0;i--) {
			if(num[i]>max) {
				System.out.print(num[i]+" ");
				max=num[i];
			}
		}
	}
	public static void main(String[] args) {
		int num[]= {92,7,12,9,8,3};
		findLeaders(num);
		System.out.println();
		int num1[]= {99,9,2,3,5,6,8,1};
		findLeaders(num1);
		System.out.println();
		int num2[]= {1};
		findLeaders(num2);
		System.out.println();
		int num3[]= {};
		findLeaders(num3);

	}

}

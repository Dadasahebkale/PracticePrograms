package com.practiceprograms;

public class PrimeTestDemo {
public static void main(String[] args) { 
	getPrime(20);
	System.out.println("=========================");
	getPrime(100);
	System.out.println("=========================");
	getPrime(200);
	//getPrime(1000);

}
public static boolean isPrime(int num) {
	if(num<=1) {
		return false;
	}
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
public static void getPrime(int num) {
	int count=0;int temp; int sum=0;
	temp=sum;
	for(int i=2;i<num;i++) {
		if(isPrime(i)) {
			System.out.print(i+" ");
			count++;
		}
		sum=sum+count;
	}
	System.out.println(sum);
}
}

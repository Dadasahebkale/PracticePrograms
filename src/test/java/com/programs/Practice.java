package com.programs;

import org.testng.annotations.Test;

public class Practice {
	
	@Test
	public void OddNumber() {
		System.out.println("Odd numbers ");
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
	}
	@Test
	public void EvenNum() {
		System.out.println("Even numbers ");
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	@Test
	public void sumOfOdd() {
		System.out.println("Sum of n numbers ");
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	@Test
	public void CountOfOdd() {
		System.out.println("Count of odd numbers");
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void SumNnumbers() {
		System.out.println("Sum of first 10 numbers :");
		int sum=0;
		int n=10;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	@Test
	public void sumOfDigits() {
		System.out.println("Sum of digits number ");
		int num=25605,rem=0,sum=0,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits "+temp+" is "+sum);
	}
	@Test
	public void armstrongNumber() {
		int n,arg,sum=0,rem;
		n=133;
		arg=n;
		for(int i=1;i<n;i++) {
			while(n>0) {
				rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			}
		}
		if(arg==sum) {
			System.out.println("Given number is armstrong "+arg);	
		}
		else {
			System.out.println("Number is not armstrong "+arg);
		}
	}
	@Test
	public void armStrongNum(){

	int n,arg,sum=0,rem;
	n=153;
	arg=n;
	for(int i=1;i<n;i++){

	while(n>0){

	rem=n%10;
	sum=sum+(rem*rem*rem);
	n=n/10;
	}
	}
	if(arg==sum){

	System.out.println("Given number is argmstrong number "+arg);
	}
	else{
	System.out.println("number is not armstrong number "+arg);
	}
	}
	@Test
	public void armStrongDemo(){
	int n,arg,sum=0,rem;

	n=150;
	arg=n;
	for(int i=1;i<n;i++){
	while(n>0){

	rem=n%10;
	sum=sum+(rem*rem*rem);
	n=n/10;

	}
	}
	if(arg==sum){

	System.out.println("Given number is armstrong "+arg);
	}else{

	System.out.println("Given number is not armstrong "+arg);
	}

	}
	@Test
	public void printArmStrong(){
		System.out.println("Print arm strong numbers ");
	int num,limit=1000,rem,sum=0;

	for(int i=1;i<limit;i++){
	num=i;
	while(num>0){

		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;

	}
	if(sum==i){
	System.out.print(i+" ");

	}
	sum=0;
	}

	}
	@Test
	public void palindromeNumber(){

	int n=1341,sum=0,arg,rem;

	arg=n;
	while(n>0){
	rem=n%10;
	sum=sum*10+rem;
	n=n/10;

	}
	if(sum==arg){
	System.out.println("Given number is palindrome "+arg);

	}else{
	System.out.println("Given number is not palindrome "+arg);

	}
	}

}

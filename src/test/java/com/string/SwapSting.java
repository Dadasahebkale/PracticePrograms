package com.string;

public class SwapSting {

	public static void main(String[] args) {
		SwapSting s=new SwapSting();
		s.SwapStringdemo();
		s.swap();
		s.Div(12,6);
		mult(23,12);
		mult(10,11);
		mult(14,21);
	}
	public void SwapStringdemo() {
		String a="Hello";
		String b="JavaWorld";
		System.out.println("Before Swapping "+a+" "+b);
		
		//1 append
		System.out.println(a.length());
		System.out.println(b.length());
		a=a+b;//HelloJavaWorld
		// 2. Store initial string a in string b
		b=a.substring(0,a.length()-b.length());
		//3. Store initial sting b in string a
		a=a.substring(b.length());
		System.out.println("After swapping :"+a+" "+b);

	}
	public void swap() {
		String s="Ganesh";
		String ss="Kale";
		System.out.println("Before swapping :"+s+" : "+ss);
		String temp="";
		
		temp=s;
		s=ss;
		ss=temp;
		System.out.println("After swapping: "+s+" : "+ss);
	}
	public void Div(int a, int b) {
		int c=(a/b);
		System.out.println("Division of "+a+" and " +b+" numbers :"+c);
	}
	public static void mult(int a, int b) {
	
		int c=a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);
	}

}

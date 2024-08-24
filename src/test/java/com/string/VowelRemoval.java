package com.string;

public class VowelRemoval {

	public static void main(String[] args) {
		StringTest("Welcome");
		StringTest("You are my friend");

	}
public static void StringTest(String s) {
	System.out.println("\n");
	//Scanner sc=new Scanner(System.in);
	//s=sc.nextLine();
	String str=s.toUpperCase();
	for(int i=0;i<s.length();i++) {
		if(!(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')){
			System.out.print(" "+s.charAt(i));
		}
		
	}
}
}

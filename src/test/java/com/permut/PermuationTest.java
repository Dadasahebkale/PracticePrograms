package com.permut;

public class PermuationTest {

	public static void main(String[] args) {
		printPermute("JSP");

	}

	private static void printPermute(String str) {
		System.out.println("Permutation of :"+str);
		getPermute("",str);
		
	}

	private static void getPermute(String Permut, String str) {
		if(str.length()==0) {
			System.out.println(Permut);
		}else {
			for(int i=0;i<str.length();i++) {
				getPermute(Permut+str.charAt(i),
						str.substring(0,i)+str.substring(i+1,str.length()));
			}
		}
		
	}

}

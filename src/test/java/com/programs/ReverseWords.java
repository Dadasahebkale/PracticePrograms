package com.programs;

public class ReverseWords {

	public static void main(String[] args) {
		String str="Java is programing langauage";
		String [] arr=str.split(" ");
		String result="";
		for(int i=arr.length-1;i>=0;i--) {
			result=result+arr[i]+" ";
		}
		System.out.println(result);
				
	}

}

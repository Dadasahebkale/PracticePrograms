package com.programs;

public class RemveUnwanted {

	public static void main(String[] args) {
		removeAll("!@##$$%Dadasaheb Kale###%");
		
	}
	public static void removeAll(String str) {
		
		//String str="!@##$$%Dadasaheb Kale###%";
		str=str.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(str);
	}

}

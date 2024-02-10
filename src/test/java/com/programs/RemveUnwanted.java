package com.programs;

public class RemveUnwanted {

	public static void main(String[] args) {
		String s="!@##$$%Dadasaheb Kale###%";
		s=s.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(s);

	}

}

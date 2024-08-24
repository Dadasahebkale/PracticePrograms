package com.numbers;
public class ValidNumber {
	public static boolean isNumber(String num) {
		try {
			Long.parseLong(num);
			System.out.println("This is a valid number : "+num);
			
		} catch (NumberFormatException e) {
			System.out.println("Not valid number "+num);
			return false;
		}
		return true;
	}
	public static boolean isValidPhoneNumber(String num) {
		if(num.length()==10 && isNumber(num)) {
			System.out.println("Valid phone number :"+num);
			return true;
		}
		System.out.println("Not a valid phone number : "+num);
		return false;
	}
	public static boolean isValidCreaditCardNum(String num) {
		if(num.length()==16 && isNumber(num)) {
			System.out.println("Valid credit card number :"+num);
			return true;
		}
		System.out.println("Not valid credit card number :"+num);
		return false;
	}
	public static boolean correctPhoneNumber(String num) {
		//return num.matches("[0-9]{10}");
		return num.matches("\\d{10}");
	}
	public static boolean correctNumber(String num) {
		return num.matches("^(-?\\d+\\.)?-?\\d+$");
	}
	public static void main(String[] args) {
		System.out.println(correctPhoneNumber("9012345678"));
		System.out.println(isValidCreaditCardNum("9798798798797811"));
		System.out.println(correctNumber("08088080"));
		System.out.println(correctNumber("-123435"));
	}

}

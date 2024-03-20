package com.switchcase;


public class SwitchCaseConcept {

	public static void main(String[] args) {
		var n=3;
		var m=switch(n) {
		case 1 -> "One";
		case 2 -> "Two";
		case 3 -> "Three";
		case 4 -> "Four";
		case 5 -> "Five";
		default -> "Number not found";
		};
		System.out.println(m);

	}

}

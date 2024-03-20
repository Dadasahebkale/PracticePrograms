package com.string;

public class SubStringDemo {

	public static String isSubString(String main,String sub) {
		System.out.println(main.matches("(.*)"+sub+"(.*)"));
		return sub;
	}
	public static boolean isTrue(String a, String b) {
		return a.contains(b);
	}
	public static boolean isget(String a,String b) {
		return a.indexOf(b)!=-1;
	}
	public static void main(String[] args) {
		System.out.println(isSubString("DadasahebKale", "Kale"));
		System.out.println(isTrue("Naveen Automation labs", "labs"));
		System.out.println(isget("Naveen Automation labs", "labs"));
	}
	 
}

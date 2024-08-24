/**
 * 
 */
package com.string;

/**
 * Check substring present in a given string
 */
public class CheckSubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isSubString("GaneshDadasahebKale", "Dada"));
		System.out.println(isSubString("abcedfghijklmnopganeshqrstuvwz", "ganesh"));
		System.out.println(isSubString1("GaneshDadasahebKale", "kale"));
		System.out.println(isSubString2("GaneshDadasahebKale", "Oviya"));
		System.out.println(isSubString("GaneshDadasahebKale$$", "$$"));
		System.out.println(isSubString("GaneshDadasahebKale123", "12"));
		System.out.println(isSubString("GaneshDadasaheb Kale", " "));//blank space
		System.out.println(isSubString("GaneshDadasaheb Kale", "  "));//double blank space
		System.out.println(isSubString("GaneshDadasaheb", null));
	}
	public static boolean isSubString(String main, String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}
	public static boolean isSubString1(String main, String sub) {
		return main.contains(sub);
		
	}
	public static boolean isSubString2(String main, String sub) {
		return main.indexOf(sub)!=-1;
	}

}

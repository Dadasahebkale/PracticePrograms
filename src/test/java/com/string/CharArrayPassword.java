/**
 * 
 */
package com.string;

import java.util.Arrays;

/**
 * Why password should be stored in char array char[] instead of string?
 */
public class CharArrayPassword {

	/**
	 With a char[] , because these are primitives types we are acting on, 
	 we could overwrite the array with any value, meaning we can avoid 
	 having sensitive data present in memory once we are done processing it.
	 Additionally, strings in Java are reserved in a special area in heap 
	 memory called the String Constant Pool
	 
	 */
	public static void main(String[] args) {
		String pwd="Dktech123";
		System.out.println("Password is :"+pwd); 
		
		char c[]=new char[] {'W','i','n','d','o','w','s','@','1','1'};
		System.out.print("Password is : "+c);
		System.out.println("Below out put will be in the star");
		Arrays.fill(c, '*');
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
	}

}

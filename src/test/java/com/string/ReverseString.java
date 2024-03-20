package com.string;

public class ReverseString {

	public static void main(String[] args) {
		//getReverString("Apple and Orange are brothers");
		//getReverString("Ganesh Kale");
		eachWord("Apple and Orange are brothers");
		removeVowels("Apple and Orange are brothers");
	}
	
	public static void getReverString(String str) {
		//str="Hanesh";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void eachWord(String inputString) {
		String[] words=inputString.split(" ");
		String reverseString =" ";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord=" ";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
		System.out.println("------------------------");
		
	}
	public static void removeVowels(String s) {
		
		//vector<char> vowels= {'a','e','i','o','u','A','E','I','O','U'};
		String rev=" ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				continue;
			}else {
				
					System.out.print(s.charAt(i));
				
			}
			System.out.print(rev);
		}
	}

}

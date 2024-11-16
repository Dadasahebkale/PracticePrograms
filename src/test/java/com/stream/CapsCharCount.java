package com.stream;

import org.testng.annotations.Test;

public class CapsCharCount {

	@Test
	public void charCount() {
		String str="DadaSaheb Kale Takali Lonar";
		str=str.replace(" ", "");
		int Capscount=0;
		int allCount=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				Capscount++;
			}
		}
		System.out.println("Capital Letters : "+Capscount);
		System.out.println("Small Letters : "+(allCount-Capscount));
	}
	@Test
	public void getCount() {
		String str="Welcome To Java Programing";
		str=str.replace(" ", "");
		int capsCount=0;
		int allcharsCount=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				capsCount++;
			}
		}
		System.out.println("Capital Letters :"+capsCount);
		System.out.println("Small Letters :"+(allcharsCount-capsCount));
	}
	@Test
	public void getCharCount() {
		String str="Big Black Bear Big Black Nose";
		str=str.replaceAll(" ", "");
		int capsCharCount=0;
		int allCharCount=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				capsCharCount++;
			}
		}
		System.out.println("Caps Characters "+capsCharCount);
		System.out.println("Small Characters "+(allCharCount-capsCharCount));
	}
	@Test
	public void getTest() {
		String str="We Are Happy To Help You in The Terms of Any Opportunity";
		str=str.replace(" ", "");
		int capsCount=0;
		int allChars=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				capsCount++;
			}
		}
		System.out.println("Caps Count "+capsCount);
		System.out.println("Small Chars "+(allChars-capsCount));
	}
	@Test
	public void getChars() {
		String str="I am Gratefull Of Many Blessings in my Life";
		str=str.replace(" ", "");
		int count=0;
		int allcharsCount=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println("Captial Letter Count :"+count);
		System.out.println("Small Letter Count :"+(allcharsCount-count));
	}
	
}

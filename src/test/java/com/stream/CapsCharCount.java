package com.stream;

public class CapsCharCount {

	public static void main(String[] args) {
		String str="DadaSaheb Kale Takali Lonar";
		str=str.replace(" ", "");
		int count=0;
		int allCount=str.length();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println("Capital Letters : "+count);
		System.out.println("Small Letters : "+(allCount-count));
	}

}

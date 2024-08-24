package com.removejunk;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="!@#$%Ganesh&)**(*()";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		String ss="123456Pranav";
		ss.replaceAll("[a-zA-Z]","");
		System.out.println(ss);

	}

}

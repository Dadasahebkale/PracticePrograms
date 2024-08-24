package com.string;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="!@#$%&*(dada1234&*(&";
		//using regular expression to remove junk character
		String p="!@#$%&*(dada1234&*(&";
		s=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
		String sd=p.replaceAll("[a-zA-z0-9]", "");
		System.out.println(sd);
		String d=s.replaceAll("[^0-9]", "");
		System.out.println(d);
		String ap="!@#$%&*(dada1234&*(&";
		ap=ap.replaceAll("[^a-zA-Z]", "");
		System.out.println(ap);
		String f="kaledadasahebappa";
		f=f.replaceAll("[aeiou]", "");
		System.out.println(f);
	}

}

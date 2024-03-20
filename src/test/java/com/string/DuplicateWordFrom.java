package com.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFrom {

	public static void main(String[] args) {
		 String str="I like to play football and football is most famous game in the world our team prefer to play famous games";
	      String [] words=str.split(" ");
	      Set<String> setOfWords=new HashSet<String>();
	      Set<String> dw=new HashSet<String>();
	      for(String word : words){
	          if(setOfWords.add(word)==false){
	              dw.add(word);
	          }
	      }
	      

	      System.out.println(dw);

	}

}

package com.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordCharLines {
static String path="E:\\Preparation\\Word.txt";
	public static void main(String[] args) {
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(path));
			String currentLine=reader.readLine();
			while(currentLine!=null) {
				lineCount++;
				//words
				String words[]=currentLine.split(" ");
				wordCount=wordCount+words.length;
				//lines
				for(String word : words) {

					charCount=charCount+word.length();
				}
				currentLine=reader.readLine();
			}
			System.out.println("Total number of lines "+lineCount);
			System.out.println("Total number of words "+wordCount);
			System.out.println("Total number of chars "+charCount);
		}
	
		catch(Exception e) {
			System.out.println("Some Exception is comming");
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

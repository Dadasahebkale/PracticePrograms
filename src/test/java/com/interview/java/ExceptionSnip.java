package com.interview.java;

import java.io.IOException;

public class ExceptionSnip {

	public static void main(String[] args) {
		try {
			throw new Exception("Dada");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("DK Testing...");
		}
	}

}

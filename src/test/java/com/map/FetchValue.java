package com.map;

import java.util.HashMap;

public class FetchValue {

	public static void main(String[] args) {
		HashMap<Integer, String> h_M=new HashMap<Integer, String>();
		h_M.put(10, "Tendulkar");
		h_M.put(12, "Yuvraj");
		h_M.put(11, "Sami");
		h_M.put(7, "Dhoni");
		
		System.out.println(h_M);
		System.out.println(h_M.get(7));

	}

}

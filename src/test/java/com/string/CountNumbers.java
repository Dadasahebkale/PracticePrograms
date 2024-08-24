package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumbers {
	public static void getDigitCount(long num) {
		if(String.valueOf(num).length()==1) {
			System.out.println(num+" : "+1);
			return;
		}
		Map<Long, Integer> map=new HashMap<Long, Integer>();
		while(num!=0) {
			long lastDigit=num%10;
			if(map.containsKey(lastDigit)) {
				map.put(lastDigit, map.get(lastDigit)+1);
			}else {
				map.put(lastDigit, 1);
			}
			num=num/10;
		}
		Set<Long> s=map.keySet();
		for(Long k : s) {
			System.out.println(k+" : "+map.get(k));
		}
	}

	public static void main(String[] args) {
		
		getDigitCount(121123);
		System.out.println("======================");
		getDigitCount(3);
		System.out.println("======================");
		getDigitCount(0);
	}

}

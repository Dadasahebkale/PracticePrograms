package com.durga;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
//		StringBuffer               |   StringBuilder  
// 1. Every method present in SB is| 1. No method present in StringBuilder is synchronized
//		Synchronized
// 2. At a time one one Thread is  | 2. At a time multiple Thread are allowed to operate
//  allowed to operate on stringbuf|    on stringbuilder object and hence it is not thread
//   -fer object and hence it is   |    safe
//	thread safe
//3.Threads are required to wait to| 3. Threads are not required to wait to operate on
//  operate on stringbuffer object |	on StringBuilder object and hence relatively 
// and Hence relatively performance|	performance is high
// is slow
// 4. Introduced in 1.0 version    | 4. Introduced in 1.5 version
		

//String: If content are fixed then prefer the string class or object
// String or string object is always thread safe
//StringBuffer: if content is not fixed and keep on changing but thread safety is required
//StringBuilder: if content is not fixed and keep on changing but i don't want thread safety
//multiple threads are to perform Simultaneously

StringBuilder sb=new StringBuilder();
sb.append("Dadasaheb").append("Kale").reverse().insert(2, "BCA");
System.out.println(sb);
	}

}

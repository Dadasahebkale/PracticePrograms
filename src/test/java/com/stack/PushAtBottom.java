package com.stack;

import java.util.Stack;

public class PushAtBottom {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushBottom(4, s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}
public static void pushBottom(int data,Stack<Integer> s) {
	if(s.isEmpty()) {
		s.push(data);
		return;
	}
	int top=s.pop();
	pushBottom(data, s);
	s.push(top);
}
}

package com.stack;

import java.util.Stack;

public class SimpleStack {

	public static void main(String[] args) {
		Stack<Integer> l=new Stack<Integer>();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		while(!l.isEmpty()) {
			System.out.println(l.peek());
			l.pop();
		}
	}

}

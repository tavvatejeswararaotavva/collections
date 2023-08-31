package com.collections;

import java.util.Stack;

public class removeElementStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(23);
		s.push(34);
		s.push(76);
		s.push(87);
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.lastIndexOf(87));

		s.pop();
		System.out.println(s);

	}

}

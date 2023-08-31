package com.collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		pQ.add(1);
		pQ.add(4);
		pQ.add(8);
		pQ.add(2);
		System.out.println(pQ.peek());
	}

}

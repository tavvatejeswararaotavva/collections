package com.collections;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(34);
		ll.add(45);
		ll.add(67);
		ll.add(34);

		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.contains(34));
		ll.addFirst(45);
		System.out.println(ll);
		System.out.println(ll.remove());

	}

}

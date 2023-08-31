package com.collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(9);
		list.add(3);
		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(1);
		list1.add(20);
		list1.add(90);
		list1.add(3);
		LinkedList<Integer> intersection = new LinkedList<>(list);
		intersection.retainAll(list1);
		System.out.println(intersection);
	}

}

package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(5);
		System.out.println(list.lastIndexOf(2));
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		HashSet<Integer> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		System.out.println(set.size());
		System.out.println(list);
		System.out.println(set);
		for (int i : list) {
			System.out.println(i);
		}
	}

}

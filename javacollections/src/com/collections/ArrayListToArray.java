package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(7);
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);

	}

}

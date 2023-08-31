package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Customcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		Comparator<String> cmp = Collections.reverseOrder();

		Collections.sort(list, cmp);
		System.out.println(list);

	}

}

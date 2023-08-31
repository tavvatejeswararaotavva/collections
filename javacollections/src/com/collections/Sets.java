package com.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

	private static boolean hascommonelements = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hS = new HashSet<>();
		hS.add(23);
		hS.add(43);
		hS.add(45);
		hS.add(12);

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(43);
		ts.add(76);
		ts.add(123);
		ts.add(645);
		for (int i : hS) {
			if (ts.contains(i)) {

				hascommonelements = true;
				break;
			}

		}
		System.out.println(hascommonelements);
	}

}

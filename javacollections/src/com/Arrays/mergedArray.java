package com.Arrays;

import java.util.HashSet;

public class mergedArray {

	public static void main(String[] args) {
		int[] a = { 23, 43, 64 };
		int[] b = { 12, 43, 53 };
		int[] m = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			m[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			m[a.length + i] = b[i];
		}
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println("------------------------------");
		HashSet<Integer> hSet = new HashSet<>();
		for (int i : m) {
			hSet.add(i);

		}
		System.out.println(hSet);
		System.out.println("------------------------------");

		// commonelements elements
		for (int i : a) {
			for (int j : b) {
				if (i == j) {
					System.out.print(i + ",");
				}

			}

		}
	}

}

package com.Arrays;

import java.util.Arrays;

public class SecoundLargestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 23, 43, 64, 78, 65, 24, 765, 4 };
		Arrays.sort(a);

		System.out.println("secont largest " + a[a.length - 2]);
		System.out.println("second smallest " + a[1]);

	}

}

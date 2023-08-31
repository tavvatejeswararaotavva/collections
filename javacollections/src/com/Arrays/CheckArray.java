package com.Arrays;

public class CheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 35, 75, 23, 96, 46, 34 };
		int elemnt = 34;
		Boolean isBoolean = false;
		for (int i : a) {
			if (i == elemnt) {
				isBoolean = true;
				break;
			}
		}
		System.out.println(isBoolean);
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elemnt) {
				System.out.println(i);
			}
		}

	}

}

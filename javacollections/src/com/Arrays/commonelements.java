package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 6, 7, 8 };
		List<Integer> difference = new ArrayList<>();

		for (int num1 : arr1) {
			boolean found = false;

			for (int num2 : arr2) {
				if (num1 == num2) {
					found = true;
					break;
				}
			}

			if (!found) {
				difference.add(num1);
			}
		}

		System.out.println("Difference between arrays: " + difference);
	}

}

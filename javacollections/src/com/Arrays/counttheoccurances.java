package com.Arrays;

public class counttheoccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 53, 64, 24, 53, 632, 46, 53 };
		int find = 53;
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

//		
//		for (int i : arr) {
//			if (i == find) {
//				count++;
//			}
//		}
//		System.out.println(find + " occurance is " + count);
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j] && arr[j] != -1) {
//					arr[j] = -1;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != -1) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//		// int[] b;

	}

}

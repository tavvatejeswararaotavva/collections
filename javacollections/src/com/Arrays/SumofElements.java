package com.Arrays;

public class SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg;
		int[] a = { 23, 43, 64, 78, 65, 24, 765, 4 };
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		System.out.println(sum);
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		avg = sum / a.length;
		System.out.println(avg);
	}

}

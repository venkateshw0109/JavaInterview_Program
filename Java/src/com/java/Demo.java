package com.java;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());

		int i = 0;

		int[] arr = new int[n];

		while (i < n) {
			arr[i] = Integer.parseInt(scan.nextLine());
			i++;
		}

		reverse(arr, n);
	}

	static void reverse(int arr[], int no) {
		int start = 0;
		int end = no - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < no; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

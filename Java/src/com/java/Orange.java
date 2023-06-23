package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Orange extends Apple {

	public static void main(String[] args) {

		   int a = 2223351;
	        int[] count = new int[10];

	        while (a > 0) {
	            int digit = a % 10;
	            count[digit]++;
	            a /= 10;
	        }

	        int maxCount = 0;
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > maxCount) {
	                maxCount = count[i];
	            }
	        }

	        System.out.print("Most frequently appearing digit(s): ");
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] == maxCount) {
	                System.out.print(i + " ");
	            }
	        }
	}
}

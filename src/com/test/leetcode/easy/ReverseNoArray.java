package com.test.leetcode.easy;

import java.util.Arrays;

public class ReverseNoArray {

	public static void main(String[] args) {

		int[] num = { 1, 3, 5, 7, 9, 11, 15, 17, 19,7 };
		// How to reverse an array in the subset of N? e.g. Input:
		// [1,3,5,7,9,11,15,17,19], Output: [5,3,1,11,9,7,19,17,15]
		// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3
		// Output: 3, 2, 1, 6, 5, 4, 9, 8, 7
		int k = 4;
		int n = num.length;
		 for (int i = 0; i < n; i += k)
	        {
	            int left = i;
	    
	            // to handle case when k is not multiple
	            // of n
	            int right = Math.min(i + k - 1, n - 1);
	            int temp;
	            
	            // reverse the sub-array [left, right]
	            while (left < right)
	            {
	                temp=num[left];
	                num[left]=num[right];
	                num[right]=temp;
	                left+=1;
	                right-=1;
	            }
	        }
		 System.out.println(Arrays.toString(num));


		// Given an array arr[] and a position in array, k
		int loc = 5;
		reverseArrayWithUptoGivenLocation(num, loc);

		// reverse number array

		int[] reverse = new int[num.length];
		int count = 0;

		for (int i = num.length - 1; i > 0; i--) {
			reverse[count] = num[i];
			count++;

		}

		// System.out.println(Arrays.toString(reverse));

	}

	private static void reverseArrayWithUptoGivenLocation(int[] a, int k) {

		for (int i = 0; i < k / 2; i++) {
			int tempswap = a[i];
			a[i] = a[k - i - 1];
			a[k - i - 1] = tempswap;
		}
		//System.out.println(Arrays.toString(a));
	}

}

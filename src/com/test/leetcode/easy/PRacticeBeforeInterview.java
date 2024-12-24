package com.test.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PRacticeBeforeInterview {

	public static void main(String[] args) {

		// merge two diff size array and result in asc order
		// mergeTwoArraysOfDiffSize();
		// mergeWithpredifnedMethods();

		// return num of repeated char in arr of char
		// checkCharCount();

		// reverse an array or string
		// reverseMe();

		// palindrome number
		// palindromeNum();

		// reverse only the strings in input
		//reverseOnlyString();
		
		//write a script that takes in two list-like objects(of your choice, example: array, arraylist,list) and find the intersection of those 2 lists
		
		int[] arr1 = {1,2,4,4};
		int[] arr2 = {4,4,6,7};
		//output:{4,5}
		
		ArrayList<Integer> al  = new ArrayList<>();
				al = checkIntersection(arr1, arr2);
				System.out.println(al);

		int[] num = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 7 };
		int n = 3;
		// reverse number array
		// reverseNumArray(num);

		// How to reverse an array in the subset of N? e.g. Input:
		// [1,3,5,7,9,11,15,17,19], Output: [5,3,1,11,9,7,19,17,15]
		// reverseNumInSubset(num,n);

		// linkedlist

		LinkedList<String> linky = new LinkedList<>();
		ArrayList<String> arry = new ArrayList<>();

		linky.add("swap");
		linky.add("dap");
		linky.add("trap");

		arry.add("swap");
		arry.add("dap");
		arry.add("trap");

	}

	private static ArrayList<Integer> checkIntersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i< arr1.length;i++) {
			
			for(int j =0; j< arr2.length;j++) {
				if(!al.contains(arr1[i]) && arr1[i] == arr2[j]) {
					al.add(arr1[i]);
					break;
				}
			}
			
		}
		
		
		return al;
	}

	private static void reverseOnlyString() {

		String str = "swap30nixu100vishu";
		
		if (str.replaceAll("\\D", "").length() > 0) {  // check if the string contain numbers
		    str = str.replaceAll("\\d", " $0");  
		    str = str.replaceAll("\\d", "$0 ");// if yes put a space before and after digit
		}
		
		
		StringTokenizer token = new StringTokenizer( str," ");
		String finalStr = "";
		
		
		
	while(token.hasMoreTokens()) {
		String tokStr = String.valueOf(token.nextToken());
		if(tokStr.matches("^[a-zA-Z]*$")) {
			tokStr = reverseString(tokStr);
			finalStr = finalStr + tokStr;
			
		}
		else {
			finalStr = finalStr + tokStr;
		}
		
		
	}
	
	System.out.println("final string is :"+finalStr);
		
		

	}

	private static String reverseString(String tokStr) {
		
		String reverse = "";
		for(int i =tokStr.length()-1;i>=0;i--) {
			reverse = reverse + tokStr.charAt(i);
		}
		return reverse;
	}

	private static void palindromeNum() {

		int num = 121;

		String numString = Integer.toString(num);
		String revString = "";
		for (int i = numString.length() - 1; i >= 0; i--) {
			revString = revString + numString.charAt(i);
		}

		if (numString.equals(revString)) {
			System.out.println("is plaindrome");
		} else {
			System.out.println("not plaindrome");
		}

	}

	private static void reverseMe() {

		int[] num = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 7 };
		int[] reverseArr = new int[num.length];
		int count = 0;
		int len = num.length - 1;

		for (int i = len; i >= 0; i--) {

			reverseArr[count] = num[i];
			count++;
		}
		System.out.println(Arrays.toString(reverseArr));

	}

	private static void checkCharCount() {
		Character[] ch = { 'a', 'e', 'a', 'a', 'n', 'a', 't', 'l' };
		char check = 'a';
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == check) {
				count++;

			}

		}
		System.out.println(count);

	}

	private static void mergeWithpredifnedMethods() {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4 };

		int[] mergeArr = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, mergeArr, 0, arr1.length);
		System.arraycopy(arr2, 0, mergeArr, arr1.length, arr2.length);
		Arrays.sort(mergeArr);
		System.out.println(Arrays.toString(mergeArr));

	}

	private static void mergeTwoArraysOfDiffSize() {

		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4 };

		int[] mergeArr = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			mergeArr[i] = arr1[i];

		}

		int count = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			mergeArr[count] = arr2[i];
			count++;
		}

		for (int k = 0; k < mergeArr.length; k++) {

			for (int l = k + 1; l < mergeArr.length; l++) {
				int tmp = 0;
				if (mergeArr[k] > mergeArr[l]) {
					tmp = mergeArr[k];
					mergeArr[k] = mergeArr[l];
					mergeArr[l] = tmp;

				}
			}

		}
		System.out.println(Arrays.toString(mergeArr));

	}

	private static void reverseNumInSubset(int[] num, int n) {
		int length = num.length;

		for (int i = 0; i < n; i += n) {
			int left = i;
			int right = Math.min(i + length - 1, length - 1);

		}

	}

	private static void reverseNumArray(int[] num) {

		int[] reverse = new int[num.length];
		int count = 0;

		for (int i = num.length - 1; i > 0; i--) {
			reverse[count] = num[i];
			count++;
		}
		System.out.println(Arrays.toString(reverse));
	}

}

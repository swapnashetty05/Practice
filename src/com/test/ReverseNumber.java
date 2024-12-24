package com.test;

import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		

		int [] arr = {1,3,5,7,9,11,15,17,19};
		reverseNum(arr);

	}
	
	private static void reverseNum(int [] arr) {
		
		int [] revArr = new int[arr.length];
		int j =arr.length-1;
		for(int i = 0;i<arr.length;i++) {
			
				revArr[j] = arr[i];
				j--;
			
			
		}
		System.out.println(Arrays.toString(revArr));
	}

}

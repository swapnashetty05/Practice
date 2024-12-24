package com.test;

import java.util.Arrays;

public class MergeDiffArrayAsc {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 90, 54, 23, 100, 0, 1 };

		int[] arr2 = { 8, 2, 0, 12, 76 };
		
		mergeAsc(arr,arr2);

	}

	
	private static void mergeAsc(int [] arr, int [] arr2) {
		
		int totalSize = arr.length +arr2.length;
		
		int[] mergeAscArr = new int[totalSize]  ;
		int counter =0;
		
		for(int i =0 ; i< arr.length;i++) {
			mergeAscArr[i] = arr[i];
			
		}
		
		//mergeAscArr = arr ;
		
		for(int i =arr.length ; i< mergeAscArr.length;i++) {
			
				mergeAscArr[i] =arr2[counter];
				counter++;
			}
			
		Arrays.sort(mergeAscArr);
		
		System.out.println(Arrays.toString(mergeAscArr));
		
	}
}

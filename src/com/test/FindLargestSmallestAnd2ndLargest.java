package com.test;

public class FindLargestSmallestAnd2ndLargest {

	public static void main(String[] args) {
		{
			int[] arr = { 23, 5, 1, 89, 65, 0, 23, 432, 1 };
			printLargest2ndLargestAndSmallest(arr);

		}

	}

	public static void printLargest2ndLargestAndSmallest(int[] arr) {

		int largestNum = arr[0];
		int smallestNum = arr[0];
		int secLargestNum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largestNum) {
				secLargestNum = largestNum;
				largestNum = arr[i];

			} else if (arr[i] < smallestNum) {
				smallestNum = arr[i];
			}
		}
		
		System.out.println("largestNum:"+largestNum + "smallestNum :"+smallestNum +"secLargestNum:"+ secLargestNum);

	}

}

package com.test.leetcode.easy;

import java.util.Scanner;



public class SearchInsertPosition {
	/*
	 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

	You must write an algorithm with O(log n) runtime complexity.

	 

	Example 1:

	Input: nums = [1,3,5,6], target = 5
	Output: 2
	Example 2:

	Input: nums = [1,3,5,6], target = 2
	Output: 1
	Example 3:

	Input: nums = [1,3,5,6], target = 7
	Output: 4
	 */

	public static void main(String[] args) {

		int position;
		int[] nums = { 1, 3, 5, 6 };
		int target;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please enter target : ");
			target = scanner.nextInt();
		} finally {
			scanner.close();
		}
		position = searchInsertPos(nums, target);
		System.out.println(position);

	}

	private static int searchInsertPos(int[] nums, int target) {

		int position = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;

			} else if (nums[i] < target) {
				position = i;
			}

		}

		return position;
	}

}

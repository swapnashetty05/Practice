package com.test.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowProblems {

	public static void main(String[] args) {
		// Given an array of integers numbers that is already sorted in ascending order,
		// find two numbers such that they add up to a specific target
		/*
		 * Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation: The sum
		 * of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
		 */
		int[] num = { 2, 7, 11, 15 };
		int target = 26;
		
		int[] output = checkSum(num,target);
		System.out.println(Arrays.toString(output));
		

	}
	
	private static int[] checkSum(int[] num, int target) {
		Map<Integer,Integer> check = new HashMap<>();
		for(int i=0; i<num.length; i++) {
			for(int j =0; j<num.length;j++) {
				int temp = target - num[i];
				if(check.containsKey(temp)) {
					return new int[] {check.get(temp),i};
				}
				
				check.put(num[i], i);
			}
			
		}
		
		
		return new int[0];
	}

	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> numToIndex = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (numToIndex.containsKey(complement)) {
	            return new int[] { numToIndex.get(complement), i };
	        }
	        numToIndex.put(nums[i], i);
	    }
	    return new int[0]; // No valid pair found
	}

}

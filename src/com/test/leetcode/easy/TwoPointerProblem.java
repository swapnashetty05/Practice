package com.test.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointerProblem {

	public static void main(String[] args) {
		//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
		
		int [] nums = {1,2,2,3,4,4,4,5,5,6,7};
		
		/*
		 * One important thing in the question is that the array is sorted. This means that all the duplicate elements will be adjacent to each other. 
		 * For e.g., in the array [1,2,2,3,4,4,4,5,5,6,7], we see all the duplicate elements are adjacent to each other.

			We can use this property of the sorted array containing duplicates to solve this question using the following steps —

			Check if the current and the next element are equal.
			If they are, we will skip the next element and will continue the procedure as long as we encounter the duplicates.
			If the elements are not duplicate, we will place the next (different) element next to the current element.
		 */
	
		int count =0;
		
		for(int i=0;i<nums.length;i++) {
			
			// If the current element is equal to the next element, we skip
			if(i < nums.length - 1 && nums[i]==nums[i+1]) {
				continue;
				
				
			}
			
			// We will update the array in place
			
			nums[count] = nums[i];
			count++;
			
		}
		System.out.println("size of non duplicate array is : "+count + Arrays.toString(nums));

	}

}

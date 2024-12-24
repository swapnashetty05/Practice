package com.test.leetcode.easy;

import java.util.ArrayList;

public class IntersectionTwoArrays {

	static ArrayList<Integer> al = new ArrayList<>();

	public static void main(String[] args) {

		int nums1[] = { 4, 9, 5 };
		int nums2[] = { 9, 4, 9, 8, 4 };

		al = intersection(nums1, nums2);
		System.out.println(al.toString());
	}

	public static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {

		for (int i = 0; i < nums1.length; i++) {
			for (int j = i + 1; j < nums2.length; j++) {

				if (!al.contains(nums1[i]) && (nums1[i] == nums2[j])) {
					al.add(nums1[i]);
					break;
				}
			}

		}

		return al;

	}

}

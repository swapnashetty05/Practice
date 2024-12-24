package com.test.leetcode.easy;

public class PalindromeNumber {

	/*
	 * Given an integer x, return true if x is a palindrome , and false otherwise.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
	 * and from right to left.
	 * 
	 * Example 2:
	 * 
	 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
	 * From right to left, it becomes 121-. Therefore it is not a palindrome.
	 * 
	 * Example 3:
	 * 
	 * Input: x = 10 Output: false Explanation: Reads 01 from right to left.
	 * Therefore it is not a palindrome.
	 */

	public static void main(String[] args) {

		int x = 121;

		// System.out.println("is palindrome : " + checkpalindrome(x));
		System.out.println("is palindrome : " + checkpalindromewithoutbuilin(x));

	}

	private static boolean checkpalindrome(int x) {

		String check = Integer.toString(x);
		String reverse = new StringBuilder(check).reverse().toString();
		return check.equals(reverse);

	}

	private static boolean checkpalindromewithoutbuilin(int x) {

		String check = Integer.toString(x);
		String reverse = "";
		
		for(int i=0;i<check.length();i++) {
			reverse = reverse+ check.charAt(i);
			
		}
		return check.equals(reverse);

	}

}

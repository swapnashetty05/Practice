package com.test.leetcode.easy;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		// Given a number in an array form. Write a program to move all zeros to the end.
		
		int[] num = {0,1,6,0,-3,6,0,2,0,100};
		
		moveZeroes(num);

	}

	private static void moveZeroes(int[] num) {
		int[] finalArr = new int[num.length];
		int counter = 0;
		
		for(int i =0; i<num.length;i++) {
			if(num[i] != 0) {
				finalArr[counter] = num[i];
				counter++;
			}
		}
		
		for(int i =0; i<num.length;i++) {
			if(num[i] == 0) {
				finalArr[counter] = num[i];
				counter++;
			}
		}
		
		System.out.println(Arrays.toString(finalArr));
		
	}

}

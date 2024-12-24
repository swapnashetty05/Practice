package com.test.leetcode.easy;

public class CountOddOrEvenDigit {

	public static void main(String[] args) {
		
		
		int[]  num = {2,3,4,5,6};
		int counteven=0, countodd =0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2 ==0) {
				counteven++;
			}
			else {
				countodd++;
			}
		}
		
		System.out.println("countodd : " + countodd + "counteven : " +counteven);

	}

}

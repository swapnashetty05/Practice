package com.test.leetcode.easy;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		
		int num = 2345;
		int count =0;
		
		/*
		String number = Integer.toString(num);
		
		for(int i =0; i< number.length();i++) {
			count = count + number.charAt(i);
		}
		*/
		
		while(num>0) {
			//Mod 10 will give the remainder when a number will be devided by 10.
			count = count + num%10;
			num = num/10;
			
		}
		
		System.out.println(count);

	}

}

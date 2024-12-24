package com.test;

import java.util.Arrays;
import java.util.TreeSet;

public class Testme {

	public static void main(String[] args) {
		
	int[] arr = {0,3,1,0,2,0};
		
		Arrays.sort(arr);
		
		System.out.println("Modified array: " +Arrays.toString(arr));
		
		String str = "1SWAP9RE0E53";
		int count  =0;
		
		for(int i=0; i<str.length();i++) {
		if(Character.isDigit(str.charAt(i))) {
			count += Integer.parseInt(String.valueOf(str.charAt(i)));
			
		}
		
		}
		System.out.println("count :" +count);
	}

}

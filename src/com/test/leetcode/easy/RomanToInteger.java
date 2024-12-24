package com.test.leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String input = "MCMXCIV";
		int sum ;
		
		sum = romanToInt(input);
		System.out.println(sum);

	}

	private static int romanToInt(String input) {
		
		HashMap<Character,Integer> value = new HashMap<>();
		value.put('I', 1);
		value.put('V', 5);
		value.put('X', 10);
		value.put('L', 50);
		value.put('C', 100);
		value.put('D', 500);
		value.put('M', 1000);
		
		int sum =0;
		for(int i=0;i<input.length();i++) {
			//check if the current value is less than previous 
			if((i+1<input.length())&& (value.get(input.charAt(i))< value.get(input.charAt(i+1))) ){
				//subtract the values and add to sum
				sum += value.get(input.charAt(i+1)) - value.get(input.charAt(i));
				//skip next value
				i++;
			}
			else {
				sum+= value.get(input.charAt(i));
				
			}
			
		}
		return sum;
		
	}

}

package com.test.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElements {

	public static void main(String[] args) {
		{
			int[] arr = { 4, 2, 3, 5, 1, 1, 2, 4 };
			String str = "swapna";

			// printRepeatingElements(arr);
			printNonRepeatingchar(str);
		}
	}

	private static void printNonRepeatingchar(String str) {

		
		
		Map <Character,Integer> occ = new HashMap<>();
		int counter =0;
		
		
		
		
		
		//print the number of occurrences of all letters in a string
		for(int i=0;i<str.length();i++) {
			for(int j =i+1; j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					occ.put(str.charAt(i), counter++);
					
				}
				else {
					occ.put(str.charAt(i), 1);
				}
			}
		}
		
		System.out.println(occ);
		for (int i = 0; i < str.length(); i++) {

            // Print only if this
            // character is not printed
            // before
            if (occ.get(str.charAt(i)) != 0) {
                System.out.print(str.charAt(i));
                System.out.print(occ.get(str.charAt(i)) + " ");
                occ.put(str.charAt(i), 0);
            }
        }

	}

	

	
	/*
	 * else if(j==str.length()-1) { nonrep.add(str.charAt(i)); }
	 * 
	 */

	public static void printRepeatingElements(int[] arr) {
		// Map<Integer> repEle = new Map<>();

		ArrayList<Integer> repElement = new ArrayList<>();
		System.out.println(arr.length);

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repElement.add(arr[j]);
				}
			}

		}
		System.out.println(repElement);
	}
}

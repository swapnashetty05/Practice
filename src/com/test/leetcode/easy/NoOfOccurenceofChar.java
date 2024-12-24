package com.test.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NoOfOccurenceofChar {

	public static void main(String[] args) {
		// Write a script to print the number of occurrences of a given character or all
		// letters in a string
		// not workinh
		String str = "swapnaaas";
		checkFrequency(str);

		// char check ='a';

		Map<Character, Long> occ = new HashMap<>();
		// int counter =1;
		final int MAX_CHAR = 256;

		// long count = someString.chars().filter(ch -> ch ==
		// someString.charAt(ch)).count();

		// occ.put(someString.charAt(ch), count);

		// Create an array of size 256
		// i.e. ASCII_SIZE
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		// Initialize count array index
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		// Create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}

		// System.out.println(count);

		// print the number of occurrences of a given character
		/*
		 * for(int i =0;i<str.length();i++) { if(str.charAt(i) == check) { counter++;
		 * 
		 * } } System.out.println("char : "+ check + "  occurs : "+counter);
		 * 
		 * 
		 * //print the number of occurrences of all letters in a string for(int
		 * i=0;i<str.length();i++) { if(null == occ.containsValue(str.charAt(i)) {
		 * for(int j =0; j<str.length();j++) { if(str.charAt(i)== str.charAt(j)) {
		 * counter++; }
		 * 
		 * } occ.put(str.charAt(i), counter); } }
		 * 
		 * 
		 * 
		 * System.out.println(occ);
		 */
		/*
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * // Print only if this // character is not printed // before if
		 * (occ.get(str.charAt(i)) != 0) { System.out.print(str.charAt(i));
		 * System.out.print(occ.get(str.charAt(i)) + " "); occ.put(str.charAt(i), 0); }
		 * }
		 */
	}

	private static void checkFrequency(String str) {

		ArrayList<Character> al = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; i < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					al.add(str.charAt(i));

				}

			}
		}
		System.out.println(Collections.frequency(al, "a"));

	}

}

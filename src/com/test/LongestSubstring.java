package com.test;

import java.util.ArrayList;

public class LongestSubstring {

	public static void main(String[] args) {

		String s = "abcdabcfgh";

		longestSub(s);

	}

	private static void longestSub(String str2) {

		String withoutDup = "";
		

		for(int i =0; i<str2.length();i++) {
			char check = str2.charAt(i);
			
			for(int j =1;j<str2.length();j++) {
				if (check!=str2.charAt(j)) {
					withoutDup = withoutDup + str2.charAt(j);
				}
			}
			
			
		}
		
		System.out.println(withoutDup);

		}
		

	}



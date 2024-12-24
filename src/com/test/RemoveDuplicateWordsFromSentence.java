package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class RemoveDuplicateWordsFromSentence {

	public static void main(String[] args) {
		String str = "Hello I am Vish Vish am";
		String str2 = "swapnan";
		//printSentenceWithoutDuplicates(str);
		printDupcharinsen(str2);

	}
	
	private static void printDupcharinsen(String str) {
		ArrayList<Character> dupchar = new ArrayList<>();
		for(int i=0; i<str.length();i++) {
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)) {
					dupchar.add(str.charAt(j));
				}
			}
		}
		System.out.println("dup chars are: "+ dupchar);
	}

	private static void printSentenceWithoutDuplicates(String str) {

		String withoutDup = "";
		
		int n=0;
		String word="";

		StringTokenizer token = new StringTokenizer(str, " ");
		Set <String> hs = new HashSet<>();

		//String[] arr = new String[token.countTokens()];
		System.out.println(token.countTokens());
		while (token.hasMoreTokens()) {
					
			word = token.nextToken();
			while(!hs.contains(word)){
				System.out.println(word+" ");
				hs.add(word);
				
			}
			
		}
		
		
		
		
		
/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					withoutDup = withoutDup + arr[j];

				}
			}

		}
*/
		System.out.println("withoutdup :" + hs);

	}
}

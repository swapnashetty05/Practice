package com.test;

import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		String str = "I am swapna shetty";
		// printReverseofString(str);
		// ReverseSentence(str);
		//ReverseEachWord(str);
		//printEachWordReverse2(str);
		System.out.println(removeWhiteSpace(str));

	}
	
	private static String removeWhiteSpace(String str)
    {
        String newStr = str.replaceAll("\\s", "");
        return newStr;
    }

	private static void ReverseEachWord(String str) {
		StringTokenizer token = new StringTokenizer(str, " ");
		String rev = "";
		String reverseWord ="";
		String revSentence = "";

		while (token.hasMoreTokens()) {
			String word = token.nextToken();

			System.out.println(word);
			if (word.length() > 1) {
				for (int i = 0; i < word.length(); i++) {
					
					rev = word.charAt(i) + rev;
					

				}
				revSentence = revSentence + rev + " ";
			} else {
				rev = word + rev;
				revSentence = revSentence + word;}
			rev =   " " + rev;
			
			

		}
		System.out.println("rev string is: " + rev);
		System.out.println("rev sentence is: " + revSentence);

	}

	private static void printEachWordReverse2(String str) {
		// TODO: Also we can use Stacks for this programming question

		String[] arr = str.split(" ");
		String reverse = "";
		String reverseString = "";

		for (int i = 0; i < arr.length; i++) {
			int lengthOfEachWord = arr[i].length();

			for (int j = lengthOfEachWord - 1; j >= 0; j--) {
				reverse = String.valueOf(arr[i].charAt(j));
				System.out.print(reverse);
				reverseString += reverse;
			}

			System.out.print(" ");
		}

	}

	private static void ReverseSentence(String str) {

		StringTokenizer token = new StringTokenizer(str, " ");
		String rev = "";

		while (token.hasMoreTokens()) {
			rev = token.nextToken() + " " + rev;

		}
		System.out.println("rev string is: " + rev);
	}

	private static void printReverseofString(String str) {

		String rev = "";
		str.length();

		/*
		 * for(int i =str.length()-1;i>0;i--) { rev = rev +str.charAt(i); }
		 */

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println("rev string is: " + rev);

	}

}

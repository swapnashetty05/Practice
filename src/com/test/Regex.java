package com.test;

public class Regex {

	public static void main(String[] args) {
		

		String str ="praveena";
	/*	
		int count=0;
		 if(str) {
			 count++;
		 }
		
		System.out.println(count);
		*/
		System.out.println(str.replaceAll("(?i)[*aeiou]", "").length());

	}

}

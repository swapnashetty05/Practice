package com.test;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str = "sssaws";
		System.out.println(nonRepeatedChar(str));

	}

	public static char nonRepeatedChar(String str2) {
		for(int i =0; i<str2.length();i++) {
			char check = str2.charAt(i);
			
			for(int j=1;j<str2.length();j++) {
				if (check!=str2.charAt(j)) {
					return str2.charAt(j);
				}
			}
		}
		return 0;
		
		
		
	}
	
}

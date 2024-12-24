package com.test;

public class ExtractLast4CharactersOfString {

	public static void main(String[] args) {
		
		String str = "swapna";
		System.out.println(str.substring(str.length()-4));
		extract4ch(str);
		System.out.println(str.length());

	}
	
	public static void extract4ch(String str) {
		//return str2.substring(str2.length()-4);
		
	        int size = str.length();
	        int counter = size-4;
	        for(int i = counter; i<size; i++)
	        {
	            System.out.print(str.charAt(i));
	        }
	    }
		
	}



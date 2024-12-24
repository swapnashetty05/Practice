package com.test;

import java.util.StringTokenizer;

public class PrintFirstLetterOfString {

	public static void main(String[] args) {
		{
	        String str = "Hello I am swap";
	        returnFirstAlphabet(str);
	    }
	}
	
	 private static void returnFirstAlphabet(String string)
	    {
	        String word = "";
	        String [] split = string.split(" ");

	        for(int i=0; i<split.length; i++)
	        {
	            word = split[i];

	            System.out.print(word.charAt(0));
	        }
	    }
		
		private static void returnFirstAlphabetswap(String str) {
			
			
			
			StringTokenizer st = new StringTokenizer(
		            str, " ");
			while (st.hasMoreTokens()) {  
				 System.out.println(st.nextToken().charAt(0));
					
				
		        
		     }  
			
			
			
		}

}

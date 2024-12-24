package com.test.leetcode.easy;

import java.util.Arrays;

public class StringAnagram {
	
	static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not
        // same, then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
 

	public static void main(String[] args) {
		
		char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'o', 's' };
 
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
        /*
		String str1 = "listen";
		String str2 = "silent";

		char[] ch1 = str1.toCharArray();

		char[] ch2 = str2.toCharArray();

		if (ch1.length != ch2.length) {
			System.out.println("not anagram");
		}

		Arrays.sort(ch1);

		Arrays.sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) 
				System.out.println("not anagram");

			
			System.out.println(" anagram");
		}
		*/

	}

}

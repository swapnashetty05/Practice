package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PrintWordsVowelsFrequencyofeachCaracter {

	public static void main(String[] args) {
		String str = "SwapnaShetty";
		//printAllCharacters(str);
		frequencyOfchar(str);
	}
	
	private static void frequencyOfchar(String str) {
		
		Map<Character,Integer> freq = new HashMap<>();
		
		for(int i=0; i<str.length();i++) {
			if(freq.containsKey(str.charAt(i))) {
				freq.put(str.charAt(i), freq.get(str.charAt(i))+1);
				
			}
			else {
				freq.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(freq);
		
		
        // Print characters and their
        // frequencies in same order
        // of their appearance
        for (int i = 0; i < str.length(); i++) {

            // Print only if this
            // character is not printed
            // before
            if (freq.get(str.charAt(i)) != 0) {
                System.out.print(str.charAt(i));
                System.out.print(freq.get(str.charAt(i)) + " ");
                freq.put(str.charAt(i), 0);
            }
        }
    }

		
		
	

	private static void printAllCharacters(String str) {

		StringTokenizer token = new StringTokenizer(str, " ");
		char[] vowels = new char[str.length()];
		while (token.hasMoreTokens()) {
			// System.out.println(token.nextToken());
			String str2 = token.nextToken();
			

			for (int i = 0; i < str2.length(); i++) {
				if (str2.charAt(i) == 'a' || str2.charAt(i) == 'A' || str2.charAt(i) == 'e' || str2.charAt(i) == 'E'
						|| str2.charAt(i) == 'i' || str2.charAt(i) == 'I' || str2.charAt(i) == 'o'
						|| str2.charAt(i) == 'O' || str2.charAt(i) == 'u' || str2.charAt(i) == 'U') {
					vowels[i] = str2.charAt(i);

				}
			}

		}
		
		//vowels = vowels.Where(x => !char.IsNullOrEmpty(x)).ToArray();

		System.out.println("vowels are: " + Arrays.toString(vowels));

	}

}

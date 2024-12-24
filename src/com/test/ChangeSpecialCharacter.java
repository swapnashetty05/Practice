package com.test;

public class ChangeSpecialCharacter {

	public static void main(String[] args) {
		
		String str = "Hello @Swap";
		System.out.println(printDifferentSpeicalCharacter(str));
		

	}

	public static String printDifferentSpeicalCharacter(String str2) {
		return str2.replace('@',';');
		
	}
}

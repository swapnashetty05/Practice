package com.test;

public class StringExample {

	public static void main(String[] args) {

		/*String str ="Nixith is Good boy";
		//str = str.substring(2,4);
		//System.out.println(str);
		 
		int s = str.indexOf("n");
		//System.out.println(s);
		
		/*
		if(str.indexOf("good")!= -1){
		String rep = str.replaceAll("good", "Big");
		System.out.println(rep);}
		else System.out.println("wrong");
		*/
		
		String blankRemove = "Nixith is Good boy joy";
		/*System.out.println(blankRemove.trim());
		
		for(int i =1;i<=10;i++) {
			System.out.println("table of "+i);
			for(int j=1;j<10;j++) {
				System.out.println(i + " * "+ j + " = " + i*j);
			}
			System.out.println("---------------");
		}
		
		System.out.println(blankRemove.split(" ").length); 
		*/
		
		
		String org = "swapna";
		String rev ="";
		System.out.println(org + "org");
		char ch;
		
		for(int i=0; i<org.length();i++) {
			ch = org.charAt(i);
			rev = ch +rev;
		}
		System.out.println(rev + "rev");
		
	}

}

package com.test.leetcode.easy;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first num : ");
		int a = sc.nextInt();
		System.out.println("enter sec num : ");
		int b = sc.nextInt();
		System.out.println("enter third num : ");
		int c = sc.nextInt();
		
		//ternary operator
		int largest = a>b?a:b;
		
		largest = largest>c?largest:c;
		
		System.out.println(largest);
		
	}

}

package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given a number in an array form. Write a program to move all zeros to the
		// end.

		int[] arr = { 0, 2, 5, 0, 1, 0, 2, 4, 0, 9, 9, 10 };

		moveZeroesToEnd(arr);

		/*
		 * Issue: exact size should be there in array
		 * 
		 */
		/*
		 * String arr[] = new String[1];
		 * 
		 * arr[0] = "swap";
		 * 
		 * for(String s : arr) { System.out.println(s); }
		 * 
		 * String twoDim[][] = new String[2][2];
		 * 
		 * twoDim[0][0] = "swap"; twoDim[0][1] = "123";
		 * 
		 * twoDim[1][0] = "nix"; twoDim[1][1] = "345";
		 * 
		 * for(int rowNum = 0; rowNum< twoDim.length; rowNum++) {
		 * System.out.println("rownum" + rowNum ); for(int colNum =0; colNum <
		 * twoDim[rowNum].length; colNum++) { System.out.println( twoDim[rowNum][colNum]
		 * ); }
		 * 
		 * }
		 */

		// aslist and toarray
		/*
		 * 
		 * String[] array = {"hi","hello"};
		 * 
		 * List arraylst = Arrays.asList(array);
		 * 
		 * System.out.println(arraylst);
		 * 
		 * ArrayList<String> aL = new ArrayList<>(); aL.add("swap"); aL.add("pk");
		 * aL.add(null);
		 * 
		 * Object[] arrays = aL.toArray(); System.out.println(arrays.length);
		 * 
		 * 
		 * 
		 * //add all even numbers
		 * 
		 * int [] arr = {2,3,6,7,1,0,5,4,12,14,11,2}; String [] ar =
		 * {"swap","hi","swap","shetty"}; int sum =0;
		 * 
		 * 
		 * for(int i=0; i<arr.length;i++) { if(arr[i]%2 ==0) { sum = sum + arr[i]; } }
		 * System.out.println(sum);
		 * 
		 * List<String> al = new ArrayList<>(); al = Arrays.asList(ar);
		 * 
		 * 
		 * 
		 * //count the occurrences of given element in the array
		 * 
		 * System.out.println("The frequency of the  element is: "+
		 * Collections.frequency(al, "swap"));
		 * 
		 */

	}

	private static void moveZeroesToEnd(int[] arr) {
		int[] temp = new int[arr.length];
		int counter = 0;

		for (int x : arr) {
			if (arr[x] != 0) {
				temp[counter] = arr[x];
				counter++;

			}

		}
		for (int x : arr) {
			if (arr[x] == 0) {
				temp[counter] = arr[x];
				counter++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}

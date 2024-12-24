package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		
		/*Given are two ordered lists of sizes 7 and 3. 
		The first list has three vacant spots in the end.
		Merge them in a sorted manner with a minimum number of steps */
		
		//checkArrayList();
		checkArray();
		geekForGeek();
			

	}
	
	private static void checkArray() {
		int [] a1 = new int[4];
		int [] a2 = new int[3];
		
		a1[0] =2;
		a1[1] =5;
		a1[2] =3;
		a1[3] =1;
		a2[0] =9;
		a2[1] =6;
		a2[2] =4;
		System.out.println(a1.length + a2.length);
		
		int[] merge = new int[a1.length + a2.length];
	for(int i:a1) {
		merge[i] = a1[i];
	}
	int a1size = a1.length-1;
	for(int i:a2) {
		merge[a1size+i] = a2[i];
	}
	System.out.println(Arrays.toString(merge));	
	}
	
	private static void geekForGeek() {
		 {

		        // first array
		        int a[] = { 30, 25, 40 };
		      
		        // second array
		        int b[] = { 45, 50, 55, 60, 65 };

		        // determining length of first array
		        int a1 = a.length;
		      
		        // determining length of second array
		        int b1 = b.length;

		        // resultant array size
		        int c1 = a1 + b1;

		        // Creating a new array
		        int[] c = new int[c1];

		        // Loop to store the elements of first
		        // array into resultant array
		        for (int i = 0; i < a1; i = i + 1) {
		          
		            // Storing the elements in 
		            // the resultant array
		            c[i] = a[i];
		        }

		        // Loop to concat the elements of second 
		        // array into resultant array
		        for (int i = 0; i < b1; i = i + 1) {

		            // Storing the elements in the 
		            // resultant array
		            c[a1 + i] = b[i];
		        }

		        System.out.println("Result = " + Arrays.toString(c));
		    }
		}
	
	
	private static void checkArrayList() {
		/*
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(100);
		l1.add(5);
		
		l1.add(6);
		l1.add(null);
		l1.add(null);
		l1.add(null);
		Collections.sort(l1);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(569);
		l2.add(77);
		Collections.sort(l1);
		
		ArrayList<Integer> merge = new ArrayList<>();
		
		for(int l:l1) {
			//if(l== null) {
				merge.addAll(l1);
			}
		}
		
	//	merge.addAll(l1);
	//	merge.addAll(l2);
}
		System.out.println(merge);
	
		}*/
		}
}

package com.test.leetcode.easy;

import java.util.ArrayList;

public class MergeArrays {

	public static void main(String[] args) {

		//Given are two ordered lists of sizes 7 and 3. 
		// The first list has three vacant spots in the end.
		// Merge them in a sorted manner with a minimum number of steps
		
		ArrayList <Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(null);
		al.add(null);
		al.add(null);
		
		int alsize = al.size();
		
		ArrayList <Integer> a2 = new ArrayList<>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		
		int a2size = a2.size();
		
		ArrayList<Integer> merge = new ArrayList<>();
		 
		for(int i =0; i<alsize ; i++) {
			if(al.get(i)!= null) {
				merge.add(al.get(i));
			}
			
		}
		
		merge.addAll(a2);
		
		System.out.println(merge);
		
		
		
		

	}

}

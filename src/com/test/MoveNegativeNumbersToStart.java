package com.test;

import java.util.Arrays;

public class MoveNegativeNumbersToStart {

	public static void main(String[] args) {
		{
	        int [] arr = {-1,2,3,-4,-7,8};
	        moveNegativeNumbersTOStart(arr);
	    }

	}
	
	public static void moveNegativeNumbersTOStart(int [] arr) {
		
		int [] negArr = new int [arr.length] ;
		int counter =0;
		
		for(int i = 0; i< arr.length -1; i++) {
			if(arr[i]<0) {
				negArr[counter] = arr[i];
				counter++;
				
			}
		}
		
		for(int i = 0; i< arr.length -1; i++) {
			if(arr[i]>0) {
				negArr[counter] = arr[i];
				counter++;
				
			}
		}
		System.out.println(Arrays.toString(negArr));

	}
	
	

}

package com.test;

public class FindMaximumDifference {

	public static void main(String[] args) {
		 {
		        int [] arr = {10,90,2,40,1,25};
		        printMaximumDifference2(arr);
		    }

	}
	
	 private static void printMaximumDifference(int [] arr)
	    {
	        //Approach find greatest and smallest number in java and then subtract it.
	        int max = arr[0];
	        int min = arr[0];

	        for(int i=0; i<arr.length; i++)
	        {
	            if(arr[i] > max)
	            {
	                max = arr[i];
	            }

	            else if (arr[i] < min)
	            {
	                min = arr[i];
	            }
	        }

	        //Now once we get max and min from the array by iteration now we can perform the subtraction and //TODO: get Maximum Difference

//	        int difference = max-min;
//	        System.out.print("Max Difference is: "+difference);
	        //or
	        System.out.print("Max Difference is: "+ (max-min));
	    }

	
	public static void printMaximumDifference2(int [] arr) {
		/*
		int maxDiff = 0;
		int first = arr[0];
		int second = arr[1];
		
		for(int i =0; i < arr.length-1;i++) {
			
			if(maxDiff < (arr[i]-arr[i+1])) {
				maxDiff = arr[i]-arr[i+1];
				
			}
			
		}
		
		System.out.println(maxDiff);
	
	*/
		
		int max = arr[0];
		int min =arr[0];
		
		for(int i =0; i < arr.length;i++) {
			
			if(max <arr[i]) {
				max = arr[i];
				
				
			}
			
			else if(min > arr[i]) {
				min = arr[i];
				
			}
			
		}
		System.out.println(max - min);
	}

}

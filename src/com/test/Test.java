package com.test;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Lets start Automation");
		
		int[] max = {2,4,32,67,34};
		
		int highest_marks = maximum(max); 
        System.out.println("The highest score is " + highest_marks); 
        
        

	}
	  public static int maximum(int[] numbers) 
	    {  
	        int maxSoFar = numbers[0]; 
	          
	        
	     
	        // for each loop 
	        for (int num : numbers)  
	        { 
	            if (num > maxSoFar) 
	            { 
	                maxSoFar = num; 
	            } 
	        } 
	    return maxSoFar; 
	    } 

}

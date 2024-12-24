package com.test;

public class FirstAndFinalOccurrence {

	public static void main(String[] args) {

		int[] list = {1,2,8,3,4,5,5,7,2,7};
		int firstocc = 0;
		int lastOcc =0;
		int element = 7;
		
		
		

		for (int i = 0; i < list.length; i++) {
			for(int j =i+1;j<list.length ; j++) {
				 if((firstocc ==0)&&(list[i] == element)) {
					firstocc = i;
				}
				else if((firstocc !=0)&&(list[j] == element)) {
					lastOcc = i;
				}
			}
         
		}
		System.out.println("firstocc: "+ firstocc + "lastOcc : " + lastOcc);

	}

}

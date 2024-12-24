package com.test.interviewPrac;

public class Comparision {

	public static void main(String[] args) {
		
		String x = "Hello";
		String y = "Hello";
		String z = "Hello1";
		System.out.println(x==y);
		System.out.println(y==z);
		
		System.out.println(x.equals(y));
		
		A a1 = new A();
		A a2 = new A();
		a1.i = 100;
		a2.i = 100;
		System.out.println(a1.i == a2.i);
		System.out.println(a1==a2);//objects are compared...whether it is pointing to same ref
		

		System.out.println(a1.equals(a2));
		
		String x2[] = new String[2];
		char c[] = new char[2];
		x2[0] = "swap"; 
	}
	
	

}
class A{
	int i;
	
	public boolean equals(Object o) {
		System.out.println("check");
		return false;
		
	}
}

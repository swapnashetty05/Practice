package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8 {

	public static void main(String[] args) {
		
		//stream example
		
		List<String> listStr= new ArrayList<String>();
		listStr.add("swap");
		listStr.add("pk");
		listStr.add("nixu");
		listStr.add("vishu");
		listStr.add("shetty");
		
		List<String> filteredList = listStr.stream().filter(e-> (e.startsWith("s"))).collect(Collectors.toList());
		System.out.println("output filter: " +filteredList);
		
	}

}

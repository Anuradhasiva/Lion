package com.java;

public class StringFunctions {
public static void main (String[] args) {    
		
		String g = "Welcome to Chennai";
		
		

		String trim = g.trim();
		System.out.println(trim);
		
		String[] split = g.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		int compare = g.compareTo("Welcome to Chennai");
		System.out.println(compare);

		String concat = g.concat("Railway Station");
		System.out.println(concat);

	}
	
	

}

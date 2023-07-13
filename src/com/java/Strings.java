package com.java;

public class Strings {
	public static void name(String[] args) {
		String g = "Welcome to Chennai";
		
		String[] split = g.split(" ");
		for (int i=0; i < split.length; i++) {
		System.out.println(split[i]);
		}
		
	}

}

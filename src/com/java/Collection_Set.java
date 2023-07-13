package com.java;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
	public static void main(String[] args) {
		
		//Set <Integer> hs = new HashSet <Integer>();
		
		Set <Integer> hs = new TreeSet <Integer>();
		hs.add(20);
		hs.add(30);
		hs.add(56);
		hs.add(90);
		hs.add(80);
	    hs.add(90);
		hs.add(40);
		System.out.println(hs);
		hs.add(50);
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		hs.remove(90);
		System.out.println(hs);
		
		boolean contains = hs.contains(20);
		System.out.println(contains);
		
		System.out.println(hs.isEmpty());
		
		//System.out.println(hs.equals(hs));
		
		hs.clear();
		System.out.println(hs);
		
	}

}

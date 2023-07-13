package com.java;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		System.out.println("==List Topic==");
		List<Integer> li = new ArrayList <Integer>();
		li.add(20);
		li.add(30);
		li.add(56);
		li.add(90);
		li.add(90);
		System.out.println(li);
		
		System.out.println(li.add(116));
		
		System.out.println(li.get(3));
		
		System.out.println(li.indexOf(56));
		
		List<Integer> le = new ArrayList <Integer>();
		le.add(26);
		le.add(39);
		le.add(57);
		le.add(98);
		le.add(90);
		System.out.println(le);
		li.addAll(le);
		
		System.out.println(li);
		le.retainAll(li);
		
		System.out.println("Before Remove All"+ li);
		
		li.removeAll(le);
		System.out.println("After Remove All"+ li);
		
		
		System.out.println(li.contains(90));
		
		li.set(2, null);
		System.out.println(li);
		
		li.isEmpty();
		System.out.println(li);
		
		li.clear();
		System.out.println(li);
		
		li.equals(le);
		System.out.println(li);
	}

}

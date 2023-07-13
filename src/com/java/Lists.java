package com.java;

import java.util.LinkedList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
	    List <Integer> l = new LinkedList <Integer>();
	    l.add(30);
	    l.add(34);
	    l.add(99);
	    System.out.println(l);
	    System.out.println(l.size());
	    System.out.println(l.get(0));
	    l.set(0, 77);
	    System.out.println(l);
	    l.remove(1);
	    System.out.println(l);
	    System.out.println(l.indexOf(99));
	    System.out.println(l.contains(80));
	    l.addAll(l);
	    System.out.println(l);
	    l.retainAll(l);
	    System.out.println(l);
	    l.clear();
	    System.out.println(l);
	}

}

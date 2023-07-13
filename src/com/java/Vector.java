package com.java;

import java.util.List;

public class Vector {
	public static void main(String[] args) {
		System.out.println("==List Topic==");
		VectorList<Byte> li =  new Vector <Byte>();
		li.addAll(20);
		li.addAll(30);
		li.addAll(56);
		li.addAll(90);
		li.addAll(90);
		System.out.println(li);
		
		System.out.println(li.get(3));
		
		System.out.println(li.indexOf(56));
		
	}

}

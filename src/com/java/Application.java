package com.java;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		java.util.Scanner s = new Scanner (System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your last name");
		String lName = s.next();
		System.out.println(lName);
	}

}

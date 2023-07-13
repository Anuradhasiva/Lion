package com.java;

import java.util.Scanner;

public class Expection {
	public static void main(String[] args) {
		try {
			System.out.println(110/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner u = new Scanner (System.in);
		System.out.println("Enter your name");
		u.nextLine();
		u.next().charAt(3);
	}

}

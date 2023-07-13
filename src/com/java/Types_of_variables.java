package com.java;

public class Types_of_variables {
	static String Office = "NLC";
	public static void plant(String Name, int Salary) {
		System.out.println(Office);
		System.out.println("Employee Name:" + Name);
		
		System.out.println("Salary details:" + Salary);
	}
	public static void main (String[] args) {
		plant("Anu",15000);
		System.out.println();
		plant("Arun",20000);
	}

}

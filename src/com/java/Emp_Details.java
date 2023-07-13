package com.java;

public class Emp_Details {
	public Emp_Details() {
		// TODO Auto-generated constructor stub
		this(95);
		System.out.println("I am default constructor");
	}
	public Emp_Details(int id) {
		// TODO Auto-generated constructor stub
		this("anu");
		System.out.println("Emp Id is:"+ id);
	}
	public Emp_Details(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("It is a parameter constructor");
		System.out.println("Emp Name is:" + name);
	}	
	public static void main (String[] args) {
		Emp_Details l = new Emp_Details();
	}

}

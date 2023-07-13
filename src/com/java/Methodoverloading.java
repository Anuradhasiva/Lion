package com.java;

public class Methodoverloading {
	
	void stu_Detail(String name) {
			System.out.println(name);
		}
	void stu_Detail(int rollno) {
		System.out.println(rollno);
	}
	public static void main(String[] args) {
		Methodoverloading m = new Methodoverloading();
		m.stu_Detail("Anu");
		m.stu_Detail(3456);
	}
}
	



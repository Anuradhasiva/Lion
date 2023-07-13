package com.java;
class tree{
void payment() {
	System.out.println(2000);
}
}
class method extends tree{
void payment() {
	System.out.println(4555);
}
}
public class Methodoverridding {
	
	public static void main(String[] args) {
		method m = new method();
		m.payment();
	}
}


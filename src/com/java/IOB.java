package com.java;

public class IOB implements Employee1, Employee2 {
	public void personalloan () {
	System.out.println("56%");
	}
	public void eduloan () {
		System.out.println("26%");
		}
	public void carloan () {
		System.out.println("23%");
		}
	public void houseloan () {
		System.out.println("32%");
		}
	public static void main (String[] args) {
		IOB i = new IOB ();
		i.personalloan();
		i.eduloan();
		i.houseloan();
		i.carloan();
	}

}

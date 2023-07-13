package com.java;

public class Loops_for {
	public static void main(String[] args) {
	  for(int i=1; i<=3; i++) {
		  for(int j=1; j<=i; j++) {
			  System.out.print("*"+" ");
			 }
		  System.out.println();
	         }
	  for(int a=1; a<=3; a++) {
		  for(int k=3; k>=a; k--) {
			  System.out.print("*"+" "); 
		  }
		  System.out.println();
	  }
	}

}

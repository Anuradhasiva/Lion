package com.newjava;

public class Armstrong {
	public static void main(String[] args) {
		int a = 15;
		int temp = a;
		int sum = 0;
		while(a>0) {
			int rem = a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	
	}
		

}

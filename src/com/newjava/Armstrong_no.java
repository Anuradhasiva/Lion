package com.newjava;

public class Armstrong_no {
	public static void main(String[] args) {
//		int a =1;
//		int b= 1000;
		
		
		for(int i=1; i<1000; i++) {
			int temp = i;
			int sum =0;
			
			while(temp>0) {
			int rem = temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
			}
			if(i==sum) {
				System.out.println(sum);
			}
			
			
		}
	}

}

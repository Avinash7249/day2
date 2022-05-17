package com.masai;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
		
		
		if(n==1||n>100) {
			System.out.println("Invalid Number");
		}else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		}
	}
}

package com.program;

import java.util.Scanner;

public class PalindromeNumber {

	
	private  static void palindromMethod() {
		
	int n = 123;
	int r;
	int s = 0;         //n  r  s
	                  // 12 3 3 
	int temp = n;    //   1 2 32
	                 //  0  1 321  
	while (n>0) {
		r= n%10;
		s=s*10+r;
		n=n/10;
			
	}
	if (temp==s) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("not");
	}
		
	}
	
	public static void main(String[] args) {
		System.out.println("enter the no");
		palindromMethod();
	}
	
}

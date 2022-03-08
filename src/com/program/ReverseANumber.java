package com.program;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
         
		
		int givenNumber=0;
		 
		int reversedNumber=0;
		
		System.out.println("Enter the Number:");
		
		Scanner sc= new Scanner(System.in);
		givenNumber = sc.nextInt();
		
		while (givenNumber!=0) {
			
		reversedNumber=reversedNumber*10;
		reversedNumber=reversedNumber+givenNumber%10;
		givenNumber=givenNumber/10;
		
		}
	System.out.println(reversedNumber);	
	}
	
	

}

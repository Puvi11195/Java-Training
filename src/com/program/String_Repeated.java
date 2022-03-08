package com.program;

import java.util.Iterator;

public class String_Repeated {
	
	
	
	
	public static void main(String[] args) {
		String s = "starc";
		 String temp ="";
		 
		 for (int i = s.length()-1; i>=0; i--) {
			 
			 char c = s.charAt(i);
			 temp=temp+c;
			
		}
		
		System.out.println(temp);
		
		
	}

}

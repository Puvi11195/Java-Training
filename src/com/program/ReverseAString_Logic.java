package com.program;

import java.util.Iterator;

public class ReverseAString_Logic {
	
	public static void main(String[] args) {
		 
		String given ="Okalahoma";
		
		char[] charArray = given.toCharArray();//Converts this string to a new character array.
		
		String reversed = "";
		
	for (int i = charArray.length-1;i>=0;i--) {
		
		reversed=reversed+charArray[i];
		
	}
		
	System.out.println(reversed);	
		
		
		
	}  

}

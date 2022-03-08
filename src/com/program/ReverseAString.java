package com.program;

public class ReverseAString {//no reverse function for string
	
	
	public static void main(String[] args) {
		
		
	String name ="Okalahoma";
	 
	StringBuffer buffer=new StringBuffer();
	
	buffer.append(name);
	
	StringBuffer reverse = buffer.reverse();
	
	System.out.println(reverse);
	
	}

}

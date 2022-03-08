package com.program;

public class ArmsstrongNumber {
	
	public static void main(String[] args) {
		
		
		
		int r, s = 0,t;
		
		int n = 153;
		     t=n;
		     
		     while (n>0) {
		    	 
		    	 r=n%10;
		    	 s=s+(r*r*r);
		    	 n=n/10;
				
			}
		     if (t==s) {
		    	 System.out.println("Armstrong");
				
			} else {
				System.out.println("Not");

			}
		
	
	}
}

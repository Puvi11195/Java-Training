package com.program;

public class Swap_TwoNumbers {
	
	
		
	public void withThirdVariable() {
		
	int mySalary = 20;
	
	int superiorSalary = 50;
	
	System.out.println("Before swapping" + "mine:"+ mySalary+"superior:" + superiorSalary  );
	
	int temp=mySalary;
	
	mySalary=superiorSalary;
	
	superiorSalary=temp;
	
	System.out.println("After swapping" + "mine:"+mySalary+"superior:" + superiorSalary  );

	}
	public  static void withoutThirdVariable() {
		
		int first = 20; int second = 60;
		System.out.println("Before swapping" + "mine:"+ first+"superior:" + second );
		
		
		
		/* first=first-second; second=first+second; first=second-first; */
		 		 
		
		first=first*second;
		second=first/second;
		first=first/second;
		
		System.out.println("Before swapping" + "mine:"+ first+"superior:" + second );
		
	}
	
	public static void main(String[] args) {
		withoutThirdVariable();
	}
}

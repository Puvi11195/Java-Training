package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString_Collection {
	public static void main(String[] args) {
		
		String given = "Dharmasala";
		
		char[] charArray = given.toCharArray();
		
		
		List<Character>list = new ArrayList<Character>();
		
		for (Character character : list) {
			
			list.add(character);
			
			}
		Collections.reverse(list);
		
		ListIterator<Character> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next());
			
		} 
		
		
		
		
	}

}

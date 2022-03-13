package com.cg.lokeshjava8features.streamapiexample;

import java.util.ArrayList;
import java.util.List;


public class ArrayList {
	
	public static void main(String[] args) {
		
		List<String> integer = new ArrayList<String>();
		integer.add("123");
		integer.add("234");
		
		String int = integer.get(1);
		System.out.println(int);
		
		int size = integer.size();
		
		System.out.println("The size of the ArrayList is: %d%n",size);
		
		
		
	}

}

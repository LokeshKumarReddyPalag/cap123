package com.cg.lokeshjava8features.streamapiexample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArraySortingUsingStreamAPI {
	
	public static void main(String[] args) {
		
		//create an int array
		int[] values = new int[] {9,8,6,5,4,3,2};
		Arrays.sort(values);
		Arrays.stream(values).forEach(System.out::println);

	}
	
}

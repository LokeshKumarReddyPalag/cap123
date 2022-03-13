package com.cg.m1;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Input the first number :");
		int a = in.nextInt();
		System.out.println("Input the second number :");
		int b = in.nextInt();
		System.out.println("Result: "+result(a,b));

	}
    public static int result(int x,int y) {
    	
    	if(x == y)
    		return 0;
    	if(x % 5 == y% 5)
    		return(x < y) ? x:y;
    	return(x > y) ? x:y;
    	
    }
}

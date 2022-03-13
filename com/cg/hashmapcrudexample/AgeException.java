package com.cg.hashmapcrudexample;

public class AgeException extends Exception {
	
	public AgeException(String str) {
		
		System.out.println(str);
	
   
   public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int age = s.nextlnt();
	   
	   try {
		   if(age <18) {
			   throw new AgeException("invalid age");
		   }
		       else
		       {
		    	   System.out.println("Valid age");
		       }
			   
                   catch(AgeException a) {
                	   System.out.println(a);
                   }
   }
   

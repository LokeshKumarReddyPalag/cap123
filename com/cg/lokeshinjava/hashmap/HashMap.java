package com.cg.lokeshinjava.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap {

	public static void main(String[] args) {
		
		HashMap<String,Float> studentdetails = new HashMap<String, Float>();
		studentdetails.put("surya", 50.3f);
	    studentdetails.put("Puru"  60.5f);
		studentdetails.put("Lohit"  80.6f);
		 System.out.println(studentdetails);
		 
		 Set<String>studentdetails_keys=studentdetails.keyset();
		 System.out.println("-----");
		 for(String a :studentdetails_keys) {
			 System.out.println(a);
			 
		 }
		 
		 Collection<Float>studentdetails_values=studentdetails.Values();
		 System.out.println("-----");
		 for(Float p:studentdetails_values) {
			 System.out.println(p);
			 
			 
		 }
		 
		 
		 Collection<Entry<String,Float>> studentdetails_entryset = studentdetails.entryset;
		 System.out.println("------");
		 for(Entry<String,Float> k:studentdetails.entrySet()) {
			 System.out.println(k);
			 
		
	        }
		
		 
		 Collection<average marks<String,Float>> studentdetails_average marks = 
	        
		
		
		
		

	}

}

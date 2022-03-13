package com.cg.lokeshinjava.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	

		   
	
	   public static void main(String [] args) {
	
	HashMap<String,Float> employeeDetails = new HashMap<String,Float>();
	  employeeDetails.put("12345", 50.0f);
	  employeeDetails.put("Lokesh", 60.0f);
	  employeeDetails.put("10000", 84.0f);
	  employeeDetails.put("Civil", 64.5f);
	  employeeDetails.put("Analyst", 45.4f);
	  
	  Collection<Float> employee_id = employeeDetails.values();
	           float sum=50.0f;
	           for(Float id : employee_id) {
	        	   sum = sum + id;
	        	   
	           }
	   Collection<Float> employee_name = employeeDetails.values();
	           float sum =50.0f;
	           for(float name : employee_name) {
	        	   sum = sum + name;
	           }
	           
	    Collection<Float> employee_salary = employeeDetails.values();
	            float sum = 10000;
	            for(float salary : employee_salary) {
	            	sum = sum + salary;
	            
	            }
	     
	     Collection<Float> employee_department = employeeDetails.values();
	             float sum = civil;
	             for(float department : employee_department) {
	            	 sum = sum + department;
	             }
	             
	     Collection<Float> employee_designation = employeeDetails.values();
	             float analyst = analyst;
	             for(float designation : employee_designation) {
	            	 sum = sum + designation;
	             }
	              float employee_avg = sum/employee_id.size();
	                  System.out.println("Average of employee in HashMap = " + employee_avg);
	              
	  		      float employee_avg = sum/employee_name.size();
	                  System.out.println("Average of employee in HashMap = " + employee_avg);
	              
		          float employee_avg = sum/employee_salary.size();
		               System.out.println("Average of employee in HashMap =" + employee_avg);
		               
		          float employee_avg = sum/employee_department.size();
		               System.out.println("Average of employee in HashMap =" + employee_avg);
		               
		          float employee_avg = sum/employee_designation.size();
		               System.out.println("Average of employee in Hashmap =" + employee_avg);
		               
		               TreeSet<Float>sorted_employee = new TreeSet<Float>();
		               sorted_stdMarks.addAll(std_Marks);
		               
		                        System.out.println("Maximum marks of students in HashMap =" + sorted_employeeMarks.last());
		                        
		               Set<String> student_Names = stdDetails.keySet();
		               
		               TreeSet<String>sorted_employeeDetails = new TreeSet<String> ();
		               sorted_employeeNames.addAll(Employee _Names);
		                        System.out.println("Names Sorted using TreeSet.....");
		                        for(String employee_name : sorted_employeeNames) {
		                        	
		                        }
		               
		
		
	}

}

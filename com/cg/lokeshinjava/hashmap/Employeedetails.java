package com.cg.lokeshinjava.hashmap;

public class Employeedetails {
	
	int empID;
	String empname;
	float empAge;
	String empDepartment;
	String empdesignation;
	public Employeedetails() {
		
	}
	public Employeedetails(int empID,String empname,float empAge,String empDepartment, String empdesignation){
		
	
	  super();
	  this.empID = empID;
	  this.empname = empname;
	  this.empAge = empAge;
	  this.empDepartment = empDepartment;
	  this.empdesignation = empdesignation;
}
 
    public int getempId() {
    	return empID;
    }
    
    public void setempId(int empId) {
    	this.empID = empId;
    	
    }
	 
    public String getempname() {
    	return empname;
    }
    
    public void setempname(String empname) {
    	this.empname = empname;
    }

    public float getempAge() {
    	return empAge;
    	
    }
    
    public void setempAge(float empAge) {
    	this.empAge = empAge;
    }
    
    public String getempDepartment() {
    	return empDepartment;
    	
    	
    }
    
    public void setempDepartment(String empDepartment) {
    	this.empDepartment = empDepartment;
    }
    
    public String getempdesignation() {
    	return empdesignation;
    }
    
    public void setempdesignation(String empdesignation) {
    	this.empdesignation = empdesignation;
    }
  

    public String toString() {
    	return "Employeedetails [empId = " +empID + ",empname=" +empname+",empAge=" +empAge+",empDepartment=" +empDepartment+",empdesignation=" +empdesignation +"]";
    }
}


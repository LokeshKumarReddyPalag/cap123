package com.cg.oopsinjava.inheritance;

public class PermanentEmployee  {
	
	float salaryPerMonth;
	float totalSalaryPerMonth;
	float noOfDaysWorked;
	
	void readSalaryPerMonth() {
		System.out.println("Enter the salary per hour");
		salaryPerMonth = sc.nextFloat();
		
	}
	
	void readOfDaysWorked() {
		System.out.println("Enter the noOfHourWorked");
		noOfDaysWorked = sc.nextFloat();
		
	}

	void calcualteSalary() {
		totalSalaryPerMonth = (salaryPerMonth/30) *noOfDaysWorked;
		System.out.println("Total Salary For a week =" +totalSalaryPerMonth);
	}
}

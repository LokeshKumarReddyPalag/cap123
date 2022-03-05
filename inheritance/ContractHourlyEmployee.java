package com.cg.oopsinjava.inheritance;

import java.util.Scanner;

public class ContractHourlyEmployee {
	
	float noOfYears_Contract;
	float noOfYears_Completed;
	Scanner sc = new Scanner (System.in);
	
	void readNoOfYears_Contract() {
		System.out.println("Enter the noOfYears_Contract");
		noOfYears_Contract = sc.nextFloat();
		
	}
	
	void isContractedCompleted() {
		if(noOfYears_Completed ==noOfYears_Contract) {
			System.out.println("contract completed");
			
		}else {
			System.out.println("contract not completed");
		}
	}

}

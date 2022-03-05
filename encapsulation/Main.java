package com.cg.oopsinjava.encapsulation;

import java.util.Scanner;

public class Main {
	
	int sellerId;
	String sellerName;
	
	Scanner sc = new Scanner(System.in);
	
	void readSellerDetails() {
		System.out.println("Enter the Seller Details");
		System.out.println("Enter the Seller Id....");
		sellerId = sc.nextInt();
		System.out.println("Enter the Seller Nmae...");
		sc.nextLine();
		sellerName = sc.nextLine();
	}
	
	void printSellerDetails() {
		System.out.println("The seller Details.....");
		System.out.println("Seller Id = " +sellerId);
		System.out.println("Seller Name =" +sellerName);
	}
	
	

}

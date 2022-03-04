package com.cg.oopsinjava.encapsulation;

import java.util.Scanner;

public class Seller {
	
	int sellerId;
	String sellerName;
	
	Scanner sc = new Scanner(System.in);
		
		void readSellerDetails() {	
			System.out.println("Enter the seller Details");
			sellerId = sc.nextInt();
			System.out.println("Enter the Seller Name");
			sc.nextLine();
			sellerName = sc.nextLine();
	}
		void printSellerDetails() {
			System.out.println("The Seller Details......");
			System.out.println("Seller Name =" +sellerId);
			System.out.println("Seller Name = " +sellerName);
			
			
			
		}
	
	

}

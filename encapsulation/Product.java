package com.cg.oopsinjava.encapsulation;

import java.util.Scanner;

public class Product {
	
	int productId;
	String productName;
	ClassSeller seller = new ClassSeller();
	Scanner sc = new Scanner(System.in);
	
	
	void readproductDetails() {
		System.out.println("Enter the product Details");
		System.out.println("Enter the product Id.....");
		productId = sc.nextInt();
		System.out.println("Enter the product Name....");
		sc.nextLine();
		productName = sc.nextLine();
		
		
	}
	void printproductDetails()  {
		System.out.println("The product Details....");
		System.out.println("product Id = " +productId);
		System.out.println("product Name = " +productName);
		seller.printSellerDetails();
	}
	

}

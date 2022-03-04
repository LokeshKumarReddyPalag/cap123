package com.cg.oopsinjava.encapsulation;

import java.util.Scanner;

public class Product {
	
	int productId;
	String ProductName;
	
	Scanner sc = new Scanner(System.in);
	
	void readProductDetails() {
		System.out.println("Enter the product Details");
		productId = sc.nextInt();
		System.out.println("Enter the Seller Name");
		sc.nextLine();
		productName = sc.nextLine();
		
	}
	
	
	
	

}

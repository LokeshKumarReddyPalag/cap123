package com.cg.lokeshjava8feature.methodreferenceexample;

public class ConstructorReferenceExample {
	
	public static void main(String[] args) {
		DataBase db = DBConnection::new;
		System.out.println(db);
		db.getDBDetails("connection to DB");

    }
	
}

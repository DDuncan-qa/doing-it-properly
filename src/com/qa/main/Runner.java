package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// two object - new instances of Customer.java 
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
	
	// i want:
	// customer1 should be called Dennis
	// customer2 should be called Jeff
	
	customer1.setName("Dennis");
	customer2.setName("Jeff");
	
	customer1.setBirthday(9);
	customer2.setBirthday(12);
	
	customer1.setbirthMonth("May");
	customer2.setbirthMonth("December");
	
	System.out.println(customer1.getName());
	System.out.println(customer2.getName());
	
	System.out.println(customer1.getBirthday());
	System.out.println(customer2.getBirthday());
	
	System.out.println(customer1.getbirthMonth());
	System.out.println(customer2.getbirthMonth());
	
	
	}
	
	

}

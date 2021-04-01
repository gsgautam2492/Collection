package com.techstack.training.collections;

import java.util.*;

class Address_Book {

	String fname;
	String lname;
	String address_Line1;
	String city;
	String state;
	String zip_Code;
	String phone_no;
	String email;

	/**
	 * @param fname
	 * @param lname
	 * @param address_Line1
	 * @param city
	 * @param state
	 * @param zip_Code
	 * @param phone_no
	 * @param email
	 */
	public Address_Book(String fname, String lname, String address_Line1, String city, String state, String zip_Code,
			String phone_no, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address_Line1 = address_Line1;
		this.city = city;
		this.state = state;
		this.zip_Code = zip_Code;
		this.phone_no = phone_no;
		this.email = email;
	}

}

public class Address_Book_Demo {
	public static void main(String[] args) {
		LinkedHashSet<Address_Book> hs = new LinkedHashSet<Address_Book>();
		// Creating Books
		Address_Book b1 = new Address_Book("Gautam", "Sharma", "Apt 123", "New Delhi", "Delhi", "110045", "9911234777",
				"xyz@gmail.com");
		Address_Book b2 = new Address_Book("Garvit", "Mangal", "Apt 456", "New Delhi", "Delhi", "110045", "9911350877",
				"abc@gmail.com");
		Address_Book b3 = new Address_Book("Gautam", "Sharma", "Apt 123", "New Delhi", "Delhi", "110045", "9911350878",
				"ab123@gmail.com");
		// Adding to Address_Book objects to Linked hash set
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		// Traversing Linked hash set
		System.out.println("Welcome to Address Book Program \n \n");
		for (Address_Book b : hs) {
			System.out.println(b.fname + " " + b.lname + " " + b.address_Line1 + " " + b.city + " " + b.state + " "
					+ b.zip_Code + " " + b.phone_no + " " + b.email);
		}
	}
}
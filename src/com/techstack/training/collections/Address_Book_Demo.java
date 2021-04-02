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

	public Address_Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address_Book [fname=" + fname + ", lname=" + lname + ", address_Line1=" + address_Line1 + ", city="
				+ city + ", state=" + state + ", zip_Code=" + zip_Code + ", phone_no=" + phone_no + ", email=" + email
				+ "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress_Line1() {
		return address_Line1;
	}

	public void setAddress_Line1(String address_Line1) {
		this.address_Line1 = address_Line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip_Code() {
		return zip_Code;
	}

	public void setZip_Code(String zip_Code) {
		this.zip_Code = zip_Code;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class Address_Book_Demo {
	public static void main(String[] args) {
		LinkedHashSet<Address_Book> hs = new LinkedHashSet<Address_Book>();
		// Creating Books
		/*
		 * Address_Book b1 = new Address_Book("Gautam", "Sharma", "Apt 123",
		 * "New Delhi", "Delhi", "110045", "9911234777", "xyz@gmail.com"); Address_Book
		 * b2 = new Address_Book("Garvit", "Mangal", "Apt 456", "New Delhi", "Delhi",
		 * "110045", "9911350877", "abc@gmail.com"); Address_Book b3 = new
		 * Address_Book("Gautam", "Sharma", "Apt 123", "New Delhi", "Delhi", "110045",
		 * "9911350878", "ab123@gmail.com");
		 */
		// Adding to Address_Book objects to Linked hash set
		System.out.println("Welcome to Address Book Program \n \n");
		Scanner keyboard = new Scanner(System.in);
		String loopCheck = "";
		while (!loopCheck.equals("N")) {
			Address_Book b1 = new Address_Book();
			System.out.print("Please enter fname: ");
			String fname = keyboard.nextLine(); // local variable
			b1.setFname(fname);
			System.out.print("\nPlease enter lname: ");
			String lname = keyboard.nextLine();
			b1.setLname(lname);
			System.out.print("\nPlease enter addressLine1: ");
			String addressLine1 = keyboard.nextLine();
			b1.setAddress_Line1(addressLine1);
			System.out.print("\nPlease enter city: ");
			String city = keyboard.nextLine();
			b1.setCity(city);
			System.out.print("\nPlease enter state: ");
			String state = keyboard.nextLine();
			b1.setState(state);
			System.out.print("\nPlease enter zip: ");
			String zip = keyboard.nextLine();
			b1.setZip_Code(zip);
			System.out.print("\nPlease enter phone: ");
			String phone = keyboard.nextLine();
			b1.setPhone_no(phone);
			System.out.print("\nPlease enter email: ");
			String email = keyboard.nextLine();
			b1.setEmail(email);
			hs.add(b1);
			System.out.print("\nDo you want to continue:(Y/N) ");
			loopCheck = keyboard.nextLine();
		}
		// Traversing Linked hash set
		for (Address_Book b : hs) {
			// System.out.println(b.fname + " " + b.lname + " " + b.address_Line1 + " " +
			// b.city + " " + b.state + " "
			// + b.zip_Code + " " + b.phone_no + " " + b.email);
			System.out.println(b.toString());
		}
		// Printing whole Linked hash set
		System.out.println("\n \n" + hs.toString());
	}

}
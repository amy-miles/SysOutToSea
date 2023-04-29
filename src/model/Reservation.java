package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

/**************************************************************
* Name        : Final Project
* Author      : Amy Miles
* Created     : Apr 8, 2023
* Course      : CIS 152 Data Structures
* Version     : 20H2
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This project simulates a system to reserve a boat.
* 				A Boat object, from the Boat class,  has a linked list of reservation objects. 
* 				The reservation class has a linked list of person objects
* 				from the Person class.
* Big O		  : O(n)
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
/*
 * This class creates the reservation. Each reservation is added to the Boat class
 * in it's manifest linked list. 
 */
public class Reservation {
	
	private LinkedList<Person> party;//for list of people objects
	private int count;
	private String phone;
	private String resName;		
	
	/**
	 * This constructor creates a reservation object with a telephone number as param
	 * It creates a LinkedList object to store the Person objects and
	 * sets resName, phone, and count attributes
	 *@param phone String phone number to be set
	 */
	public Reservation(String phone) {
		party = new LinkedList<>();
		this.resName = "";
		this.phone = formatPhone(phone);
		this.count = 0;
	}
	
	/**
	 * this constructor accepts a lastname and phone number to create a reservation. 
	 *@param lName String last name of the reservation
	 *@param phone String phone number to be set
	 */
	public Reservation(String lName, String phone) {
		party = new LinkedList<>();//linked list for each party of people
		this.resName = lName;
		this.phone = formatPhone(phone);//format (555) 555-555
		this.count = 0;
	}	

	/**
	 *Adds a person to the party linked list
	 * @param name String name of person object
	 * @param age int age of person object
	 */
	public void addPerson(Person person) {
		//Person person = new Person(name, age);
		party.add(person);		
		count += 1;
	}
	
	/**
	 * This method formats a phone number
	 * it takes the input and removes all special characters.
	 * It then reformats to include parenthesis and space and hyphen
	 * @param number String phone number to be formatted
	 * @return result String of formatted phone number
	 */
	public String formatPhone(String number) {
		String result = number.replaceAll("[^0-9]","");
		result = result.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return result;
	}	
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}	

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = formatPhone(phone);
	}

	/**
	 * @return the resName
	 */
	public String getResName() {
		return resName;
	}

	/**
	 * @param resName the resName to set
	 */
	public void setResName(String resName) {
		this.resName = resName;
	}
	
	/**
	 * @return the party
	 */
	public LinkedList<Person> getParty() {
		return party;
	}
	
	/**
	 * This method displays the the reservation and the contents of the party LinkedList
	 * @return result String of Reservation objects and linkedList
	 */
	public String printParty() {
		String result = "Reservation name: " + getResName() + "\n" +
				"Phone number: " + getPhone() + "\n";
		for (Person person : party) {
			result += person.toString() + "\n";
		}return result;
	}	
	
	
	
	
}

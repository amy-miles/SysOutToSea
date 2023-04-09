package model;

import java.util.LinkedList;
import java.util.Random;

/**************************************************************
* Name        : 
* Author      : Amy Miles
* Created     : Apr 8, 2023
* Course      : CIS 152 Data Structures
* Version     : 20H2
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  list and describe
*               Output: list and describe
* Big O		  : 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.
* = r.nextInt(MAX_LINE_SIZE  - MIN_LINE_SIZE ) + MIN_LINE_SIZE;         
***************************************************************/

public class Reservation {
	
	private LinkedList<Person> party;//for list of people objects
	private int count;
	private String phone;
	private String resName;	
	
	
	public Reservation(String lName, String phone) {
		party = new LinkedList<>();
		this.resName = lName;
		this.phone = formatPhone(phone);
		this.count = 0;
	}	

	/**
	 *Adds a person to the party linked list
	 * @param person
	 */
	public void addPerson(Person person) {
		party.add(person);
		count += 1;
	}
	
	/**
	 * Removes a person from the linkedlist
	 * @param person to be removed
	 */
	public void deletePerson(Person person) {
		party.remove(person);
	}	
	
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
		this.phone = phone;
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
	 * @param party the party to set
	 */
	public void setParty(LinkedList<Person> party) {
		this.party = party;
	}

	public void addReservation(Reservation reserve) {
		//calls the method from Boat object
	}

	public String printParty() {
		String result = "Reservation name: " + getResName() + "\n" +
				"Phone number: " + getPhone() + "\n";
		for (Person person : party) {
			result += person.toString() + "\n";
		}return result;
	}
	
	public void run() {
		//create boats and add default reservations
		
		//prompts for user reservation
	}
	
	
}

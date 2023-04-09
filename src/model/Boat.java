package model;

import java.util.LinkedList;

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
***************************************************************/

public class Boat {
	
	private String name;
	private int capacity;
	private LinkedList<Person> party;
	private int remaining;
	
	public Boat() {
		
	}
	
	public Boat(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.party = new LinkedList<>();
		this.remaining = capacity;
	}
	
	public boolean isFull() {
		return remaining == 0;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void addPerson(Person person) {
		party.add(person);
		remaining -= 1;
	}
	
	public void deletePerson(Person person) {
		party.remove(person);
	}
	
	/**
	 * @return the remaining
	 */
	public int getRemaining() {
		return remaining;
	}

	/**
	 * @param remaining the remaining to set
	 */
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public String printParty() {
		String result = "";
		for (Person person : party) {
			result += person.toString() + "\n";
		}return result;
	}
	
}

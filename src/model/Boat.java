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
	
	private String name;//name of the boat object
	private int capacity;//capacity of boat
	private LinkedList<LinkedList<Person>> manifest;	
	private int remaining;//to keep track of remaining capacity
	
	/**
	 * Default Constructor
	 */
	public Boat() {
		
	}
	
	/**
	 * Parameterized constructor
	 *@param name String name of boat object
	 *@param capacity Integer of number of people objects
	 */
	public Boat(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		manifest = new LinkedList<>();		
		this.remaining = capacity;
	}	
	
	/**
	 * @return true if full
	 */
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
	
	/**
	 * @return the manifest
	 */
	public LinkedList<LinkedList<Person>> getManifest() {
		return manifest;
	}

	/**
	 * @param manifest the manifest to set
	 */
	public void setManifest(LinkedList<LinkedList<Person>> manifest) {
		this.manifest = manifest;
	}

	public void addReservation(Reservation reserve) {
		//to do : add logic if full and to go to next boat
		//return "fully booked" if no room on any boat
		manifest.add(reserve.getParty());//adds the party linked list 
		remaining = capacity - reserve.getCount();//subtracts reservation count from capacity
	}
	
	//to do 
	//add a print manifest statement

	
}

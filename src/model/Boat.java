package model;

import java.util.LinkedList;

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
 * This class contains the attributes and functions for the boat class
 * The main attribute is the manifest linked list that is made of 
 * reservation objects. It accepts a reservation as long as there is room in the boat. 
 */
public class Boat {
	
	private String name;//name of the boat object
	private int capacity;//capacity of boat
	private LinkedList<Reservation> manifest;	
	private int remaining;//to keep track of remaining capacity
	
	/**
	 * Default Constructor
	 */
	public Boat() {
		
	}
	
	/**
	 *Parameterized constructor
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

	/*
	 * This method checks to see if the boat will fit the number
	 * of people in the reservation
	 * @param num Integer number of people in reservation
	 */
	public boolean checkCapacity(int num) {
		if (this.remaining >= num) {
			return true;
		}else return false;
	}
	
	/**
	 * this method adds a reservation object. It checks if the capacity
	 * of the boat isFull() if not full, evaluates the remaining capacity
	 * and the count of the reservation. If the capacity will accommodate the 
	 * count, the reservation is added. 
	 * @param reserve the reservation object
	 * @throws NoCapacityException throws exception if the capacity remaining will not accommodate the new reservation
	 * @throws BoatFullException throws exception if the capacity is zero
	 */
	public void addReservation(Reservation reserve) throws NoCapacityException, BoatFullException{
		if(!isFull()) {
			if (getRemaining() >= reserve.getCount()) {
				manifest.add(reserve);
				remaining = capacity - reserve.getCount();//subtracts reservation count from capacity
			}else throw new NoCapacityException("Not enough room to accommodate your party.");
		}else throw new BoatFullException("Boat is fully booked!");
	}
	
	/**
	 * This method returns a String containing the name of boat, and calls the printParty()
	 * method to print the names and ages and special considerations, if exists
	 * @return result 
	 */
	public String displayManifest() {
		String result = "Manifest of " + getName() + "\n";
		for (Reservation res: manifest) {//for each reservation, print the party linked list of Persons
			result += res.printParty() + "************************" + "\n";//concat to result String
		}
		
		return result;
	}

	
}

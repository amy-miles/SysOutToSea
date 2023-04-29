package model;

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
 * This class in essentially a node class for the party linked list 
 * in the Reservation class
 */
public class Person {

	//members
	private String name;
	private int age;		
	private boolean considerations = false;//default
	private String considerText;//special considerations text info
	
	/**
	 * Default constructor
	 */
	public Person() {
		
	}
	
	/**
	 * Parameterized constructor
	 *@param name String name of person
	 *@param age int age of person 
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	/**
	 *@return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the considerations
	 */
	public boolean isConsiderations() {
		return considerations;
	}
	/**
	 * @param considerations the considerations to set
	 */
	public void setConsiderations(boolean considerations) {
		this.considerations = considerations;
	}
	/**
	 * @return the considerText
	 */
	public String getConsiderText() {
		return considerText;
	}
	/**
	 * @param considerText the considerText to set
	 */
	public void setConsiderText(String considerText) {
		this.considerText = considerText;
	}
	@Override
	public String toString() {
		if (isConsiderations()) {
			return getName() + " " + getAge() + " " + " Special Considerations: " +
					getConsiderText();
		}else
		return getName() + " " + getAge() + " years";
	}
	
	
	
	
	
	
}

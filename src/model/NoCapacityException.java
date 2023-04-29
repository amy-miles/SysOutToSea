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

public class NoCapacityException extends Exception{
	/**
	 * This exception calls the super exception class and sets the message to display
	 *@param message the String that is set for the message attrubute
	 */
	public NoCapacityException (String message) {
		super(message);
	}
}

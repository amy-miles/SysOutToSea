package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**************************************************************
* Name        : Sysout to Sea
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
 * This class has the methods to validate user input
 */
public class Validate {
	
	/**
	 * Default constuctor
	 */
	public Validate() {
		
	}
	/**
	 * This method validates input for "yes" or "no", case sensitive
	 * @param str String to be evaluated
	 * @return true if "yes" or "no"
	 */
	public boolean validateYN(String str) {
		String pattern = "^(?:yes|no)$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	/**
	 * This method validates input for digits only
	 * @param str String to be evaluated
	 * @return true if only digits
	 */
	public boolean validateNumOnly(String str) {
		String pattern = "[0-9]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	/**
	 * This method validates the phone number input
	 * User may enter any format of phone number with special 
	 * characters. It removes special characters and checks for 
	 * ten digits
	 * @param str String to be evaluated
	 * @return true if String contains 10 digits
	 */
	public boolean validatePhone(String str) {
		String onlyDig = str.replaceAll("[^0-9]","");
		String pattern = "\\d{10}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(onlyDig);
		return m.matches();
	}
}

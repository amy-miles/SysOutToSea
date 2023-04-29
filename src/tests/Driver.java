package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.*;


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
* 				
* Big O		  : O(n)
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class Driver {


	public static void main(String[] args) throws IOException {
		//create a boat object
		Boat boat = new Boat("Sting Array", 4);
		//Create a scanner object to get input from user
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many reservations would you like to make?");
		int numRes = in.nextInt();
		
		//looping for each reservation
		for (int i = 0; i < numRes; i++) {
			//find out if there is enough room in boat for reservation 
			System.out.println("How many people in the party?");
			int num = in.nextInt();
			if(boat.checkCapacity(num)) {//if enough room, proceed with reservation
				//reservation input from user
				System.out.println("Enter the last name of the reservation:");
				String lastName = in.next();
				System.out.println("Enter the phone number:");
				String phoneNum = in.next();
				
				//create the reservation with user input parameters
				Reservation res = new Reservation(lastName, phoneNum);
				//looping to get names, ages, and special considerations of passengers
				for (int j = 0; j < num; j++) {
					System.out.println("Enter the name of the passenger:");
					String name = in.next();
					System.out.println("Enter the age of the passenger:");
					String ageStr = in.next();
					int age = Integer.parseInt(ageStr);//convert String to int
					
					Person person = new Person(name, age);//create person with params
					
					System.out.println("Does the passenger have any special considerations? Enter 'yes or 'no'");
					String consider = in.next();
						if (isValid(consider)) {
							if (consider.equals("yes")) {
								person.setConsiderations(true);
								System.out.println("Please enter the special consideration.");
								String conText = in.next();
								person.setConsiderText(conText);								
							}else break;
						}
						
					res.addPerson(person);
				}
				
				//add reservation
				try {
					boat.addReservation(res);
				} catch (NoCapacityException e) {
					System.out.println(e.getMessage());					
				} catch (BoatFullException e) {
					System.out.println(e.getMessage());
				}
			}
			else {System.out.println("The boat cannot accommodate this size of party.");}
			
		}
		
		//after the reservations are added, print out manifest
		System.out.println(boat.displayManifest());

		in.close();
		
		
	}
	
	/*
	 * This method evaluates a string for a valid input yes or no
	 */
	static boolean isValid(String str) {
		return str.equals("yes") || str.equals("no");
	}
	
	


}


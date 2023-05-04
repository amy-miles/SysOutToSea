package tests;
import java.io.IOException;
import java.util.Scanner;
import model.*;


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
		/*
		 * You may change the capacity of the boat to see the 
		 * functionality of the program without having to enter
		 * so many names. If you put the capacity at 0, 
		 * you will not be able to make a reservation, as the 
		 * capacity is checked before a reservation object is made.
		 * The program will prompt user for how many reservations 
		 * they would like to input. This number is used to loop and 
		 * ask user for reservation input.If the capacity is enough to 
		 * accommodate all reservations, the program displays the manifest, 
		 * or the results of all reservation inputs. If the capacity is 
		 * not enough to accommodate all reservations,the program informs
		 *  user and displays the accepted reservations. 
		 */
		int capacity = 4;//you may change this 
		
		Boat boat = new Boat("Sting Array", capacity);
		
		/*validation class object to use validation methods
		for user input*/
		Validate validator = new Validate(); 
		
		//Create a scanner object to get input from user
		Scanner in = new Scanner(System.in);		
		
		System.out.println("How many reservations would you like to make?");
		String numRes = in.next();
		//validate the user input for numbers only
		while(!validator.validateNumOnly(numRes)) {
			System.out.println("Not valid input. How many reservations would you "
					+ "like to enter?");
			numRes = in.next();
		}
		
		//must change the input(String) to an Integer
		int resCount = Integer.parseInt(numRes);		
		
		//looping for each reservation
		for (int i = 0; i < resCount; i++) {
			//find out if there is enough room in boat for reservation 
			System.out.println("How many people in the party?");
			String num = in.next();
			//validate user input for numbers only
			while(!validator.validateNumOnly(num)) {
				System.out.println("Not valid input. How many people in your "
						+ "party?");
				num = in.next();
			}
			
			//must change the input(String) to an Integer
			int partyNum = Integer.parseInt(num);
			
			//check capacity
			if(boat.checkCapacity(partyNum)) {//if enough room, proceed with reservation
				//reservation input from user
				System.out.println("Enter the last name of the reservation:");
				String lastName = in.next();
				System.out.println("Enter the ten digit phone number:");
				String phoneNum = in.next();
				//validate phone number input for 10 digits
				while(!validator.validatePhone(phoneNum)) {
					System.out.println("Not a valid phone number. Enter the ten digit "
							+ "phone number.");
					phoneNum = in.next();
				}
				
				//create the reservation with user input parameters
				Reservation res = new Reservation(lastName, phoneNum);
				//looping to get names, ages, and special considerations of passengers
				for (int j = 0; j < partyNum; j++) {
					System.out.println("Enter the name of the passenger:");
					String name = in.next();
					System.out.println("Enter the age of the passenger:");
					String ageStr = in.next();
					int age = Integer.parseInt(ageStr);//convert String to int
					
					Person person = new Person(name, age);//create person with params
					
					System.out.println("Does the passenger have any special considerations? Enter 'yes' or 'no'");
					String consider = in.next();
					
					//validating input to "yes" or "no", case sensitive
					while(!validator.validateYN(consider)) {
						System.out.println("Not valid input. Enter 'yes' or 'no'");
						consider = in.next();
					}
							/*
							 * Setting flag for considerations. The true flag
							 * will cause the special considerations to be printed
							 */
							if (consider.equals("yes")) {
								person.setConsiderations(true);
								System.out.println("Please enter the special consideration.");
								String conText = in.next();
								person.setConsiderText(conText);								
							}						
						
					res.addPerson(person);
				}
				
				/*add reservation 
				capacity was checked before reservation object made,
				shouldn't throw exception*/
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

}


package tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.*;


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

public class Driver {

	/**
	 * Description of method
	 * @param paramName
	 * @return
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Boat sysOut = new Boat("SysOut to Sea", 12);
		Boat sting = new Boat("Sting Array", 16);
		Boat sea = new Boat("Sea++", 12);
		
		Reservation res = new Reservation("Miles", "515 512 6039");
		Person one = new Person("John Miles", 55, 0);
		Person two = new Person("Amy Miles", 53, 0);
		res.addPerson(one);
		res.addPerson(two);
		System.out.println(res.getPhone());
		System.out.println(res.printParty());
		sysOut.addReservation(res);
		System.out.println(sysOut.getRemaining());
		
	}
	


}


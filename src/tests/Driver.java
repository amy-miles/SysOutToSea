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
		Person person1 = new Person("Amy", 53, 0);
		Person person2 = new Person("John", 55, 0);
		Person person3 = new Person("Zac", 33, 0);
		person3.setConsiderText("Wheelchair");
		person3.setConsiderations(true);
		Boat myBoat = new Boat("SysOut to Sea", 4);
		myBoat.addPerson(person1);
		myBoat.addPerson(person2);
		myBoat.addPerson(person3);
		//System.out.println(person1.toString());
		//myBoat.deletePerson(person2);
		
		BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
		Person person4 = new Person();
		System.out.println(myBoat.getName());
		person4.setName(reader.readLine());
		myBoat.addPerson(person4);
		System.out.println(myBoat.printParty());
		System.out.println(myBoat.getRemaining());
	}

}

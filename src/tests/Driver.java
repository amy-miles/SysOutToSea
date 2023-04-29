package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
		//Boat sting = new Boat("Sting Array", 2);
		Reservation res = new Reservation("ResName" , "5555555555");
		
	    
				
		String actual, expected;
		expected = "Reservation Name: LastName" + "\n"
				+ "Phone number: (555) 555-5555" + "\n"
				+ "PersonName 10 years" + "\n";
	
		res.addPerson("PersonName", 10);
		System.out.println(res.printParty());
	
		
	}
	


}


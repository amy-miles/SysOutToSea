package tests;

import model.Person;

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
	 */
	public static void main(String[] args) {
		Person person = new Person("Amy", 0, 8);
		System.out.println(person.getAge());
		System.out.println(person.toString());
		person.setConsiderations(false);
		person.setConsiderText("Wheelchair");
		System.out.println(person.toString());
	}

}

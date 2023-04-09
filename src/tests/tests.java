package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

class tests {

	@Test
	void testCreatePerson() {
		//arrange
		Person person = new Person();
		//assert
		assertNotNull(person);
	}
	
	@Test
	void testGetSetNamePerson() {
		Person person = new Person();
		String expected, actual;
		expected = "Amy";
		//act
		person.setName("Amy");
		actual = person.getName();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetSetYears() {
		//arrange
		Person person = new Person();
		String expected, actual;
		expected = "53";
		//act		
		person.setYears(53);
		actual = String.valueOf(person.getYears());
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetSetMonths() {
		//arrange
		Person person = new Person();
		String expected, actual;
		expected = "10";
		//act		
		person.setMonths(10);
		actual = String.valueOf(person.getMonths());
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetSetConsiderations() {
		//arrange
		Person person = new Person();
		//act
		person.setConsiderations(true);
		//assert
		assertTrue(person.isConsiderations());
	}
	
	@Test
	void testToString() {
		//arrange
		Person person = new Person("Amy", 53, 0);
		String expected, actual;
		expected = "Amy 53 years";
		//act
		actual = person.toString();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testCreateBoat() {
		//arrange
		Boat boat = new Boat();
		//assert
		assertNotNull(boat);
	}
	
	@Test
	void testGetSetNameBoat() {
		//arrange
		Boat boat = new Boat();
		String expected, actual;
		expected = "Sting Array";
		//assert
		boat.setName("Sting Array");
		actual = boat.getName();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetSetCapacity() {
		//arrange
		Boat boat = new Boat();
		int expected, actual;
		expected = 12;
		//assert
		boat.setCapacity(12);
		actual = boat.getCapacity();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testAddDeletePerson() {
		Boat boat = new Boat("Sting Array", 12);
		Person amy = new Person("Amy", 53, 0);
		Person john = new Person("John", 55, 0);
		String actual, expected;
		expected = "Amy 53 years";
		//act
		boat.addPerson(john);
		boat.addPerson(amy);
		boat.deletePerson(john);
		actual = boat.printParty();
	}
	
	

}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

class tests {
	//person class tests//
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
	void testGetSetAge() {
		//arrange
		Person person = new Person();
		String expected, actual;
		expected = "53";
		//act		
		person.setAge(53);
		actual = String.valueOf(person.getAge());
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
		Person person = new Person("Amy", 53);
		String expected, actual;
		expected = "Amy 53 years";
		//act
		actual = person.toString();
		//assert
		assertEquals(actual, expected);
	}
	
	//Boat class tests//
	@Test
	void testCreateBoat() {
		//arrange
		Boat boat = new Boat();
		//assert
		assertNotNull(boat);
	}
	
	@Test
	void testGetSetName() {
		//arrange
		Boat boat = new Boat();
		String actual, expected;
		expected = "Boat";
		//act
		boat.setName("Boat");
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
	void testIsFullTrue() {
		//arrange
		Boat boat = new Boat("Boat", 6);
		//act
		boat.setRemaining(0);
		//assert
		assertTrue(boat.isFull());
	}
	
	@Test
	void testIsFullFalse() {
		//arrange
		Boat boat = new Boat("Boat", 6);
		//act
		boat.setRemaining(4);
		//assert
		assertFalse(boat.isFull());
	}
	
	@Test
	void testGetSetRemaining() {
		//arrange
		Boat boat = new Boat();
		int expected, actual;
		expected = 4;
		//assert
		boat.setRemaining(4);
		actual = boat.getRemaining();
		//assert
		assertEquals(actual, expected);
	}
		
	@Test
	void testAddReservation() throws NoCapacityException, BoatFullException{
		//arrange
		Boat boat = new Boat("Boat", 4);
		Reservation res = new Reservation("5155555555");		
		//act
		boat.addReservation(res);
		//assert
		assertNotNull(boat.displayManifest());
	}
	
	@Test
	void testAddReservationThrowsNoCapExc() throws NoCapacityException, BoatFullException{
		//arrange
		Boat boat = new Boat("Boat", 4);
		Reservation res = new Reservation("5155555555");
		//act
		res.setCount(5);		
		assertThrows(NoCapacityException.class, () -> boat.addReservation(res));
	}
	
	@Test
	void testAddReservationThrowsBoatFullExc() throws NoCapacityException, BoatFullException{
		//arrange
		Boat boat = new Boat("Boat", 4);
		Reservation res = new Reservation("5155555555");
		//act
		boat.setRemaining(0);
		res.setCount(2);		
		assertThrows(BoatFullException.class, () -> boat.addReservation(res));
	}
	
	@Test
	void testDisplayManifest() throws NoCapacityException, BoatFullException{
		//arrange
		Boat boat = new Boat("Boat", 4);
		Reservation res = new Reservation("5155555555");
		Person person = new Person("Amy", 20);
		String actual, expected;
		expected = "Manifest of Boat" + "\n" + "Reservation name: " + "\n"
				+ "Phone number: (515) 555-5555" + "\n" 
				+ "Amy 20 years" + "\n" + "************************" + "\n";
		//act
		res.addPerson(person);
		boat.addReservation(res);
		actual = boat.displayManifest();
		//assert
		assertEquals(actual, expected);
	}
	
	//Reservation class tests//
	@Test
	void testCreateReservationPhone() {
		//arrange
		Reservation res = new Reservation("5555555555");
		//assert
		assertNotNull(res);
	}
	
	@Test
	void testCreateReservationPhoneLastName() {
		//arrange
		Reservation res = new Reservation("LastName", "5555555555");
		//assert
		assertNotNull(res);
	}
	
	@Test
	void testAddPerson() {
		//arrange
		Reservation res = new Reservation("LastName", "5555555555");
		Person person = new Person("PersonName", 10);
		String actual, expected;
		expected = "[PersonName" + " " + "10 years]";
		//act
		res.addPerson(person);
		actual = res.getParty().toString();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testFormatPhone() {
		//arrange
		Reservation res = new Reservation("5555555555");
		String actual, expected;
		expected = "(555) 555-5555";
		//act
		actual = res.getPhone();
		//assert
		assertEquals(actual, expected);		
	}
	
	@Test
	void testGetSetCount() {
		//arrange
		Reservation res = new Reservation("5555555555");
		int actual, expected;
		expected = 12;
		//act
		res.setCount(12);
		actual = res.getCount();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetSetPhone() {
		//arrange
		Reservation res = new Reservation("5555555555");
		String actual, expected;
		expected = "(555) 555-5555";
		//act
		res.setPhone("5555555555");
		actual = res.getPhone();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetSetResName() {
		//arrange
		Reservation res = new Reservation("5555555555");
		String actual, expected;
		expected = "ResName";
		//act
		res.setResName("ResName");
		actual = res.getResName();
		//assert
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetParty() {
		//arrange
		Reservation res = new Reservation("LastName", "5555555555");
		Person person = new Person("PersonName", 10);
		String actual, expected;
		expected = "[PersonName" + " " + "10 years]";
		//act
		res.addPerson(person);
		actual = res.getParty().toString();
		//assert
		assertEquals(actual, expected);
		
	}
	
	@Test
	void testPrintParty() {
		//arrange
		Reservation res = new Reservation("ResName", "5555555555");	
		Person person = new Person("PersonName", 10);
		String actual, expected;
		expected = "Reservation name: ResName" + "\n"
				+ "Phone number: (555) 555-5555" + "\n"
				+ "PersonName 10 years" + "\n";
		//act
		res.addPerson(person);
		actual = res.printParty();
		//assert
		assertEquals(actual, expected);
	}
}

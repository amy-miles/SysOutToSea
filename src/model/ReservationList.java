package model;

import java.util.LinkedList;
import java.util.Random;

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
* = r.nextInt(MAX_LINE_SIZE  - MIN_LINE_SIZE ) + MIN_LINE_SIZE;         
***************************************************************/

public class ReservationList {
	
	private LinkedList<Boat> resList;
	
	public ReservationList() {
		resList = new LinkedList<>();
	}
	
	public void createBoats() {
		ReservationList list = new ReservationList();
		Boat sysout = new Boat("SysOut to Sea", 12);
		Boat sting = new Boat("Sting Array", 12);
		Boat oop = new Boat("O.O.P. Yeah You Know Me!", 12);
		
		
	}
	

}

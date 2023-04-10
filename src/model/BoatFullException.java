package model;

/**************************************************************
* Name        : 
* Author      : Amy Miles
* Created     : Apr 10, 2023
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

public class BoatFullException extends Exception{
	public BoatFullException (String message) {
		super(message);
	}
}

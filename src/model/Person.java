package model;

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
//Node Class
public class Person {

	//members
	private String name;
	private String age;

	private int years = 0;//default
	private int months = 0;//default
	private boolean considerations = false;//default
	private String considerText;//special considerations text info
	
	/**
	 * Default constructor
	 */
	public Person() {
		
	}
	
	/**
	 * Parameterized constructor
	 *@param name String name of person
	 *@param years Integer age of person in years
	 *@param months Integer age of person in months
	 */
	public Person(String name, int years, int months) {
		this.name = name;
		this.years = years;
		this.months = months;	
	}
	
	/**
	 * Returns the age of the person in years and months,
	 * since some ages of youth will be entered as months
	 * @return the age
	 */
	public String getAge() {
		if (getMonths() == 0){
			return getYears() + " years";
		}
		else
		return getMonths() + " months";
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the years
	 */
	public int getYears() {
		return years;
	}
	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}
	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}
	/**
	 * @param months the months to set
	 */
	public void setMonths(int months) {
		this.months = months;
	}

	/**
	 * @return the considerations
	 */
	public boolean isConsiderations() {
		return considerations;
	}
	/**
	 * @param considerations the considerations to set
	 */
	public void setConsiderations(boolean considerations) {
		this.considerations = considerations;
	}
	/**
	 * @return the considerText
	 */
	public String getConsiderText() {
		return considerText;
	}
	/**
	 * @param considerText the considerText to set
	 */
	public void setConsiderText(String considerText) {
		this.considerText = considerText;
	}
	@Override
	public String toString() {
		if (isConsiderations()) {
			return getName() + " " + getAge() + " " + " Special Considerations: " +
					getConsiderText();
		}else
		return getName() + " " + getAge() ;
	}
	
	
	
	
	
	
}

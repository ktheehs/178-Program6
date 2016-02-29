/*
* File name: Person.java
*
* Programmer: Kevin Theehs
* ULID: ktheehs
*
* Date: Feb 24, 2016
*
* Class: IT 178
* Lecture Section: 002
* Lecture Instructor: Sikolia
* 
*/
package edu.ilstu;

/**
 *
 * Stores people's names, used in other classes.
 * 
 * @author ktheehs
 *
 */
public class Person {
	
	//Constructors
	private String name;
	
	public Person() {
		
		name = "No name yet";
	}

	public Person(String initialName) {
		name = initialName;
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	
	public String getName() {
		return name;
		
	}
	
	
	
	/*
	 * Writes name output to console
	 */
	public void writeOutput() {
		System.out.println("Name: " + name);
	}
	
	/*
	 * Checks if a person has the same name as another person in a different object
	 */
	public boolean hasSameName(Person otherPerson) {
		
		
		return this.name.equalsIgnoreCase(otherPerson.name);
		
	}
	
	
}

/*
* File name: Faculty.java
*
* Programmer: Kevin Theehs
* ULID: ktheehs
*
* Date: Feb 28, 2016
*
* Class: IT 178
* Lecture Section: 002
* Lecture Instructor: Sikolia
* 
*/
package edu.ilstu;

/**
 *
 * Tracks faculty members, super is Employee
 * 
 * @author ktheehs
 *
 */
public class Faculty extends Employee {
	
	private String title;

	/**
	 * 
	 */
	public Faculty() {
		super();
		title = "Unknown title";
	}
	
	public Faculty(String name, int Id, String department, String title) {
		super(name, Id, department);
		this.title = title;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Title: " + title);
	}

}

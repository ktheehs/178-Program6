/*
* File name: Staff.java
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
 * Tracks non-faculty staff members, super is Employee
 * 
 * @author ktheehs
 *
 */
public class Staff extends Employee {
	
	private int payGrade;

	/**
	 * 
	 */
	public Staff() {
		super();
		payGrade = 0;
	}
	
	public Staff(String name, int Id, int payGrade, String department) {
		super(name, Id, department);
		this.payGrade = payGrade;
	}

	public int getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Paygrade: " + payGrade);
	}
	
	

}

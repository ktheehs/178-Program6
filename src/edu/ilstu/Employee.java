/*
* File name: Employee.java
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
 * An Employee that keeps track of ID and department.
 * 
 * @author ktheehs
 *
 */
public class Employee extends Person {
	
	private int employeeID;
	private String employeeDept;

	
	//Constructors
	public Employee() {
		super();
		employeeID = 0;
		employeeDept = "Unknown Department";
	}
	
	public Employee(String name) {
		super(name);
	}
	
	public Employee(String name, int employeeID, String employeeDept) {
		
		super(name);
		this.employeeID = employeeID;
		this.employeeDept = employeeDept;
	}
	
	public Employee(String name, int employeeID) {
		super(name);
		this.employeeID = employeeID;
		employeeDept = "Unknown Department";
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	
	public void writeOutput() {
		
		super.writeOutput();
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + employeeDept);
		
		
		
	}
	

}

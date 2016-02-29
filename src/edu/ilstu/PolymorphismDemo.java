/*
* File name: PolymorphismDemo.java
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
* Modified class from textbook: tests the Undergrad, Student, Faculty, and Staff classes.
* 
* @author ktheehs
*
*/
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Person[] people = new Person[6];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		people[4] = new Faculty("Anderson, John", 3345, "Marketing", "Professor of Digital Media Marketing");
		people[5] = new Staff("Roberts, Amy", 5094, 9, "Psychology");

		
		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}

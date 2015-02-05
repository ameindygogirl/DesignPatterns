/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
public class Student
{
	private int studentID;
	private String firstName;
	private String lastName;
	private double gpa;
	private String major;
	
	public Student(int ID, String first, String last, double gpa, String major)
	{
		this.studentID = ID;
		this.firstName = first;
		this.lastName = last;
		this.gpa = gpa;
		this.major = major;
	}
	
	@Override
	public String toString()
	{
		return this.lastName + ", " + this.firstName;
	}
}

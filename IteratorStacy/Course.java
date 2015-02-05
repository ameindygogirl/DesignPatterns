/*
Team: The Nikola Teslas
Members: Ryan Babcock, Stacy Carlson, and Laura Humphreys 
*/
import java.util.ArrayList;
import java.util.Iterator;


public class Course implements Iterable<Student>
{
	private ArrayList<Student> studentList;
	private int courseID;
	private String courseName;
	private String profName;
	
	public Course(int ID, String course, String prof)
	{
		this.courseID = ID;
		this.courseName = course;
		this.profName = prof;
		this.studentList = new ArrayList<Student>();
	}
	
	public void registerStudent(int ID, String first, String last, double gpa, String major)
	{
		Student s = new Student(ID, first, last, gpa, major);
		studentList.add(s);
	}
	
	
	@Override
	public Iterator<Student> iterator()
	{
		return new CourseIterator(studentList);
	}

}
